package com.program.server.controler;

import com.program.server.models.House;
import com.program.server.services.HouseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path="v0/house", produces = MediaType.APPLICATION_JSON_VALUE)
public class HouseController {

    private HouseServices houseService;

    @Autowired
    public HouseController(HouseServices houseService) {
        this.houseService = houseService;
    }

    @PostMapping
    public ResponseEntity<House> createHouse(@RequestBody House house){
        House newHouse = houseService.addHouse(house);
        return new ResponseEntity<>(newHouse, HttpStatus.CREATED);
    }

}
