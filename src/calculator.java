import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요 : ");
        String str1 = scan.nextLine();

        System.out.println("사칙연산 기호중 하나를 입력하세요 : ");
        String op = scan.nextLine();

        System.out.println("두번째 숫자를 입력하세요 : ");
        String str2 = scan.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            default -> num1 * num2;
        };

        System.out.println(str1 + op + str2 + "=" + num3);
    }

}