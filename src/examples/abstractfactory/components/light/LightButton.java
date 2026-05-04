package examples.abstractfactory.components.light;

import examples.abstractfactory.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("[Light] Viser lys knap");
    }
}

