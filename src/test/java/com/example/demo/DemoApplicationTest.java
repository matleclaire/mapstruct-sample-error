package com.example.demo;

import com.example.demo.mappers.v1.CarMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class DemoApplicationTest {


  /**
   *  {@link Mappers#getMapper(Class)}  should retrieve the mapper v1 {@link CarMapper}
   *  That has been defined with a custom implementationName.
   *
   *  But an exception is thrown
   */
  @Test
  public void should_retrieve_mapper() {
    CarMapper carMapperV1 = Mappers.getMapper(CarMapper.class);
    //This is throwing : java.lang.ClassNotFoundException: Cannot find implementation for com.example.demo.mappers.v1.CarMapper
  }

}
