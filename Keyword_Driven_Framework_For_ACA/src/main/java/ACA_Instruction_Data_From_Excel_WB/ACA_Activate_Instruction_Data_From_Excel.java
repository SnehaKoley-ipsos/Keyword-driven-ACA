package ACA_Instruction_Data_From_Excel_WB;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Iterator; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ACA_Activate_Instruction_Data_From_Excel {
	
	public static String path = System.getProperty("user.dir");
	public static String cellValue_1;
	public static String cellValue_2;
	public static String cellValue_3;
	public static String cellValue_4;
	public static String cellValue_5;
	
	
	public static String Read_LogIn_Data_From_Excel() throws IOException {
		
		FileInputStream fis = new FileInputStream(path + "\\Excel_Data\\LogIn_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
				
		int columnIndex = 4;
		int rowIndex_1 = 1;
		int rowIndex_2 = 2;
		int rowIndex_3 = 3;
		int rowIndex_4 = 4;
		int rowIndex_5 = 5;
		
		Row row_1 = sheet.getRow(rowIndex_1);
		Row row_2 = sheet.getRow(rowIndex_2);
		Row row_3 = sheet.getRow(rowIndex_3);
		Row row_4 = sheet.getRow(rowIndex_4);
		Row row_5 = sheet.getRow(rowIndex_5);
		Cell cell_1 = row_1.getCell(columnIndex);
		Cell cell_2 = row_2.getCell(columnIndex);
		Cell cell_3 = row_3.getCell(columnIndex);
		Cell cell_4 = row_4.getCell(columnIndex);
		Cell cell_5 = row_5.getCell(columnIndex);
        
        // Retrieve the value from the cell		// Assuming the value is a string
        cellValue_1 = cell_1.getStringCellValue();
        cellValue_2 = cell_2.getStringCellValue();
        cellValue_3 = cell_3.getStringCellValue();
        cellValue_4 = cell_4.getStringCellValue();
        cellValue_5 = cell_5.getStringCellValue();
		
        System.out.println("Read_LogIn_Data_From_Excel: " + cellValue_1 + ", " + cellValue_2 + ", " + cellValue_3 + ", " + cellValue_4 + ", " + cellValue_5 );
        
//		Iterator<Row> row = sheet.rowIterator(); 
//		row.next();
//		
//		ArrayList <String> LogIn_Data = new ArrayList<String>();
//		// Checking the next element availability using the reference variable row.
//		while(row.hasNext())
//		{
//			Row r = (Row)row.next();
//			int colNo = 4;
//			// Moving cursor to the cell by getting a cell number.
//			Cell c = r.getCell(colNo);
//			
//			if(c != null)
//			{
//				String data = c.getStringCellValue();
//				LogIn_Data.add(data);
//				//LogIn_Data.add(((Row)row.next()).getCell(colNo).getStringCellValue());
//			}
//		}
		//System.out.println("Read_LogIn_Data_From_Excel: " + LogIn_Data);
		
		return cellValue_1;
	}
	
	public static ArrayList<String> Read_Instances_List_Data_From_Excel() throws IOException {
		
		FileInputStream fis = new FileInputStream(path + "\\Excel_Data\\Instances_List_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator<Row> row = sheet.rowIterator(); 
		row.next();
		
		ArrayList <String> Instances_List_Data = new ArrayList<String>();
		// Checking the next element availability using the reference variable row.
		while(row.hasNext())
		{
			Row r = (Row)row.next();
			int colNo = 2;
			// Moving cursor to the cell by getting a cell number.
			Cell c = r.getCell(colNo);
			
			if(c != null)
			{
				String data = c.getStringCellValue();
				Instances_List_Data.add(data);
				//Instances_List_Data.add(((Row)row.next()).getCell(colNo).getStringCellValue());
			}
		}
		//System.out.println("Read_Instances_List_Data_From_Excel: " + Instances_List_Data);
		
		return Instances_List_Data;
	}

	public static ArrayList<String> Read_Instruction_Data_From_Excel() throws IOException {
		
		FileInputStream fis = new FileInputStream(path + "\\Excel_Data\\Instruction_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Row row = sheet.getRow(1);
		//Cell cell = row.getCell(4);
		//System.out.println("List: " + cell);
		
		Iterator<Row> row = sheet.rowIterator(); 
		row.next();
		
		ArrayList <String> Instruction_Data = new ArrayList<String>();
		// Checking the next element availability using the reference variable row.
		while(row.hasNext())
		{
			Row r = (Row)row.next();
			int colNo = 4;
			// Moving cursor to the cell by getting a cell number.
			Cell c = r.getCell(colNo);
			
			if(c != null)
			{
				String data = c.getStringCellValue();
				Instruction_Data.add(data);
				//Instruction_Data.add(((Row)row.next()).getCell(colNo).getStringCellValue());
			}
		}
		//System.out.println("Read_Instruction_Data_From_Excel: " + Instruction_Data);
		
		return Instruction_Data;
	}
	
	
	
	
		
	public void Demofile(int i) {
		// TODO Auto-generated method stub
	}
}
