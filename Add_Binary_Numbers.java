import java.util.Scanner;
public class AddBinaryNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first binary number: ");
    String binary1 = scanner.nextLine();
    System.out.print("Enter second binary number: ");
    String binary2 = scanner.nextLine();
    int num1 = Integer.parseInt(binary1, 2);
    int num2 = Integer.parseInt(binary2, 2);
    int sum = num1 + num2;
    String binarySum = Integer.toBinaryString(sum);
    System.out.println("Sum of binary numbers: " + binarySum);
    scanner.close();
    }
  }
