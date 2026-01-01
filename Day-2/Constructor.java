//       ====Rules for Constrctor====
//    1. class name == constructor name
//    2. does not have any return type not even void
//    3. can have access modifier(public private)but not have non-access modifier(static, abstract)
//    4. called automatically when an object is created
//       ====Ways to Calling constructor====
//    1. Constructor obj = new Constructor();
//    2. new Constructor();
//       ====Types of Constructor====
//    1. Default Constructor: Created by Java Complier
//    2. No Argument Constructor: Created by Programmer
//    3. Parameterized Constructor: Created by Programmer

public class Constructor {
    Constructor(){
        System.out.println("Constructor is called..");
    }

    public static void  main(String[] args) {
        new Constructor();
    }
  
//     ====Default Constructor====
    int a;

    public static void main(String[] args){
        Constructor obj = new Constructor();
        System.out.println("Default Constructor is called... \nValue of a is : " + obj.a);

    }
}

//    ====No-Argument Constructor====

        public Constrctor(){
            System.out.println("No-Parameter Constructor Called..");
        }

        public static void main(String[] args){
            new Constrctor();
        }
    }

//    ====Argument Constructor====
        public Constructor(int n1) {
            System.out.println("Value of n1 is : " + n1);
        }

        public static void main(String[] args) {
            new Constructor(10);
        }
    }

}
