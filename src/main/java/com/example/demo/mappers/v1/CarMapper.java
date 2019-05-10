package com.example.demo.mappers.v1;

import com.example.demo.dtos.CarDTO;
import com.example.demo.models.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", implementationName = "<CLASS_NAME>V1Impl")
public interface CarMapper {


  @Mapping(target = "color", ignore = true)
  CarDTO map(Car car);

}
