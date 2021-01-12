package web.repositories;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "Tiguan", 113));
        cars.add(new Car(2L, "X3", 209));
        cars.add(new Car(3L, "Samara", 15));
        cars.add(new Car(4L, "X-Trail", 55));
        cars.add(new Car(5L, "X-Trail", 155));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return cars.subList(0, count);
    }
}
