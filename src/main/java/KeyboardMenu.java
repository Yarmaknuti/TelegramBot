import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class KeyboardMenu {

       ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        public  String keyboardMenu() {
            ArrayList keyboard = new ArrayList<>();
            KeyboardRow keyboardFirstRow = new KeyboardRow();
            KeyboardRow keyboardSecondRow = new KeyboardRow();
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(true);
            keyboardFirstRow.clear();
            keyboardSecondRow.add("Отправить заявку");
            keyboardFirstRow.add("Помощь");
            keyboardFirstRow.add("Информация");
            keyboard.add(keyboardSecondRow);
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выбирай";
        }


}
