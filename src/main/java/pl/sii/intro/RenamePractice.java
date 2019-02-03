package pl.sii.intro;

public class RenamePractice {

    private static class Cosiek {
        private String cosiek1;
        private String cosiek2;

        public Cosiek(String cosiek1, String cosiek2) {
            this.cosiek1 = cosiek1;
            this.cosiek2 = cosiek2;
        }

        private String welcomeCosiek() {
            return String.format("Hello! Your name is: %s, and your surname is: %s",
                    cosiek1, cosiek2);
        }
    }

    public static void main(String[] args) {
        String cosiek1 = "";
        String cosiek2 = "";
        Cosiek cosiek = new Cosiek(cosiek1, cosiek2);
        System.out.println(cosiek.welcomeCosiek());
    }
}
