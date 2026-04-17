package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AC_Excel_Fetching_Data {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("E:\\HRMS Project\\Method_Yet_Learn.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
 		XSSFSheet sheet = workbook.getSheet("Method");			 //sheet name in the excel
 		System.out.println(sheet.getSheetName());
 		System.out.println(sheet.getLastRowNum());
 		System.out.println("Before updating the Cell drtails :-" +sheet.getRow(3).getCell(2));
 		//writing the data into the excel
 		XSSFCell cell = sheet.getRow(3).getCell(2);
 		cell.setCellValue("Robot");
 		file.close();
 		FileOutputStream fileout = new FileOutputStream("E:\\HRMS Project\\Method_Yet_Learn.xlsx");
 		workbook.write(fileout);
 		System.out.println("Data has been updated : "+cell.getStringCellValue());
 		fileout.close();
 		
	}

}
