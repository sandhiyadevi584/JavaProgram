import java.util.Scanner;
public class SimpleInterestCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter principal amount (P): ");
    double principal = scanner.nextDouble();
    System.out.print("Enter annual interest rate (R in %): ");
    double rate = scanner.nextDouble();
    System.out.print("Enter time in years (T): ");
    double time = scanner.nextDouble();
    double simpleInterest = (principal * rate * time) / 100;
    System.out.printf("Simple Interest: %.2f%n", simpleInterest);
    System.out.printf("Total Amount (P + SI): %.2f%n", (principal + simpleInterest));
    scanner.close();
    }
  }
