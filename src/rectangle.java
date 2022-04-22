import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        if((x1 > 50 && x1<100) && (y1>50 && y1<100)){

            System.out.println("직사각형 안에 있습니다.");

        }else

            System.out.println("직사각형 안에 없습니다.");

    }
}
