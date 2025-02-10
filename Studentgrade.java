   import java.util.ArrayList;
import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter student grades (enter -1 to stop):");
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            int highest = getHighest(grades);
            int lowest = getLowest(grades);
            double average = getAverage(grades);
            
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
            System.out.printf("Average grade: %.2f\n", average);
        }
        
        scanner.close();
    }
    
    private static int getHighest(ArrayList<Integer> grades) {
        int max = grades.get(0);
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
    
    private static int getLowest(ArrayList<Integer> grades) {
        int min = grades.get(0);
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }
    
    private static double getAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
