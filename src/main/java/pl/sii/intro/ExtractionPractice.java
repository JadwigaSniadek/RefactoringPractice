package pl.sii.intro;

public class ExtractionPractice {

    public static final String TEST_USERNAME = "TEST_USERNAME";
    public static final String USERNAME_FIELD_XPATH = "USERNAME_FIELD_XPATH";
    public static final String TEST_USER_PASSWORD_HASHED = "TEST_USER_PASSWORD_HASHED";
    public static final String PASSWORD_FIELD_XPATH = "PASSWORD_FIELD_XPATH";
    public static final String LOGIN_BUTTON_XPATH = "LOGIN_BUTTON_XPATH";
    public static final String TEST_TEXT = "TEST_TEXT";
    public static final String TEST_FIELD = "TEST_FIELD";
    public static final String LOGOUT_BUTTON_XPATH = "LOGOUT_BUTTON_XPATH";
    public static final String CONFIRM_LOGOUT_BUTTON_XPATH = "CONFIRM_LOGOUT_BUTTON_XPATH";

    public void doTest() {
        Helper helper = new Helper();
        login(helper);
        test(helper);
        logout(helper);
    }

    private void logout(Helper helper) {
        helper.clickButton(LOGOUT_BUTTON_XPATH);
        helper.clickButton(CONFIRM_LOGOUT_BUTTON_XPATH);
    }

    private void test(Helper helper) {
        helper.typeTextIntoField(TEST_TEXT, TEST_FIELD);
        helper.checkFieldText(TEST_TEXT, TEST_FIELD);
    }

    private void login(Helper helper) {
        helper.typeTextIntoField(TEST_USERNAME, USERNAME_FIELD_XPATH);
        helper.typeTextIntoField(TEST_USER_PASSWORD_HASHED, PASSWORD_FIELD_XPATH);
        helper.clickButton(LOGIN_BUTTON_XPATH);
    }

    private class Helper {
        public void typeTextIntoField(String text, String fieldXpath) {
        }

        public void clickButton(String buttonXpath) {
        }

        public void checkFieldText(String test_text, String test_field) {
        }
    }
}
