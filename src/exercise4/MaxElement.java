package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    double a = input.nextDouble();
    double[] numbers = new double[a];
    int i;
    System.out.println("Enter array elements: ");
    for (i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
      double max = numbers[i];
      for (double num: numbers) {
            if(max < num) {
                max = num;
            }
      }

    
  }
}