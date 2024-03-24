class Triangle {

        public void Print(int a, int b){ 
             System.out.println(a+b);
           
    } 
}

    class circle extends Triangle{

        public void print(){ 
            System.out.println("jia");
   } 
}
    
 
public class inheritanceperameter {
 
    public static void main(String[] args){

        circle obj = new circle();
        
         obj.Print(12,12);
        
         obj.print();


    }
}
