package pl.norbipol.webproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.norbipol.webproject.business.Engine;
import pl.norbipol.webproject.business.EngineCar;
import pl.norbipol.webproject.model.Car;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WebprojectApplication {

    @Autowired
    private Engine engineBean;

    @PostConstruct
    public void init(){
       engineBean.start(new Car("maluch"));
//       engineBean.start(new Car("polonez"));
    }

    public static void main(String[] args) {
        SpringApplication.run(WebprojectApplication.class, args);

//        Car maluch = new Car("maluch");
//        new EngineCar().start(maluch);
//        System.out.println(maluch.getName());
    }

}
