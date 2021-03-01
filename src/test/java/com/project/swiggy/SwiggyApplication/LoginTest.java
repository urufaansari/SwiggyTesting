package com.project.swiggy.SwiggyApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import BaseClass.BaseTest;

public class LoginTest extends BaseTest{

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFRow Row;

	// FilePath="C:\\Users\\Urufa\\Desktop\\simpli Learn\\Phase
	// 2\\TestngExcelExample\\userinfo.xlsx";

	public void readExcel(String filepath, String sheetname) throws Exception {
		try {
			FileInputStream file = new FileInputStream(filepath);
			ExcelWBook = new XSSFWorkbook(file);
			ExcelWSheet = ExcelWBook.getSheet(sheetname);

			int start_row = 1;
			int total_rows = ExcelWSheet.getLastRowNum();
			System.out.println("OpenHomePage");

			driver.findElement(By.xpath(
					"/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='_1MdYR']//a[@class='x4bK8']"))
					.click();
			for (int i = start_row; i <= total_rows; i++) {
				Row = ExcelWSheet.getRow(i);
				XSSFCell cellContact = Row.getCell(0);
				int strContact = (int) cellContact.getNumericCellValue();

				XSSFCell cellExpected = Row.getCell(1);
				String strExp = cellExpected.getStringCellValue();

				String actLogin = Login(strContact);
				System.out.println("For Contact Number" + strContact + "Expected result is "+strExp+" And  the act result is " + actLogin);

				XSSFCell cellActual = Row.createCell(2);
				cellActual.setCellValue(actLogin);
				String TCRes = "Fail";
				if (strExp.equalsIgnoreCase(actLogin)) {
					TCRes = "Pass";

				}

				XSSFCell cellTCResult = Row.createCell(3);
				cellTCResult.setCellValue(TCRes);

			}
//Path for Results		
			FileOutputStream outputStream = new FileOutputStream(
					"C:\\Users\\Urufa\\eclipse-workspace\\SwiggyApplication\\test-output\\ResultofLoginData.xlsx");
			ExcelWBook.write(outputStream);
			ExcelWBook.close();

		}

		catch (IOException e) {
			System.out.println("Could not find excel file  ");
			e.printStackTrace();
		}
	}

	public String Login(int strContact) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Urufa\\eclipse-workspace\\TestNGExcel\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.swiggy.com/restaurants");
		/*
		 * System.out.println("OpenHomePage");
		 * 
		 * driver.findElement(By.xpath(
		 * "/html//div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='_1MdYR']//a[@class='x4bK8']"
		 * )) .click();
		 */
		String strContact2 = Integer.toString(strContact);
		driver.findElement(By.xpath("/html//input[@id='mobile']")).sendKeys(strContact2);
		driver.findElement(By.xpath(
				"/html//div[@id='overlay-sidebar-root']//div[@class='_3vi_e']/div[@class='_12S7_']//form//a[@class='a-ayg']"))
				.click();
		//driver.navigate().back();
//	driver.findElement(By.xpath("/html//div[@id='overlay-sidebar-root']//div[@class='_3vi_e']//div[@class='_3pYe-']/span[@class='_22fFW icon-close-thin']")).click();
		//driver.quit();
//		Validation 
		return "Fail";

	}

	@Test
	public void test1() throws Exception {
		readExcel("C:\\Users\\Urufa\\Desktop\\simpli Learn\\swiggy\\LoginData.xlsx", "Data");
	}
}
