package mohanFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.CellEditor;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader.SheetIterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table.Cell;
import com.sun.jna.platform.win32.WinBase.PROCESS_INFORMATION.ByReference;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/

/**
 * Unit test for simple App.
 */
public class iPhoneMatrix {
	WebDriver Mydriver = new FirefoxDriver();

	public static void main(String arg[]) throws Throwable {
		iPhoneMatrix OpenSite = new iPhoneMatrix();
		OpenSite.OpenReferenceSite();
		List<WebElement> myEle = OpenSite.OpenReferenceSite();
		OpenSite.WritetoExcel(myEle);
	}

	/*public Object writeexcel(String printValue, int row, int cell) throws Throwable {
		XSSFWorkbook myWorkbook = new XSSFWorkbook();
		XSSFSheet mySheet = myWorkbook.createSheet("Javed");
		FileOutputStream myFile;
		myFile = new FileOutputStream(
				new File(("C:\\Users\\javed_a\\workspace\\MobileDeviceMatrix\\TestData\\MobileDeviceMatrix.xlsx")));
		try {
			Row myRow = mySheet.createRow(row);
			org.apache.poi.ss.usermodel.Cell myCell = myRow.createCell(row - 1);
			myCell.setCellValue(printValue);
			myWorkbook.write(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myWorkbook.close();
		myFile.close();
		return myFile;
	}*/

	public List<WebElement> OpenReferenceSite() {
		Mydriver.get("https://david-smith.org/iosversionstats/");
		List<WebElement> MyElements = Mydriver.findElements(By.xpath("//table[5]//tr"));
		/*
		 * for (int i = 1; i < (MyElements.size() - 1); i++) {
		 * System.out.println(MyElements.get(i).getText()); }
		 */
		return MyElements;
	}

	public void WritetoExcel(List<WebElement> myEle) throws Throwable {
		XSSFWorkbook myWorkbook = new XSSFWorkbook();
		XSSFSheet mySheet = myWorkbook.createSheet("Javed");
		FileOutputStream myFile;
		myFile = new FileOutputStream(new File(("C:\\Users\\javed_a\\workspace\\MobileDeviceMatrix\\TestData\\MobileDeviceMatrix.xlsx")));
		int myRow = 0;
		int myCol = 0;
		for (int j = 1; j < (myEle.size() - 1); j++) {
			myRow = myRow +1;
			String myStr = myEle.get(j).getText();
			// System.out.println("***This is my string***" + myStr);
			List<String> myItems = Arrays.asList(myStr.split(" "));
			String myPrevItemvalue = "";
			Row row = mySheet.createRow(j-1);
			for (int k = 0; k < myItems.size(); k++) {
				myCol = myCol + 1;
				String myCurrItemvalue = myItems.get(k);
				myCurrItemvalue = myCurrItemvalue.toString().trim();
				System.out.println(myCurrItemvalue);
				org.apache.poi.ss.usermodel.Cell myCell = row.createCell(k);
//				myCell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
				//myCell.setCellValue(myCurrItemvalue.toString());
				myCell.setCellValue(myCurrItemvalue);
				if (myCurrItemvalue.equals("Device")) {
					if (myCurrItemvalue.equals(myPrevItemvalue)) {
						myCurrItemvalue = myCurrItemvalue + " " + "Usage";
						//Row row = mySheet.createRow(myRow);
						//org.apache.poi.ss.usermodel.Cell myCell = row.createCell(myCol);
						myCell.setCellValue(myCurrItemvalue);
						//myCell.setCellValue(myCurrItemvalue);
						
						System.out.println(myCurrItemvalue + " " + "Usage");
						k++;
						continue;
					} else {
						myPrevItemvalue = myCurrItemvalue;
						System.out.println(myCurrItemvalue);
						
						//Row row = mySheet.createRow(myRow);
						//org.apache.poi.ss.usermodel.Cell myCell = row.createCell(myCol);
						myCell.setCellValue(myCurrItemvalue);
					}
				} else if (myCurrItemvalue.equals("iPhone") || myCurrItemvalue.equals("iPad")) {
					myPrevItemvalue = myCurrItemvalue;
					continue;
				} else if (myPrevItemvalue.equals("iPhone") || myPrevItemvalue.equals("iPad")) {
					myCurrItemvalue = myPrevItemvalue + " " + myCurrItemvalue;
					myPrevItemvalue = myCurrItemvalue;
					System.out.println(myCurrItemvalue);
					
					//Row row = mySheet.createRow(myRow);
					//org.apache.poi.ss.usermodel.Cell myCell = row.createCell(myCol);
					myCell.setCellValue(myCurrItemvalue);
					continue;
				} else if (myCurrItemvalue.equals("")) {
					myPrevItemvalue = myCurrItemvalue;
					continue;
				} else if (myCurrItemvalue.equals("iPod")) {
					break;
				} else {
					System.out.println(myCurrItemvalue);
					
					//Row row = mySheet.createRow(myRow);
					//org.apache.poi.ss.usermodel.Cell myCell = row.createCell(myCol);
					myCell.setCellValue(myCurrItemvalue);
				}
			}
		}
		myWorkbook.write(myFile);
		myWorkbook.close();
		myFile.close();
		/*
		 * XSSFSheet mySheet = myWorkbook.getSheet("Sheet1"); Iterator<Row>
		 * myRowiterator = mySheet.iterator(); Row row = mySheet.getRow(0);
		 * org.apache.poi.ss.usermodel.Cell myCell = row.createCell(1);
		 * myCell.setCellValue("Javed"); for (int j = 1; j < (myEle.size() -1);
		 * j++) { myCell.setCellValue(myEle.get(j).getText()); }
		 */
	}
}
