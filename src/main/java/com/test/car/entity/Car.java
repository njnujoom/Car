package com.test.car.entity;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Car {
    private String carId;
    private String make;
    private String model;
    private Integer year;
}
