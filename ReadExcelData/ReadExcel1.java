package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			File src = new File("C:\\ExcelData\\ReadSheet.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
			int rowcount = sheet1.getLastRowNum();
			System.out.println(rowcount);
			
			for(int i = 0; i < rowcount; i++) {
				System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
			}
			
			wb.close();
	}

}
