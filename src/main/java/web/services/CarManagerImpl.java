package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repositories.CarDAO;

import java.util.List;

@Service
public class CarManagerImpl implements CarManager {

    private final CarDAO carDAO;

    @Autowired
    public CarManagerImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getCountCars(int count) {
        return carDAO.getCountCars(count);
    }
}
