package pl.sii.intro;

public class DebugPractice {

    private static void loop() {
        for (int i = 0; i < 10; i++) {
            int secretCounter = i + 2;
            System.out.println(secretCounter);
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
