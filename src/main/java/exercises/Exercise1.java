package exercises;


public class Exercise1 {

    public static Number divide(int num1, int num2) {

        if (num1 == 0 || num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }

        return num1/num2;


//        Number result = null;
//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            System.err.println("Cannot divide by zero");
//        }
//        return result;
    }
}