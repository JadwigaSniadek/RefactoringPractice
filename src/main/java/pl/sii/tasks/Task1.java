package pl.sii.tasks;

public class Task1 {

    public static boolean testSomething(int a, int b, int c) {
        boolean result;
        if(a<8) {
            if(b<8) {
                if(c<8) {
                    result = true;
                } else {
                    result = false;
                }
            } else {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }
}
