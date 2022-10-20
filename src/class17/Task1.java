package class17;

import javax.naming.PartialResultException;

public class Task1 {

   // Create a method that will accept an array as parameters and will return a sum of all elements from that array. Method should be visibly only within same package and accessible by the creating an instance of the class.
   // Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes within your project and accessible by class name.
   // Create a method that will accept a String as a parameter and return a new String that consist only of vowels. Method should be available inside the class only where it was declared and executed by calling it is name.
  public   int SumArray(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;

        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 find=new Task1();
        int[]array={10,15,20,30};
        System.out.println(find.SumArray(array));
    }
}
