package io.github.davidnest.arquiteturaspring.montadora;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String model;
    private Color color;
    private Motor motor;
    private Automaker automaker;

    public Car(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "CAR SETTINGS: \n"
                + "Model: " + model + '\n'
                + "Color: " + color + '\n'
                + "Motor: " + motor + '\n'
                + "Automaker: " + automaker;
    }

    public CarStatus doIgnition(Key key) {
        if(key.getAutoMaker() == null || !key.getAutoMaker().equals(this.automaker)) {
            return new CarStatus("It's not possible to start the car with this key");
        }
        return new CarStatus("Car started successfully. Running with the engine: " + motor);
    }
}
