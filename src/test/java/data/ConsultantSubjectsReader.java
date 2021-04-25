package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConsultantSubjectsReader {
	static FileInputStream exfile = null;
	public int TotalNumofRows ;
	public FileInputStream getFileInputStream()
	{
		String path = System.getProperty("user.dir")+"/src/test/java/data/SubjectsList.xlsx";
		
		File datafile = new File(path);
		
		try {
			exfile = new FileInputStream(datafile);
		} catch (FileNotFoundException e) {
			
			System.out.println("file not found" + e.getMessage());
		}
		
		return exfile;
	}
	
	public Object[][] getExcelData() throws IOException
	{
		exfile = getFileInputStream();
	XSSFWorkbook wb = new XSSFWorkbook(exfile);
	XSSFSheet sheet = wb.getSheetAt(0);
	
 	TotalNumofRows = (sheet.getLastRowNum() +1);
	int TotalNumofColumns = 1;
	
	String [][] arrayExceldata = new String [TotalNumofRows][TotalNumofColumns];
	
	for (int i = 0; i < TotalNumofRows; i++) {
		
		for (int j = 0; j < TotalNumofColumns; j++) {
			
			XSSFRow row = sheet.getRow(i);
			arrayExceldata[i][j] = row.getCell(j).toString();
			
			
			
		}
		
	}
	wb.close();
	return arrayExceldata;
	
	}

}
