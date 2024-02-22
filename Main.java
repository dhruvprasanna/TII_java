public class Main {
    public static void main(String[] args) {
        Student abdul;
        abdul = new Student("abdul",10,true);
        System.out.println(abdul.age);
        Student s2 = new Student("dhruv",100,true,"PESU");
        System.out.println(s2.name);
        Car v1 = new Car();
        Bike v2 = new Bike();
        System.out.println(v1.displaySpeed());
        System.out.println(v2.displaySpeed());
    }
}