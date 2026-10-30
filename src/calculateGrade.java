import java.util.Scanner;

public class calculateGrade {

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) return "Invalid.";
        else if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score: ");
            int score = sc.nextInt();
            System.out.println(calculateGrade(score));
        }
    }
}