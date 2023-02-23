package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CarController{

    @GetMapping("/car")
    public CarDTO getCar(){
        CarDTO newCar = new CarDTO("1001", "Wolksvagen Golf Mk7",14000);
        return newCar;
    }

    @PostMapping("/car")
    public ResponseEntity<String> postCar(@Valid @RequestBody CarDTO car){
        System.out.println(car);
        return new ResponseEntity<>("Success!", HttpStatus.OK);
    }


}