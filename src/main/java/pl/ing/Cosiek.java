package pl.ing;

public class Cosiek {




    public boolean testSomething(int a, int b, int c) {
        boolean result;
        if(a<8&&b<8&&c<8) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void stringConcatenation() {
        String hello = "Hello";
        for (int i = 0; i < 10000; i++) {
            hello = hello + " Quora";
        }
    }

    public void stringConcatenationBuilder() {
        StringBuilder hello = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            hello.append(" Quora");
        }
    }


    public static void main(String[] args) {

    }
}
