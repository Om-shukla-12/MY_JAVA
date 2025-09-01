package Array;

public class Spiral {

       public static void main(String[] args) {
         String ch = "Hello, World!";
    ch = ch.toLowerCase();
    int [] count = new int[26];

    //  to find repeated letter
    for(int i =0;i<ch.length();i++){
        char curchar = ch.charAt(i);
        if(curchar>='a' && curchar<='z'){
            count[curchar-'a']++;
        }
    }

    for(int i=0;i<26;i++){
        if(count[i]>1){
            System.out.println((char)(i+'a') + " is repeated " + count[i] + " times.");
        }
    }

    }
}