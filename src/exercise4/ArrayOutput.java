package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOutput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int a = input.nextInt();
    int[] numbers = new int[a];
    String space = " ";
    System.out.println("Enter array elements: ");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextInt();
     }
    for (int number: numbers) {
      System.out.println(number);
      System.out.print(space);
      space = space + " ";
    }
    
    }
  }
