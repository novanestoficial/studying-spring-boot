package io.github.davidnest.arquiteturaspring.montadora;

import java.awt.*;

public class BmwM4G80 extends Car{

    public BmwM4G80(Motor motor) {
        super(motor);
        setModel("Bmw M4 G80");
        setColor(Color.RED);
        setAutomaker(Automaker.BMW);
    }


}
