package com.example.demo.mappers.v2;

import com.example.demo.dtos.CarDTO;
import com.example.demo.models.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", implementationName = "<CLASS_NAME>V2Impl")
public interface CarMapper {

  CarDTO map(Car car);

}
