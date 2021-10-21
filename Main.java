import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        char b = scanner.next().charAt(0);
        long c = scanner.nextLong();

        long result;

        switch (b) {
            case 43:
                result = a + c;
                System.out.println(result);
                break;
            case 45:
                result = a - c;
                System.out.println(result);
                break;
            case 47:
                if (c == 0) {
                    System.out.println("Division by 0!");
                } else {
                    result = a / c;
                    System.out.println(result);
                }
                break;
            case 42:
                result = a * c;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");

        }



    }
}