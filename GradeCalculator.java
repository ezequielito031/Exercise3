public class GradeCalculator {

    public static double average(Student s) {
        return (s.getS1() + s.getS2() + s.getS3()) / 3.0;
    }

    public static void checkLow(double avg) throws LowGradeException {
        if (avg < 60.0) {
            throw new LowGradeException("Average below 60");
        }
    }
}