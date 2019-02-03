package pl.sii.tasks;

public class Task2 {

    private void saveCase() {
        Helper helper = new Helper();
        Helper.Button button = helper.findButton("//*[contains(text(), 'Save')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input");
        helper.clickButton(button);
        String okButton = "//*[contains(text(), 'Ok')]/../following-sibling::td/label[contains(text(), '>=')]/../..//input";
        Helper helper2 = new Helper();
        Helper.Button button2 = helper2.findButton(okButton);
        helper2.clickButton(button2);
    }

    public static void main(String[] args) {
        Task2 extractionPractice = new Task2();
        extractionPractice.saveCase();
    }

    private static class Helper {

        public Button findButton(String xpath) {
            return new Button(xpath);
        }

        public void clickButton(Button button) {
            button.click();
        }

        private class Button {
            String xpath;

            public Button(String xpath) {
                this.xpath = xpath;
            }

            private void click() {}

        }
    }
}