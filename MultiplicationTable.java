public class MultiplicationTables {
    public static void main(String[] args) {
        for (int number = 1; number <= 16; number++) {
            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 16; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println();
        }
    }
}
