import java.util.*;
import java.lang.*;

class ArrayOfObjects {
    String name;
    String dept;
    double cutOff;

            //assign values with the help of Constructors::
            // public ArrayOfObjects(String name,String dept,double cutOff) {
            //     this.name=name;
            //     this.dept=dept;
            //     this.cutOff=cutOff;
            // }

    public void show() {
        System.out.println("Name of Student is= "+name+" and the choosen Department is= "+dept+" and his cutOff is="+cutOff+"\n");
    }

    //assign value with the help of Methods::
    public void Method(String name,String dept,double cutOff) {
        this.name=name;
        this.dept=dept;
        this.cutOff=cutOff;
    }

            // public String toString( ) {
            //     return "Name of Student is= "+name+" and the choosen Department is= "+dept+" and his cutOff is="+cutOff+"\n";
            // }

}
public class arrays_of_obects {
    public static void main(String[] args) {

        ArrayOfObjects[] obj  = new ArrayOfObjects[3];

                //with using the constructors:
                // obj[0] = new ArrayOfObjects("Prithivi","CSE",198.5);
                // obj[1] = new ArrayOfObjects("Viper", "CSBS", 178.6);
                // obj[2] = new ArrayOfObjects("Professional pro", "Mech", 189.67);

        //without using the constructors:
        obj[0] = new ArrayOfObjects();
        obj[1] = new ArrayOfObjects();
        obj[2] = new ArrayOfObjects();

        



        System.out.println("Number 1:");
        obj[0].Method("Prithivi","CSBS",198.9);
        obj[0].show();

        System.out.println("Number 2:");
        obj[1].Method("Raj","CSE",145.78);
        obj[1].show();

        System.out.println("Number 3:");
        obj[2].Method("Viper","MECH",145.45);
        obj[2].show();



                //for each loop to display the toString::
                //   for(ArrayOfObjects s:obj) {
                //     System.out.println(s);
                //   }

    }
}