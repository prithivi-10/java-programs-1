import java.util.*;

class  Student {
    private int rollNo;
    public int mark1;
    public int mark2;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public void show() {

      
      //  System.out.println("Simply printing the name:"+name);

        System.out.println("RollNumber is: "+rollNo+" and the sum of mark1 and the mark2 is: "+(mark1+mark2)+"\n");

    }

}
public class data_Hiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for data hiding:");
        System.out.println("========================\n");

        Student std= new Student();

       // std.rollNo=2001;

       System.out.println("Enter the rollNumber of the student:");
       int rollNo;
       rollNo=sc.nextInt();
       std.setRollNo(rollNo);

        std.mark1=80;
        std.mark2=90;

        std.show();

    }
}