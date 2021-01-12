package web.repositories;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getAllCars();

    public List<Car> getCountCars(int count);
}
