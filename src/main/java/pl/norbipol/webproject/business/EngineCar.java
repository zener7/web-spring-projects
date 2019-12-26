package pl.norbipol.webproject.business;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.norbipol.webproject.model.Car;

import javax.annotation.PostConstruct;

@Service
@Scope(value = "prototype")
public class EngineCar implements Engine {

    @PostConstruct
    public void init(){
        System.out.println("start Engine Car");
    }

    @Override
    public boolean start(Car car) {
//        car.setName("polonez");
        car = new Car("polonez");
        System.out.println(car.getName() + " was started");
        return true;
    }
}
