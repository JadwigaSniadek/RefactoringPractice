package pl.sii.tasks;

import pl.sii.secrets.SecretHelperEnum;

import static pl.sii.tasks.enums.ButtonNamesEnum.EXIT;
import static pl.sii.tasks.enums.ButtonNamesEnum.OK;
import static pl.sii.tasks.enums.ButtonNamesEnum.SAVE;

public class Task2 {
    private String controller = "";

    private static final String XPATH = "//*[contains(text(), '%s')]/../following-sibling::td/label[contains(text(), '%s')]/../..//input";
    private Helper helper = new Helper();

    public void saveCase() {
        findAndClickButton(String.format(XPATH, SAVE, ">="));
        findAndClickButton(String.format(XPATH, OK, ">="));
        findAndClickButton(String.format(XPATH, EXIT, "X"));
    }

    private void findAndClickButton(final String xpath) {
        Helper.Button button = helper.findButton(xpath);
        helper.clickButton(button);
    }

    private String buildXpath(String command, String tag) {
        return "//*[contains(text(), '" + command + "')]/../following-sibling::td/label[contains(text(), '" + tag + "')]/../..//input";
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