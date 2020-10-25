package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int a = input.nextInt();
    double[] numbers = new double[a];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
      double max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if(max < numbers[i]) {
        max = numbers[i];
      }
      }
      System.out.println("Max number: " + max);

    
  }
}