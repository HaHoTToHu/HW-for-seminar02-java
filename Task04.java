/* * К калькулятору из предыдущего дз добавить логирование.*/
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task04 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Task04.class.getName());
        FileHandler fh = new FileHandler("calc_log.txt");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        Scanner f_num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first_number = f_num.nextInt();

        Scanner s_num = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int second_number = s_num.nextInt();

        Scanner oper = new Scanner(System.in);
        System.out.println("Enter option: +, -, * or / : ");
        String op = oper.nextLine();

        switch (op) {
            case "+":
                int sum = first_number + second_number;
                System.out.printf("Sum of numbers is: %d", sum);
                break;
            
            case "-":
                int dif = first_number - second_number;
                System.out.printf("Dif of numbers is: %d", dif);
                break;

            case "*":
                int mul = first_number * second_number;
                System.out.printf("Multiply of numbers is: %d", mul);
                break;

            case "/":
                int div = first_number / second_number;
                System.out.printf("Dif of numbers is: %d", div);
                break;
        }
        logger.log(Level.WARNING, "Вычисления...");
        logger.info("Логирование!");
    }
}
