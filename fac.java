import java.util.Scanner;;
public class fac {
    public static void main(String[] args) {
        int fact =1 ;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter factorial num");
        int a = Sc.nextInt();

        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
