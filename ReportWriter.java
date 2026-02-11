import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReportWriter {

    public static void processFile(String inputFile, String outputFile) throws FileNotFoundException {

        // try-with-resources: closes Scanner and PrintWriter automatically
        try (Scanner fileScanner = new Scanner(new File(inputFile));
             PrintWriter out = new PrintWriter(outputFile)) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                Student student = StudentParser.parseLine(line);

                if (student == null) {
                    System.out.println("Warning: invalid data, skipping -> " + line);
                    continue;
                }

                double avg = GradeCalculator.average(student);

                // Bonus: mark Warning if average below 60
                try {
                    GradeCalculator.checkLow(avg);
                    out.printf("Student: %s | Average: %.2f%n", student.getName(), avg);
                } catch (LowGradeException e) {
                    out.printf("Student: %s | Average: %.2f | Warning%n", student.getName(), avg);
                }
            }
        }
    }
}