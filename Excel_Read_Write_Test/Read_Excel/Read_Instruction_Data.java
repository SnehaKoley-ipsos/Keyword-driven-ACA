package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Iterator; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_Instruction_Data {

	public void read_Excel_Instruction_Data(int colNo) throws IOException {
		
		//String filePath = FrameworkConstants.filepath;
		//File file = new File(filePath);
		// Create an object of FileInputStream class and pass file as parameter to its constructor.
		FileInputStream fis = new FileInputStream("C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Instruction_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(4);
		
		System.out.println("List: " + cell);
		
//		Iterator row = sheet.rowIterator(); 
//		row.next();
		
//		ArrayList <String> a = new ArrayList();
		// Checking the next element availability using the reference variable row.
//		while(row.hasNext())
//		{
//			Row r = (Row)row.next();
//			// Moving cursor to the cell by getting a cell number.
//			Cell c = r.getCell(colNo);
//			String data = c.getStringCellValue();
//			a.add(data);
//			a.add(((Row)row.next()).getCell(colNo).getStringCellValue());			
//		}
		//System.out.println("List: " + a);
		// Return the data to the Arraylist method.
		//return a;
	}
	
	public void Demofile(int i) {
		// TODO Auto-generated method stub
	}
}
