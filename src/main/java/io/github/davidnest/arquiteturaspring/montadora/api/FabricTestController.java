package io.github.davidnest.arquiteturaspring.montadora.api;

import io.github.davidnest.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class FabricTestController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
    var car = new BmwM4G80(motor);

    return car.doIgnition(key);
    }
}
