class student1{
    public static void print1(){
        System.out.println("print1");
    }
}
class student2 extends student1{
    public static void print2(){
        System.out.println("print2");
    }
}
class student3 extends student2{
    public static void print3(){
        System.out.println("print3");
    }
}
public class clock{

    public static void main(String[] args){

    student3.print1();
    student3.print2();
    student3.print3();       


    }
}