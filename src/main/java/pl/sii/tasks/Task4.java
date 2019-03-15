package pl.sii.tasks;

public class Task4 {

    private static final String prefix = "its prefix for our test cases";

    private static final String case1 = prefix + "case1";
    private static final String case2 = prefix + "case2";
    private static final String case3 = prefix + "case3";

    public static void testCases() {
        checkSomething(case1);
        checkSomething(case2);
        checkSomething(case3);
    }

    private static void checkSomething(final String caseString) {
        System.out.println(caseString + " checked!");
    }
}
