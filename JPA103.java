import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double sum;
        System.out.println("Please input: ");
        float num1 = a.nextInt();
        float num2 = a.nextInt();
        float num3 = a.nextInt();
        sum = num1 + num2 + num3;
        double average = Math.round((sum/3) * 100.0) / 100.0;
        System.out.println("Average= "+average);
    }
}
