package pl.sii.intro;

public class ExtractionPractice {

    public void doTest() {
        Helper helper = new Helper();
        helper.typeTextIntoField("TEST_USERNAME", "USERNAME_FIELD_XPATH");
        helper.typeTextIntoField("TEST_USER_PASSWORD_HASHED", "PASSWORD_FIELD_XPATH");
        helper.clickButton("LOGIN_BUTTON_XPATH");

        helper.typeTextIntoField("TEST_TEXT", "TEST_FIELD");
        helper.checkFieldText("TEST_TEXT", "TEST_FIELD");

        helper.clickButton("LOGOUT_BUTTON_XPATH");
        helper.clickButton("CONFIRM_LOGOUT_BUTTON_XPATH");
    }

    private class Helper {
        public void typeTextIntoField(String text, String fieldXpath) {}
        public void clickButton(String buttonXpath) {}
        public void checkFieldText(String test_text, String test_field) {}
    }
}
