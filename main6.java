import java.util.*;
public class main6 {
     main6(){
        System.out.print("==Welcome to java program==");
     }
     String name(){
        Scanner sc=new Scanner(System.in);
        String getname=sc.nextLine();
        System.err.println("Enter name:"+getname);
        return   "Hello, " + getname;
     }
     public static void main(String[] args) {
        main6 obj =new main6();
        String name=obj.name();
        System.out.println(name);
     }
    }