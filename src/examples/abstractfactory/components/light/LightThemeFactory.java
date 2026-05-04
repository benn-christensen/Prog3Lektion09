package examples.abstractfactory.components.light;

import examples.abstractfactory.Button;
import examples.abstractfactory.Dialog;
import examples.abstractfactory.UiFactory;

public class LightThemeFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Dialog createDialog() {
        return new LightDialog();
    }
}

