class jiya{

    public void topper(){

        System.out.println("She Is A Topper.");
    }
}

class pragya extends jiya{

    public void week(){

        System.out.println("She Is A Week.");
    }
}

class hetsi{

    public void poor(){

        System.out.println("She Is A Poor.");
    }
} 

class hardi extends hetsi{

      public void excellent(){
     
        System.out.println("She Is A Excellent.");
        

      }

} 

public class mine {
 
    public static void main(String args[]){
        
    pragya obj1 = new pragya();    
    hardi obj2 = new hardi();
    obj1.topper();
    obj1.week();
    obj2.poor();
    obj2.excellent();


    }
}
