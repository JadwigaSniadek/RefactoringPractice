package pl.sii.tasks;

import pl.sii.secrets.SecretHelperEnum;
import pl.sii.tasks.enums.ButtonNamesEnum;

public class Task2 {
    private String controller = "";

    public void saveCase() {
        Helper helper = new Helper();
        String command = "Save";
        Helper.Button button = helper.findButton("//*[contains(text(), '" + command + "')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input");
        helper.clickButton(button);
        command = "Ok";
        String okButton = "//*[contains(text(), '" + command + "')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input";
        Helper helper2 = new Helper();
        Helper.Button button2 = helper2.findButton(okButton);
        helper2.clickButton(button2);
        String exitButton = "//*[contains(text(), 'Exit')]/../following-sibling::td/label[contains(text(), 'X')]/../..//input";
        Helper.Button button3 = helper2.findButton(exitButton);
        helper2.clickButton(button3);
    }

    private final static String XPATH = "//*[contains(text(), '%s')]/../following-sibling::td/label[contains(text(), '%s')]/../..//input";
    //%s - string
    //%d - digit
    private Helper helper = new Helper();

    public void saveCase2() {
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.SAVE, ">="));
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.OK, ">="));
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.EXIT, "X"));
    }

    private void findAndClickButton(final String xpath) {
        Helper.Button button = helper.findButton(xpath);
        helper.clickButton(button);
    }

    //to samo co powyżej

    private String buildXpath(String command, String tag) {
    return "//*[contains(text(), '\" + command + \"')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input";
    }


    private class Helper {

        public Button findButton(String xpath) {
            updateController(xpath,"f");
            return new Button(xpath);
        }

        public void clickButton(Button button) {
            updateController(button.xpath,"c");
            button.click();
        }

        private void updateController(String xpath, String action) {
            StringBuilder sb = new StringBuilder(controller);
            if (xpath.equals(SecretHelperEnum.TASK2SAVE.getHelperValue())) {
                sb.append(action).append("s");
            } else if (xpath.equals(SecretHelperEnum.TASK2OK.getHelperValue())) {
                sb.append(action).append("o");
            } else if (xpath.equals(SecretHelperEnum.TASK2EXIT.getHelperValue())) {
                sb.append(action).append("e");
            }
            controller = sb.toString();
        }

        private class Button {
            String xpath;

            public Button(String xpath) {
                this.xpath = xpath;
            }

            private void click() {}
        }
    }

    public String getController() {
        return controller;
    }
}