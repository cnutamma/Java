//Write a function that takes in the radius as input and returns the circumference of a circle.
//circumference of circle=2*pie*radius
package Functions;

import java.util.Scanner;

public class q4 {
    public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Double radius = sc.nextDouble();
      System.out.println(getCircumference(radius));
   }   
}

    
