import java.util.Scanner;

public class arrayfun {
    public static void main(String[] args) {
        
    
        int a[] =new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<a.length;i++){
           a[i] = sc.nextInt();
        }
        func1(a);
    }
    
    public static void func1(int[] arr){
       for (int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
       }
    }
}

