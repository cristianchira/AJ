package classes.LocalClass;

import java.util.Scanner;

public class LocalClassMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String... args) {
        //	LocalClassExample.validatePhoneNumber("123-456-7890", "456-7890");
        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I ve been attached'");
            }

            @Override
            public void onClick(String title) {

            }
        }
        btnPrint.setOnClickListener(new ClickListener());
    }


}
