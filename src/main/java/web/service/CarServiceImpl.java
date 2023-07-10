package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Lada", "Vesta", "Red"));
        cars.add(new Car("Mercedes", "S63", "Blue"));
        cars.add(new Car("Volkswagen", "Polo", "White"));
        cars.add(new Car("Kia", "K5", "Green"));
        cars.add(new Car("Ferrari", "Enzo", "Yellow"));

    }
    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
