public class Student {
    private final String name;
    private final int s1;
    private final int s2;
    private final int s3;

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String getName() { return name; }
    public int getS1() { return s1; }
    public int getS2() { return s2; }
    public int getS3() { return s3; }
}