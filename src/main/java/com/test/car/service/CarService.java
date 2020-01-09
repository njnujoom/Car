package com.test.car.service;

import com.test.car.entity.Car;
import com.test.car.repository.CarRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final @NonNull CarRepository carRepository;

    public List<Car> listAll() {
        return carRepository.findAll();
    }

    public Car addCar(Car car) {
        return carRepository.insert(car);
    }

}
