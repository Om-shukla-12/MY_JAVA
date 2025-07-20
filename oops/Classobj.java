package oops;

// import java.util.*;

class Pen{
    String color;
    String type;
    char ch;

    public void Info(){
        System.out.println(this.color);
        System.out.println(this.type);

    }
    Pen(String color,String type){
        this.color = color;
        this.type = type;
    }
}
public class Classobj {
    public static void main(String args[]){
    Pen p1 = new Pen("blue","gel");
    // p1.color = "blue";
    // p1.type = "GEL";

    p1.Info();
    }
}
