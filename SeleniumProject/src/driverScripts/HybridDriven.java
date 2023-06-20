package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.BusinessMethods;

public class HybridDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		String xlPath = System.getProperty("user.dir")+"\\src\\inputData\\Hybrid.xlsx";
		String xlout = System.getProperty("user.dir")+"\\src\\results\\HybridRes.xlsx";
		String res = null;
		
		FileInputStream fi = new FileInputStream(xlPath);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
//		System.out.println(wb.getSheetIndex("Testcase"));
		XSSFSheet tcSheet = wb.getSheet("Testcase");
		XSSFSheet tsSheet = wb.getSheet("Teststeps");
		XSSFSheet tdSheet = wb.getSheet("TestData");
		XSSFSheet empRegSht = wb.getSheet("EmpReg");
		
		int tcRc = tcSheet.getLastRowNum();
		int tsRc = tsSheet.getLastRowNum();
		int empRc = empRegSht.getLastRowNum();
		
		BusinessMethods bm = new BusinessMethods();
		
		for (int i = 1; i <= tcRc; i++) {
			tcSheet.getRow(i).createCell(3);
			String exe = tcSheet.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y")) 
			{
				String tcShttcId = tcSheet.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) {
					String tsShttcId = tsSheet.getRow(j).getCell(0).getStringCellValue();
					
					if (tcShttcId.equalsIgnoreCase(tsShttcId)) {
						String key = tsSheet.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) {
						case "Launch":
							String br = tdSheet.getRow(1).getCell(0).getStringCellValue();
							String url = tdSheet.getRow(1).getCell(1).getStringCellValue();
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = tdSheet.getRow(1).getCell(2).getStringCellValue();
							String p = tdSheet.getRow(1).getCell(3).getStringCellValue();
							res = bm.orgLogin(u, p);
							break;
						case "logout":
							res = bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":
							for (int k = 1; k <= empRc; k++) {
								String f = empRegSht.getRow(k).getCell(0).getStringCellValue();
								String l = empRegSht.getRow(k).getCell(1).getStringCellValue();
								String eId = empRegSht.getRow(k).getCell(2).getStringCellValue();
								res = bm.orgEmpReg(f, l, eId);
								
								empRegSht.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename = tdSheet.getRow(1).getCell(7).getStringCellValue();
							String uname = tdSheet.getRow(1).getCell(8).getStringCellValue();
							String pwd = tdSheet.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = tdSheet.getRow(1).getCell(8).getStringCellValue();
							String pd = tdSheet.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgLogin(un, pd);
							break;

						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						tsSheet.getRow(j).createCell(4).setCellValue(res);
						
						if(!tcSheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")){
							tcSheet.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				tcSheet.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
