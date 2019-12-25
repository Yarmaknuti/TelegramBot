public class Start {
    public static void Start(String msg) {
        if (msg.equals("/go") || msg.equals("Привет") || msg.equals("привет")) {

            KeyboardMenu keyboardMenu = new KeyboardMenu();
            keyboardMenu.keyboardMenu();

        }
    }
}

