package com.test.car.controller;

import com.test.car.entity.Car;
import com.test.car.service.CarService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final @NonNull CarService carService;

    @GetMapping("/all-cars")
    public ResponseEntity<List<Car>> listAll(){
        return ResponseEntity.ok(carService.listAll());
    }

    @PostMapping("/add-car")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return ResponseEntity.ok(carService.addCar(car));
    }


}
