import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {

        // (Optional debug) shows where Eclipse is running from:
        System.out.println("RUN FOLDER: " + System.getProperty("user.dir"));

        String inputFile = "students.txt";
        String outputFile = "grades_report.txt";

        try {
            ReportWriter.processFile(inputFile, outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + inputFile + " not found. Put it in the project/run folder.");
        } finally {
            System.out.println("Processing Complete");
        }
    }
}