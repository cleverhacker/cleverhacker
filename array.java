import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        int sum=0;
        int a[] =new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<a.length;i++){
           a[i] = sc.nextInt();
            
        }
        for (int i=0;i<a.length;i++){
            
            sum = sum+a[i];
            
         }
         System.out.println(sum);
    }
}   
