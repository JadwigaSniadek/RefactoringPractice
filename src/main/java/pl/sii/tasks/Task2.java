package pl.sii.tasks;

import pl.sii.secrets.SecretHelperEnum;
import pl.sii.tasks.enums.ButtonNamesEnum;

public class Task2 {
    private String controller = "";

    private final static String XPATH = "//*[contains(text(), '%s')]/../following-sibling::td/label[contains(text(), '%s')]/../..//input";
    //%s - string
    //%d - digit
    private Helper helper = new Helper();

    public void saveCase() {
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.SAVE, ">="));
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.OK, ">="));
        findAndClickButton(String.format(XPATH, ButtonNamesEnum.EXIT, "X"));
    }

    private void findAndClickButton(final String xpath) {
        Helper.Button button = helper.findButton(xpath);
        helper.clickButton(button);
    }

    private class Helper {

        public Button findButton(String xpath) {
            updateController(xpath, "f");
            return new Button(xpath);
        }

        public void clickButton(Button button) {
            updateController(button.xpath, "c");
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

            private void click() {
            }
        }
    }

    public String getController() {
        return controller;
    }
}