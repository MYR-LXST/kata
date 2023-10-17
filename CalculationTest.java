package calculation;

import java.util.Scanner;

public class CalculationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Можно использовать целые числа от 1 до 10");
        System.out.println("Возможные операции: '+','-','*','/'");
        System.out.println("Введите операцию по типу 'a + b'");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        if (strings.length !=3) {
            throw new Error("Не верный формат ввода данных");
        }
        int firstNum = Integer.parseInt(strings[0]);
        int secondNum = Integer.parseInt(strings[2]);
        char operation = strings[1].charAt(0);

        if (firstNum < 1 || firstNum >10 || secondNum < 1 || secondNum > 10){
            throw new Error("Числа должны бить от 1 до 10!!!");
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
                throw new Error("Не вереый формат ввода данных");
            }
        System.out.println("Результат: " + result);
        }
    }

