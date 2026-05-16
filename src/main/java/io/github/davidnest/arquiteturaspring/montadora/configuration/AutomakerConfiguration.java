package io.github.davidnest.arquiteturaspring.montadora.configuration;

import io.github.davidnest.arquiteturaspring.montadora.Motor;
import io.github.davidnest.arquiteturaspring.montadora.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class   AutomakerConfiguration {

    @Bean
    public Motor motor() {
        var motor = new Motor("V8", 500.0, 8, 4.0, MotorType.ASPIRADO);
        return motor;
    }
}
