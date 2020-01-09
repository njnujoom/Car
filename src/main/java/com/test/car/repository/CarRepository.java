package com.test.car.repository;

import com.test.car.entity.Car;

import java.util.List;

public interface CarRepository {
    Car insert(Car car);

    List<Car> findAll();
}
