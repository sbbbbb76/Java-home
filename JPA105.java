import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("請輸入你的姓名: ");
        String name = a.nextLine();
        System.out.println("Hi, %,請輸入你的銅板個數: ");
        System.out.print("請輸入1元硬幣數量: ");
        int b1 = a.nextInt();
        System.out.print("請輸入5元硬幣數量: ");
        int b2 = a.nextInt();
        System.out.print("請輸入10元硬幣數量: ");
        int b3 = a.nextInt();
        System.out.print("請輸入50元硬幣數量: ");
        int b4 = a.nextInt();
        int sum = b1 * 1 + b2 * 5 + b3 * 10 + b4 * 50;
        int c1 = sum /1000;
        int c2 = sum %1000/100;
        int c3 = sum %100/10;
        int c4 = sum % 100 % 10;
        System.out.printf("您的錢總共有 %d 千 %d 百 %d 十 %d 元"  , c1 , c2, c3, c4);
        }
    

}

