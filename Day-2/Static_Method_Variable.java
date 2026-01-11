public class Myclass{
    
    static int count = 10;
    
    static void greet(){
        System.out.println("This is static method....");
    }
    
    public static void main(String[] args){
        System.out.println("This is static variable... \nCount = " + count); //Calling static variable
        
        Myclass.greet(); // Calling static method
    }
}
