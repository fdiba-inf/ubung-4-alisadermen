package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReversal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int a = input.nextInt();
    char[] numbers = new char[a];
    char[] reversed = new char[numbers.length];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < numbers.length; i++ ) {
      numbers[i] = input.next().charAt(0);
    }
    for (int j = numbers.length - 1; j >=0; j-- ){

      System.out.println(numbers[j]);
    }
  }
}