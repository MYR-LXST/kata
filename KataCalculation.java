import java.io.IOException;
import java.util.Scanner;

public class KataCalculation {
    public static void main(String[] args) throws IOException{
        System.out.println("Калькулятор для KataAcademy");
        System.out.println("Введите значения по примеру --> a + b");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        try {
            String result = Main.calc(input);
            System.out.println("Result: " + result);
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class Main{
    public static String calc(String input) throws IOException{
        String[] strings = input.split(" ");
        if (strings.length !=3) {
            throw new IOException("Не верный формат ввода данных");
        }
        int firstNum = Integer.parseInt(strings[0]);
        int secondNum = Integer.parseInt(strings[2]);
        char operation = strings[1].charAt(0);

        if (firstNum < 1 || firstNum >10 || secondNum < 1 || secondNum > 10){
            throw new IOException("Числа должны быть от 1 до 10");
        }

        int result;
        switch (operation){

            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            default:
                throw new IOException("Не вереый формат ввода данных");


        }
        return Integer.toString(result);
    }
}