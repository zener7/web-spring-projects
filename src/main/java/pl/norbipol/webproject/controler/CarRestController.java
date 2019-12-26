package pl.norbipol.webproject.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.norbipol.webproject.business.Engine;
import pl.norbipol.webproject.model.Car;

@RestController
@RequestMapping(path = "/car")
public class CarRestController {

    @Autowired
    private Engine engine;

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello";
    }


    @GetMapping(path = "/info")
    public CarResponse infoCar(){
        Car maluch =  new Car("maluch");
        boolean isStart = engine.start(maluch);
        return new CarResponse(maluch.getName(), isStart);
    }

    @PostMapping(path = "/create-start")
    public CarResponse createAndStartCar(@RequestBody CarRequest carRequest){
        Car maluch =  new Car(carRequest.getName());
        boolean isStart = engine.start(maluch);
        return new CarResponse(maluch.getName(), isStart);
    }


    public String test(){
        return "test";
    }

}
