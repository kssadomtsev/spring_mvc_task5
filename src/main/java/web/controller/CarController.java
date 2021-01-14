package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarManagerImpl;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarManagerImpl carManager;

    public CarController(CarManagerImpl carManager) {
        this.carManager = carManager;
    }

    @GetMapping
    public String printCars(@RequestParam Optional<Integer> count, ModelMap model) {
        List<Car> cars;
        if (!count.isPresent() || count.get() >= 5) {
            cars = carManager.getAllCars();
        } else {
            cars = carManager.getCountCars(count.get());
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
