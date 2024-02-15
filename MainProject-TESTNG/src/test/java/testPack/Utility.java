package testPack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	public static void output(List<String>op) throws IOException {
		FileOutputStream fp=new FileOutputStream(System.getProperty("user.dir")+"\\output\\output.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("sheet1");
		int rows=0;
		for(int i=0;i<op.size();i++) {
		
		XSSFRow row1=sheet.createRow(rows);			
		row1.createCell(0).setCellValue(op.get(i));
		rows+=1;
		}
		
		wb.write(fp);
		wb.close();
		fp.close();
	}
}
