package web.services;

import web.model.Car;

import java.util.List;

public interface CarManager {
    public List<Car> getAllCars();

    public List<Car> getCountCars(int count);
}
