import java.util.Scanner;

class PatternIter {

    public static void printPattern(int size) {
        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int mid = (size + 1) / 2;
        int initialSpace = 2 * (mid - 1);

        for (int row = 1; row <= mid; row++) {
            printSpaces(initialSpace - (2 * (row - 1)));
            printStars(1 + (4 * (row - 1)));
            System.out.println();
        }

        if (size % 2 == 0) {
            for (int row = mid; row >= 1; row--) {
                printSpaces(initialSpace - (2 * (row - 1)));
                printStars(1 + (4 * (row - 1)));
                System.out.println();
            }
        } else {
            for (int row = mid - 1; row >= 1; row--) {
                printSpaces(initialSpace - (2 * (row - 1)));
                printStars(1 + (4 * (row - 1)));
                System.out.println();
            }
        }
    }

    static void printSpaces(int n) {
        for (int i = 0; i < n; i++) System.out.print(" ");
    }

    static void printStars(int n) {
        for (int i = 0; i < n; i++) System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        final int size = sc.nextInt();
        printPattern(size);
        sc.close();
    }
}