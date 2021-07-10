package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataAccess {
	
	static String filepath = "./data/InputData.xlsx";
	DataAccess(){
		
	}
	public void test() throws Exception {
		XSSFWorkbook book = new XSSFWorkbook(filepath);
		XSSFSheet sheet = book.getSheet("ShopDetails");
		
		for (int i=0, j=0; i<sheet.getLastRowNum() && j < 4; i++, j++) {
			String cellValue = sheet.getRow(0).getCell(0).getRawValue();
			System.out.println(cellValue);
		}
	}
}
