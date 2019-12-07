import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\Framework\\cucumber\\pune\\javaseleniumtraining\\Selenium\\excel\\sheet.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Cell s = wb.getSheet("Sheet1").getRow(0).getCell(0);
		System.out.println(s);
	}

}
