/* Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.*/

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task02 {
    private static final Logger LOGGER = Logger.getLogger(Task02.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {

        int[] mas = { 4, 2, 8, 16, 15, 42, 22 };

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;

                    FileHandler fh = new FileHandler("log.txt");
                    LOGGER.addHandler(fh);
                    SimpleFormatter sFormat = new SimpleFormatter();
                    fh.setFormatter(sFormat);
                    LOGGER.info("Итерация" + i + ": " + mas);
                    
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}