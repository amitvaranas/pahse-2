package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFromResultExcel {
	
	public String[] Readname() {
		  String excelname[] = new String[7];
		  String excelprice[] = new String[7];
		
		
		

		String Inpath = "C:\\Users\\shashgu3\\PracAutomation\\TestData\\Resultdata1.xlsx";
		
		
		
		
		FileInputStream inputStream;
	
		try {
			inputStream = new FileInputStream(new File(Inpath));
		
			 Workbook workbook = WorkbookFactory.create(inputStream);
			  Sheet sheet = workbook.getSheet("Sheet1");
			  int lastRowNum = sheet.getLastRowNum();
			  System.out.println(lastRowNum);
			
			  int cnt = 0 ;
			  for(int i=1;i<=lastRowNum ; i++) {
				  Row row = sheet.getRow(i); 
				  Cell cellname = row.getCell(1);
				  String name = cellname.getStringCellValue();
				  System.out.println(name);
				  excelname[cnt]= name;
				  Cell cellprice = row.getCell(2);
				  String price = cellprice.getStringCellValue();
				  System.out.println(price);
				  excelprice[cnt]=price;
				  cnt++;

			  }
//			  return excelname;
			  
			 
			  
//			  Row row = sheet.getRow(1);
//			  Cell cellUN = row.getCell(1);
//			  String strUN = cellUN.getStringCellValue();
//			  System.out.println(strUN);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		FileInputStream name = new FileInputStream(new File(path));
 catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return excelname;
		
		
	 
		
	}
	
	
	
	public String[] Readprice() {
		  String excelname[] = new String[7];
		  String excelprice[] = new String[7];
		
		
		

		String Inpath = "C:\\Users\\shashgu3\\PracAutomation\\TestData\\Resultdata1.xlsx";
		
		
		
		
		FileInputStream inputStream;
	
		try {
			inputStream = new FileInputStream(new File(Inpath));
		
			 Workbook workbook = WorkbookFactory.create(inputStream);
			  Sheet sheet = workbook.getSheet("Sheet1");
			  int lastRowNum = sheet.getLastRowNum();
			  System.out.println(lastRowNum);
			
			  int cnt = 0 ;
			  for(int i=1;i<=lastRowNum ; i++) {
				  Row row = sheet.getRow(i); 
				  Cell cellname = row.getCell(1);
				  String name = cellname.getStringCellValue();
				  System.out.println(name);
				  excelname[cnt]= name;
				  Cell cellprice = row.getCell(2);
				  String price = cellprice.getStringCellValue();
				  System.out.println(price);
				  excelprice[cnt]=price;
				  cnt++;

			  }
			  
			 
			  
//			  Row row = sheet.getRow(1);
//			  Cell cellUN = row.getCell(1);
//			  String strUN = cellUN.getStringCellValue();
//			  System.out.println(strUN);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		FileInputStream name = new FileInputStream(new File(path));
catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return excelprice;
		
	 
		
	}
	
	
	
	
	public static void main(String[] args) {
		ReadFromResultExcel res = new ReadFromResultExcel();
		res.Readname();
		res.Readprice();
	}
	
	
	

}
