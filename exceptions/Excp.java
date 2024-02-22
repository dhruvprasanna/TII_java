package exceptions;

public class Excp {
    public static void main(String[] args) throws CustomException {
        int age = 1025;
        if (age == 10){
            throw new CustomException("custom");
        }
        else {
            System.out.println("running");
        }
        someMethod();

    }

    private static void someMethod() {
        int j = 1;

        for (int i = 1;i < 1000;i+=50){
            j *= i;
        }
    }
}
