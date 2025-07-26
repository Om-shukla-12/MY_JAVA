import java.util.Scanner;

public class Pattern2 {

    //  for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i=1;i<=n;i++){
        // loop for spaces
        for(int j=1;j<=n-i;j++){
            System.out.println(" ");
        }
        // loop for stars
        for(int j=1;j<=i;j++){
            System.out.println("*");
        }
        System.out.println();
       }
    }
}
