import java.util.Scanner;

public class Task_five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = in.nextLine();
        int Num = Integer.parseInt(bin, 2);
        System.out.println("Полученное число" + Num);
    }
}
