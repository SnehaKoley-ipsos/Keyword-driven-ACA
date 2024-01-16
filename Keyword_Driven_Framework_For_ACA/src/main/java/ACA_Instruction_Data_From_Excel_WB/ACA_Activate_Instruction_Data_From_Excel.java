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

	public static ArrayList<String> read_Excel_Instruction_Data() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Miriyala.Yamini\\Documents\\GitHub\\keyword_driven_framework_for_aca\\Instruction_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Row row = sheet.getRow(1);
		//Cell cell = row.getCell(4);
		//System.out.println("List: " + cell);
		
		Iterator<Row> row = sheet.rowIterator(); 
		row.next();
		
		ArrayList <String> a = new ArrayList<String>();
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
				a.add(data);
				a.add(((Row)row.next()).getCell(colNo).getStringCellValue());
			}
		}
		//System.out.println("read_Excel_Instruction_Data: " + a);
		
		return a;
	}
		
	public void Demofile(int i) {
		// TODO Auto-generated method stub
	}
}
