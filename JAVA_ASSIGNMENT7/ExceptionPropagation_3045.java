import java.io.*;

public class ExceptionPropagation_3045 {

    public static void main(String[] args) {
        ExceptionPropagation_3045 ep = new ExceptionPropagation_3045();
        System.out.println("Sivaranjani -2022503045");
        try {
            ep.uncheckedExceptionExample();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        
        try {
            ep.checkedExceptionExample();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }


    void uncheckedExceptionExample() {
        level1();
    }

    void level1() {
        level2();
    }

    void level2() {
        // This will throw an ArithmeticException (division by zero)
        int result = 10 / 0;
    }

    
    void checkedExceptionExample() throws IOException {
        levelA();
    }

    void levelA() throws IOException {
        levelB();
    }

    void levelB() throws IOException {
        // Throwing a checked exception
        throw new IOException("Checked exception occurred in levelB");
    }
}

