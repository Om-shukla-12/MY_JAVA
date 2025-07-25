import java.util.*;

public class Pattern {
    // Pattern 1: Print a square pattern of stars
    
    public static void main(String[] args){
      for(int i=1;i<=4;i++){
       
            for(int j = 1;j<=5;j++){
                 if(i==1 || i==4 || j==1 || j==5 ){
            System.out.print(" * ");}
            else{
                System.out.print("   ");
            }
            }
            
            System.out.println(" ");
        }
    }
}
