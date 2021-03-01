package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.swiggy.SwiggyApplication.LoginTest;

import Pages.LoginPage;

public class LoginUtils {
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	public static void readExcel(String filepath, String sheetname) throws Exception {
		try {
			FileInputStream file = new FileInputStream(filepath);
			ExcelWBook = new XSSFWorkbook(file);
			ExcelWSheet = ExcelWBook.getSheet(sheetname);

			int start_row = 1;
			int total_rows = ExcelWSheet.getLastRowNum();
			for (int i = start_row; i <= total_rows; i++) {
				Row = ExcelWSheet.getRow(i);
				
				XSSFCell cellContact = Row.getCell(0);
				String strContact = cellContact.getStringCellValue();


				XSSFCell cellExpected = Row.getCell(1);
				String strExp = cellExpected.getStringCellValue();
				
				String actLogin = LoginPage.Login(strContact);
				System.out.println("For "+strContact+"  the act result is "+actLogin);
				
				XSSFCell cellActual = Row.createCell(3);
				cellActual.setCellValue(actLogin);
				String TCRes = "FAIL";
				if (strExp.equals(actLogin)) {
					TCRes = "PASS";		
					
				}
				
				XSSFCell cellTCResult = Row.createCell(4);
				cellTCResult.setCellValue(TCRes);
				
			}
//Path for Results		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Urufa\\Desktop\\simpli Learn\\Phase 2\\TestngExcelExample\\LoginDataResult.xlsx");
		ExcelWBook.write(outputStream);
		ExcelWBook.close();

			

		} 
		
		catch (IOException e) {
			System.out.println("Could not find excel file  ");
			e.printStackTrace();
		}
	}
}

	/*public static String getCellValue(String xl, String Sheet, int r, int c)

	{

		try

		{

			FileInputStream fis = new FileInputStream(xl);

			Workbook wb = WorkbookFactory.create(fis);

			Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

			return cell.getStringCellValue();

		}

		catch (Exception e)

		{

			return "";

		}

	}

	public static XSSFCell createCell(String xl, String Sheet, int r, int c)

	{
		XSSFCell cellActual = Row.createCell(c);

		return cellActual;

	}

	public static int getRowCount(String xl, String Sheet)

	{

		try

		{

			FileInputStream fis = new FileInputStream(xl);

			Workbook wb = WorkbookFactory.create(fis);

			return wb.getSheet(Sheet).getLastRowNum();

		}

		catch (Exception e)

		{

			return 0;

		}

	}

	public static void writeoutput() {
		try {
			
			 * FileOutputStream fos = new
			 * FileOutputStream("C:\\Users\\Urufa\\Desktop\\simpli Learn\\swiggy\\test_output1.xlsx"
			 * ); ExcelWBook.write(fos); ExcelWBook.close();
			 
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Urufa\\Desktop\\simpli Learn\\swiggy\\bla.xlsx");
			ExcelWBook.write(fos);
			fos.close();
			ExcelWBook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
*/