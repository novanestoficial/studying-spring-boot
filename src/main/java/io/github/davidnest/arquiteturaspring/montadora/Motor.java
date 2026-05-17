package io.github.davidnest.arquiteturaspring.montadora;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motor {
    private String model;
    private Double horsesPower;
    private Integer cylinders;
    private Double litrage;
    private MotorType type;


    @Override
    public String toString() {
        return "MOTOR SETTINGS: "
                + " Model: " + model
                + " Horse Power: " + horsesPower
                + " Cylinders: " + cylinders
                + " Litrage: " + litrage
                + " Type: " + type;
    }
}
