public class Animals // class
{
    public void run(String name, int legs) // run: method; name,legs: parameters..
    {
        System.out.println(name + " has " + legs + " legs");
    }
    public void dance(String name) //dance: method
    {
        System.out.println(name + " can dance..");
    }
    public static void main(String[] args)//main method
    {
        Animals cat = new Animals(); //Object
        cat.run( "Bella ", 4); //Accessing method + data members
        cat.dance("Bella ");
    }
}

