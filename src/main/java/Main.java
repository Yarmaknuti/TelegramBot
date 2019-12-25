import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.WebhookBot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void UpdateExcel(String Description, String Communication) throws IOException {

        File file = new File("task12.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int score = 0;
        //Проход по нулевому столбцу
        for (Row row : sheet) {
            Cell cell = row.getCell(0);
            score++;
        }
        System.out.println(score);

        Cell cell;
        Row row;
        //Выбор строки и запись даных
        row = sheet.createRow(score);
        // Number Task (A)
        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue(score + 1);
        // Description Task (B)
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue(Description);
        // Communication (C)
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue(Communication);
        //Time
        cell = row.createCell(3, CellType.NUMERIC);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM. HH:mm");
        cell.setCellValue(dateFormat.format(date.getTime()));


        inputStream.close();
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
    }
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();
            Bot bot = new Bot();
            try {
                telegram.registerBot(bot);
            }catch (TelegramApiRequestException e){
                e.printStackTrace();
        }

    }
}
