package io.github.davidnest.arquiteturaspring.montadora.configuration;

import io.github.davidnest.arquiteturaspring.montadora.Motor;
import io.github.davidnest.arquiteturaspring.montadora.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class   AutomakerConfiguration {

    @Bean
    public Motor aspiratedMotor() {
        var motor = new Motor("V8", 500.0, 8, 4.0, MotorType.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor eletricMotor() {
        var eletricMotor = new Motor("V3", 118.0, 3, 1.4, MotorType.ELETRICO);
        return eletricMotor;
    }

    @Bean
    public Motor turboMotor() {
        var turboMotor = new Motor("V4", 180.0, 4, 1.5, MotorType.TURBO);
        return turboMotor;
    }

}
