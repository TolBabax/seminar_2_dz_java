package seminar_java.seminar_dz_2;
// К калькулятору из предыдущего дз добавить логирование.
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Scanner;
import java.util.logging.*;


public class task_4 {
    public static void main(String[] args) {
        menu_calculator();
    }
    // запись логов
    public static void writeLog(String log) {
        try (FileWriter writer = new FileWriter("seminar_java\\seminar_dz_2\\log.txt", true)) {
            writer.write(log);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // меню калькулятора
    public static void menu_calculator() {
        while (true) {
            System.out.println("Добро пожаловать в калькулятор!");
            String encoding = System.getProperty("console.encoding", "cp866"); 
            Scanner iScaner = new Scanner(System.in, encoding);                          
            System.out.print("Введите первое число: ");
            double number_1 = iScaner.nextDouble();
            System.out.print("Введите первое число: ");
            double number_2 = iScaner.nextDouble();        
            // System.out.println(number_n);
            StringBuilder log = new StringBuilder();  
            System.out.println("1. Для операции сложение наберите: '1'.");
            System.out.println("2. Для операции вычитание наберите: '2'.");
            System.out.println("3. Для операции умножения наберите: '3'.");
            System.out.println("4. Для операции деления наберите: '4'.");
            System.out.println("5. Для выхода из калькулятора: '5'.");
            // System.out.println("5. Для выхода из калькулятора наберите: 'e'.");
                                   
            System.out.print("Наберите цифру от 1 до 5: ");
            int letter_menu = iScaner.nextInt();
            // iScaner.close();
            if(letter_menu == 1) {
                double summa_n = number_1 + number_2;
                System.out.printf("Сумма двух чисел %.2f и %.2f = %.2f", number_1, number_2, summa_n);
                System.out.println();
                System.out.println("===============");
                log.append(number_1).append(" + ").append(number_2).append(" = ").append(summa_n).append("\n");
                
            }
            if(letter_menu == 2) {
                double minus_n = number_1 - number_2;
                System.out.printf("Разница двух чисел %.2f и %.2f = %.2f", number_1, number_2, minus_n);
                System.out.println();
                System.out.println("===============");
                log.append(number_1).append(" - ").append(number_2).append(" = ").append(minus_n).append("\n");
                
            }
            if(letter_menu == 3) {
                double umnozenie = number_1 * number_2;
                System.out.printf("Произведение двух чисел %.2f и %.2f = %.2f", number_1, number_2, umnozenie);
                System.out.println();
                System.out.println("===============");
                log.append(number_1).append(" * ").append(number_2).append(" = ").append(umnozenie).append("\n");
                
            }
            if(letter_menu == 4) {
                double delenie = number_1 / number_2;
                System.out.printf("Деление двух чисел %.2f и %.2f = %.2f", number_1, number_2, delenie);
                System.out.println();
                System.out.println("===============");
                log.append(number_1).append(" / ").append(number_2).append(" = ").append(delenie).append("\n");                   

               
            }
            if(letter_menu == 5) {
                iScaner.close();
                log.append("Выход из калькулятора");
                break;
            }
            
            writeLog(log.toString());
        }     
    }
}

/* StringBuilder log = new StringBuilder();
        double result = 0;
        switch (operation) {
            case '1' -> {
                double summa_n = number_1 + number_2;
                log.append(number_1).append(" + ").append(number_2).append(" = ").append(summa_n).append("\n");
            }
            case '2' -> {
                double minus_n = number_1 - number_2;
                log.append(number_1).append(" - ").append(number_2).append(" = ").append(minus_n).append("\n");
            }
            case '3' -> {
                double umnozenie = number_1 * number_2;
                log.append(number_1).append(" * ").append(number_2).append(" = ").append(umnozenie).append("\n");
            }
            case '4' -> {
                double delenie = number_1 / number_2;
                log.append(number_1).append(" / ").append(number_2).append(" = ").append(delenie).append("\n");
            }
            case '5' -> {
                log.append("Выход из калькулятора");
            }
            default -> System.out.println("Неверная операция");
        }
        writeLog(log.toString());
        return result;
    } */
