package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class aldrinsReadExcel {

    private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest_Aldrin/PrefixCodesURL.xlsx";

    /**
     * This method is to read Excel file based on sheet Index Number
     */
    public static void readExcelFile(String fileName, int sheetNumber, List<Integer> firstColumn, List<String> secondColumn) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(fileName));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        secondColumn.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        int newInt = (int) (currentCell.getNumericCellValue());
                        firstColumn.add(newInt);
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }

    }

    /**
     * This method is to read and store Excel file based on Columns, Sheet index and Only for String Type
     */
    public static void readExcelString(String fileName, int sheetNumber, List<String> firstColumn, List<String> secondColumn) {
        int cellIndex = 2;
        try {
            FileInputStream inputStream = new FileInputStream(new File(fileName));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        if (cellIndex % 2 == 0) {
                            firstColumn.add(currentCell.getStringCellValue());
                            cellIndex++;
                        } else {
                            secondColumn.add(currentCell.getStringCellValue());
                            cellIndex++;
                        }
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }

    }

    public static String getFileName() {
        return FILE_NAME;
    }
}
