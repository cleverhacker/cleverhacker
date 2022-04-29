import java.util.Scanner;

public class Switvh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entetr 1 Number:");
        int a = sc.nextInt() ;
        System.out.println("Entetr 2 Number:");
        int b = sc.nextInt() ;
        System.out.println("1:addtion");
        System.out.println("2: subtraction");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
            int c= a+b;
            System.out.println(c);
            break;
            case 2:
            int d= a-b;
            System.out.println(d);
            break;
        }
        


    }
    
}
