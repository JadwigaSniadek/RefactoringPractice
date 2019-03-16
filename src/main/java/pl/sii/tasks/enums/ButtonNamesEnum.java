package pl.sii.tasks.enums;

public enum ButtonNamesEnum {

    SAVE("Save"),
    EXIT("Exit"),
    CANCEL("Cancel"),
    OK("Ok");

    private String buttonName;  //tutaj dodajemy parametr, konstruktor powinien miec te sama nazwę.

    ButtonNamesEnum(final String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {    //"geter" albo "seter"
        return buttonName;
    }

    public ButtonNamesEnum findButtonByName(final String buttonName) {
        for (ButtonNamesEnum button : ButtonNamesEnum.values()) {
            if (button.getButtonName().equals(buttonName)) {
                return button;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return getButtonName();
    }
}
