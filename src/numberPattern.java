public class numberPattern {

    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern(int type, int n) {
        if (n <= 0) {
            System.out.println("Size must be positive");
        } else if (type == 1) {
            printRightTriangle(n);
        } else if (type == 2) {
            printInvertedTriangle(n);
        } else if (type == 3) {
            printPyramid(n);
        } else if (type == 4) {
            printInvertedPyramid(n);
        } else if (type == 5) {
            printNumberTriangle(n);
        } else {
            System.out.println("Wrong type");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int type = 1;

        printPattern(type, n);
    }
}
