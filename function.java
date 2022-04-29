import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a= obj.nextInt();
        System.out.println("Enter 2 number");
        int b= obj.nextInt();
        System.out.println("Sum is : "+ func1(a,b));

    }
    public static int func1(int x,int y){
        int z =x+y;
        // System.out.println("add is" +z);
        return z;
    }
}
