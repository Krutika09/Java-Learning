public class Variables {

    int instance_var = 10;

    void m1(){
        int local_var1 = 20;
        System.out.println(instance_var + local_var1);
    }

    void m2(){
        int local_var2 = 30;
//        System.out.println(local_var1 + local_var2); // Show Error because local_var1 is not accessible outside the block
        System.out.println(instance_var + local_var2);
    }

    public static void main(String[] args){
        Variables1 obj = new Variables1();
        obj.m1();
        obj.m2();
    }
}
