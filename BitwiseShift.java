import java.util.Scanner;
public class BitwiseShiftExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    System.out.print("Enter shift value: ");
    int shift = scanner.nextInt();
    int leftShift = number << shift;
    int rightShift = number >> shift;
    System.out.println("Original number: " + number);
    System.out.println("Left Shift (" + number + " << " + shift + ") = " + leftShift);
    System.out.println("Right Shift (" + number + " >> " + shift + ") = " + rightShift);
    scanner.close();
    }
  }
