public class JPA107 {
    public static void main(String[] args) {
        int action = 1,skill = 2,teamgame = 3;

        System.out.println("The basketball grade is " + Basketball.calGrade(action , skill , teamgame));
        System.out.println("The basetball grade is " + Baseball.calGrade(skill , teamgame));
    }
}
class Basketball {
    public static int calGrade(int a,int b,int c) {
        return a  + b + c;
    }
}
class Baseball {
    public static int calGrade(int s,int t) {
        return 10 + s + t;
    }
}