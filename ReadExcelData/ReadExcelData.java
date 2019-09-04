package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
			ExcelDataConfig ex = new ExcelDataConfig("C:\\ExcelData\\ReadSheet.xlsx");
			System.out.println(ex.getData(0, 0, 0));
	}

}
