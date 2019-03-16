package pl.sii.tasks.enums;

public enum ButtonNamesEnum {

    SAVE("Save"),
    EXIT("Exit"),
    OK("Ok");

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

    @Override
    public String toString() {
        return getButtonName();
    }
}
