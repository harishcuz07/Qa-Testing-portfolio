//Updated Code//
package mohanFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppleDeviceMatrix {
	static WebDriver myDriver = new FirefoxDriver();

	public static void main(String[] args) throws Throwable {
		AppleDeviceMatrix myClass = new AppleDeviceMatrix();
		writeToExcel m = new writeToExcel();
		FileOutputStream myFile = null;
		try {
			myFile = new FileOutputStream(new File(
					("C:\\Javed_Projects\\Backup\\Javed\\workspace\\MobileDeviceMatrix\\TestData\\MobileDeviceMatrix.xlsx")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		myDriver.get("https://david-smith.org/iosversionstats/");

		String excelFileName = "C:\\Javed_Projects\\Backup\\Javed\\workspace\\MobileDeviceMatrix\\TestData\\MobileDeviceMatrix.xlsx";// name
																																		// of
																																		// excel
		XSSFWorkbook wb = new XSSFWorkbook();																																// file
		
		writeDeviceData(wb, "iPhone");
		writeDeviceData(wb, "iPad");
		FileOutputStream fileOut = new FileOutputStream(excelFileName);

	// write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();

		myFile.close();
		myDriver.close();
	}

	public static void writeDeviceData(XSSFWorkbook wb, String deviceName) {
		
		String myHeaderVal = null;
		
		XSSFSheet sheet = wb.createSheet(deviceName) ;

		//Taking Header
		List<WebElement> dataHeaderList = myDriver.findElements(By.xpath("//table[5]//tr[2]//th"));
		int dataHeaderCount = dataHeaderList.size();
		System.out.println(dataHeaderCount);
		// output 
		int r=0;
		XSSFRow row = sheet.createRow(r);
		for (int h = 0; h < dataHeaderCount; h++) {
			 myHeaderVal = dataHeaderList.get(h).getText();
			XSSFCell cell = row.createCell(h);
			cell.setCellValue(myHeaderVal);
		}
		
		//Taking data row count
		List<WebElement> dataRowList = myDriver.findElements(By.xpath("//table[5]//tr"));
		int dataRowCount = 0;
		dataRowCount = dataRowList.size();
		dataRowCount = dataRowCount -2;

		//Taking iPhone and Ipad and data column Count
		r=1;
		for (int i = 3; i<dataRowCount+3; i++){			
			List<WebElement> dataColList = myDriver.findElements(By.xpath("//table[5]//tr["+i+"]//td"));
			String myVal = dataColList.get(0).getText();
			if (myVal.contains(deviceName)) {
				row = sheet.createRow(r);
				dataColList.remove(2);
				int dataColcount = dataColList.size();
				for (int j = 0; j < dataColcount; j++) {
					myVal = dataColList.get(j).getText();
					XSSFCell cell = row.createCell(j);
					cell.setCellValue(myVal);
				}
				r = r+1;
			}
		}
	}
}
