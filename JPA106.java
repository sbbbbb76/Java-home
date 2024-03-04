public class JPA106 {
    public static void main(String[] args) {
        double a=-3.2 , b=-2.1 , c=0 , d=2.1;
        System.out.printf("f(-3.2) = %.4f\n" ,fun1.calGrade( a ));
        System.out.printf("f(-2.1) = %.4f\n" ,fun1.calGrade( b ));
        System.out.printf("f(0) = %.4f\n" ,fun1.calGrade( c ));
        System.out.printf("f(2.1) = %.4f\n" ,fun1.calGrade( d ));
        
    }
}
class fun1 {
    public static double calGrade(double x){
        return 3*Math.pow(x , 3)+2*x-1;
    }
}