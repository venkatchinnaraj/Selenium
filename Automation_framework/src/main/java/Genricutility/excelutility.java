package Genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author venkat
 */
public class excelutility {
	/**
	 * This method is used to read data from excel file in String format
	 * @param SheetName
	 * @param rowIndex
	 * @param ColumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDatafromExcel(String SheetName,int rowIndex,int ColumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/test case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(rowIndex).getCell(ColumnIndex).getStringCellValue();
	}
	/**
	 * This method is use to read data from excel file in numeric format
	 * @param SheetName
	 * @param rowIndex
	 * @param ColumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDatafromExcel(String SheetName,int rowIndex,int ColumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/test case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return  wb.getSheet(SheetName).getRow(rowIndex).getCell(ColumnIndex).getNumericCellValue();
	}
	/**
	 * This method is use to read data from excel file in boolean format
	 * @param SheetName
	 * @param rowIndex
	 * @param ColumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDatafromExcel(String SheetName,int rowIndex,int ColumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/test case.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(rowIndex).getCell(ColumnIndex).getBooleanCellValue();
		
	}
	/**
	 * This method is use to read data from excel file in dateandtime format
	 * @param SheetName
	 * @param rowIndex
	 * @param ColumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getLocalDateandTime(String SheetName,int rowIndex,int ColumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/test case.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(rowIndex).getCell(ColumnIndex).getLocalDateTimeCellValue();
	}
}
