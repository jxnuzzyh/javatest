package demo;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
import jxl.Sheet;  
import jxl.Workbook;  
import jxl.read.biff.BiffException;  
public class GetExcelInfo {  
    public static void main(String[] args) {  
        GetExcelInfo obj = new GetExcelInfo();  
        // �˴�Ϊ�Ҵ���Excel·����E:/zhanhj/studysrc/jxl��  
        File file = new File("E:/zhanhj/studysrc/jxl/getExcleinfo.xls");  
        obj.readExcel(file);  
    }  
    // ȥ��Excel�ķ���readExcel���÷�������ڲ���Ϊһ��File����  
    public void readExcel(File file) {  
        try {  
            // ��������������ȡExcel  
            InputStream is = new FileInputStream(file.getAbsolutePath());  
            // jxl�ṩ��Workbook��  
            Workbook wb = Workbook.getWorkbook(is);  
            // Excel��ҳǩ����  
            int sheet_size = wb.getNumberOfSheets();  
            for (int index = 0; index < sheet_size; index++) {  
                // ÿ��ҳǩ����һ��Sheet����  
                Sheet sheet = wb.getSheet(index);  
                // sheet.getRows()���ظ�ҳ��������  
                for (int i = 0; i < sheet.getRows(); i++) {  
                    // sheet.getColumns()���ظ�ҳ��������  
                    for (int j = 0; j < sheet.getColumns(); j++) {  
                        String cellinfo = sheet.getCell(j, i).getContents();  
                        System.out.println(cellinfo);  
                    }  
                }  
            }  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (BiffException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
