public class Student {
    String name;
    int age;

    public Student(String name, int age, boolean isEligible, String college) {
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
        this.college = college;
    }

    boolean isEligible;

    String college;

    public Student(String name, int age, boolean isEligible) {
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
    }

}
