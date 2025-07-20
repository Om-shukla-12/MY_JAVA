import java.util.Scanner;
public class Search2drray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int n = sc.nextInt(); // Element to search for
        int num[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                num[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(num[i][j] == n){
                    System.out.println("Element found at: " + i + " " + j);
                    sc.close();
                    return; 
                }
            }
        }
        sc.close();
    }
}