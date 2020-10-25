package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MinIndex {
  public static void main(String[] args) {
    int index = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int a = input.nextInt();
    double[] numbers = new double[a];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
      double min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if(min > numbers[i]) {
        min = numbers[i];
        index = i;

      }
      }
      System.out.println("Min index: " + index);
  }
}