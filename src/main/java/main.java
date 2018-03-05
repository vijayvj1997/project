import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            System.out.println("Hello!");
    }
    public static boolean prime(int num){
        Scanner scanner  = new Scanner(System.in);

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
