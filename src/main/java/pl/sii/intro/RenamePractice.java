package pl.sii.intro;

public class RenamePractice {

    private static class User {
        private String name;
        private String surname;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        private String welcomeCosiek() {
            return String.format("Hello! Your name is: %s, and your surname is: %s",
                    name, surname);
        }
    }

    public static void main(String[] args) {
        String cosiek1 = "";
        String cosiek2 = "";
        User user = new User(cosiek1, cosiek2);
        System.out.println(user.welcomeCosiek());
    }
}
