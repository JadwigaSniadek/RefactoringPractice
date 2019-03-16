package pl.sii.tasks;

public class Task4 {

    private static final String PREFIX = "its prefix for our test cases case";

    public static void testCases() {
        for (int i = 1; i < 4; i++) {
            checkSomething(PREFIX + i);
        }
    }

    private static void checkSomething(final String caseString) {
        System.out.println(caseString + " checked!");
    }

    public static void main(String[] args) {
        testCases();
    }
}
