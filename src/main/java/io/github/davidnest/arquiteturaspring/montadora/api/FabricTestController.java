package io.github.davidnest.arquiteturaspring.montadora.api;

import io.github.davidnest.arquiteturaspring.montadora.BmwM4G80;
import io.github.davidnest.arquiteturaspring.montadora.Car;
import io.github.davidnest.arquiteturaspring.montadora.Key;
import io.github.davidnest.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FabricTestController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
    var car = new BmwM4G80(motor);

    return car.doIgnition(key);
    }
}
