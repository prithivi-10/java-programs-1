import java.lang.*;

class Outer  {

    public void show() {
        
    }

    
    class Inner {
        public void show() {
        System.out.println("hi, Im inside the Inner class");

        }
    }
}

class Outer1 {
    public void display() {
       
    }

    static  class Inner1 {
         void display() {
            System.out.println("hi, Im inside the static Inner1 class");
        }
    } 
}
public class innerClass_and_staticInnerClass {
    public static void main(String[] args) {

    System.out.println("Java program for Inner class");
    System.out.println("----------------------------");

    //normal inner class::
    Outer out = new Outer();
    Outer.Inner in = out.new Inner();
    in.show();



    //Static Inner class::
    Outer1 out1 = new Outer1();
    Outer1.Inner1 in1 = new Outer1.Inner1(); 
    in1.display();

        


    }
}


//    normal obj creation    =       className objName = new className();
                                   // Outer obj = new Outer();

  

//    inner obj creation     =       outerClassName.innerClassName objName = outerObjectName.new innerClassName();
                                      // Outer.Inner obj1 = obj.new Inner();



//    inner static obj creation   =    outerClassName.InnerClassName objName = new outerClassName.innerClaccName();
                                      // Outer.Inner obj2 = new Outer.Inner();
