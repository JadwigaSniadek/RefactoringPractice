package pl.sii.tasks.enums;

public enum ButtonNamesEnum {

    SAVE("Save"),
    EXIT("Exit"),
    CANCEL("Cancel"),
    OK("OK");

    private String buttonName;

    ButtonNamesEnum(final String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
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
}
