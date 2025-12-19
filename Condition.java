import java.util.Scanner;

public class IfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter you marks");
        int marks = sc.nextInt();
        
        // int marks = 84;
        if (marks >= 50){
            System.out.println("Eligible");
        } 
        else {
            System.out.println("Not Eligible");
        }
    }
} }

public class IfElseIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter you time: ");
        int time = sc.nextInt();
        
        if (time <= 4){
             System.out.println("Afternoon");
        }else if(time <=7 ){
             System.out.println("Evening");
        }else{
             System.out.println("Night");
        }
    }
}
