package pl.sii.secrets;

public enum SecretHelper {
    // no cheating please
    TASK2SAVE("//*[contains(text(), 'Save')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input"),
    TASK2OK("//*[contains(text(), 'Ok')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input"),
    TASK2EXIT("//*[contains(text(), 'Exit')]/../following-sibling::td/label[contains(text(), 'X')]/../..//input"),
    TASK2RESULT("fscsfocofece");

    private String helperValue;

    SecretHelper(String helperValue) {
        this.helperValue = helperValue;
    }

    public String getHelperValue() {
        return helperValue;
    }
}
