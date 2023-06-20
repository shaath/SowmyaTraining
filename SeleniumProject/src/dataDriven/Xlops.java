package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.BusinessMethods;

public class Xlops {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String xlPath = System.getProperty("user.dir")+"\\src\\inputData\\TestData.xlsx";
		String xlout = System.getProperty("user.dir")+"\\src\\results\\TestRes1.xlsx";
		String res = null;
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		XSSFRow r = ws.getRow(2);	
//		XSSFCell c = r.getCell(0);
				
//		System.out.println(c.getStringCellValue());
		
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		
//		int cc =  r.getLastCellNum();
//		System.out.println(cc);
		
		BusinessMethods bm = new BusinessMethods();
		bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
		for (int i = 1; i <= rc; i++) {
			String f = ws.getRow(i).getCell(0).getStringCellValue();
			String l = ws.getRow(i).getCell(1).getStringCellValue();
			String eId = ws.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(f + "---" + l + "---" + eId);
			res = bm.orgEmpReg(f, l, eId);
			
			ws.getRow(i).createCell(3).setCellValue(res);
		}
		
		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.orgClose();
	}

}
