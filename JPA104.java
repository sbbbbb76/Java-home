import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("請輸入第一組的x,y座標:");
        float x1 = a.nextInt();
        float y1 = a.nextInt();
        System.out.print("請輸入第二組的x,y座標:");
        float x2 = a.nextInt();
        float y2 = a.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("介於<%.2f,%.2f>和<%.2f,%.2f>之間的距離是: %.2f",x1,y1,x2,y2,distance);
    }
}