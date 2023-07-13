import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String labName = "Lab 16.2";
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter
                formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy @ HH:mm");
        String use = System.getProperty("user.dir");
        String user = System.getProperty("user.name");
        System.out.println("Working Directory: " + use);
        System.out.println("Programmer: " + user);
        String labTime = String.format("%s: %s%n", labName,
                now.format(formatter));
        System.out.println(labTime);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        double sum = 0.00;
        for(int i = 0; i < 3; i++) {
            String s = String.format("Enter test score #%s:", i + 1);
            System.out.printf("%-28s", s);
            double score = sc.nextDouble();
            sum += score;
        }



        double average = sum / 3;
        System.out.printf("%s, the average score is %.2f%n", name, average);
        String letterGrade;
        if (89 < average) {
            letterGrade = "A";
        } else if (79 < average) {
            letterGrade = "B";
        } else if (69 < average) {
            letterGrade = "C";
        } else if (59 < average) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.printf("The letter grade is %s", letterGrade);
    }
}