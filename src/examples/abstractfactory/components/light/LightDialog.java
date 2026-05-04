package examples.abstractfactory.components.light;

import examples.abstractfactory.Dialog;

public class LightDialog implements Dialog {
    @Override
    public void open() {
        System.out.println("[Light] Aabner lys dialog");
    }
}

