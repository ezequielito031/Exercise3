public class StudentParser {

    // Returns null if line is invalid so program can skip it
    public static Student parseLine(String line) {
        if (line == null) return null;

        line = line.trim();
        if (line.isEmpty()) return null;

        String[] parts = line.split("\\s+"); // name score1 score2 score3
        if (parts.length != 4) return null;

        String name = parts[0];

        try {
            int s1 = Integer.parseInt(parts[1]);
            int s2 = Integer.parseInt(parts[2]);
            int s3 = Integer.parseInt(parts[3]);
            return new Student(name, s1, s2, s3);
        } catch (NumberFormatException e) {
            return null; // example: "Bob_Jones 70 Error 90"
        }
    }
}