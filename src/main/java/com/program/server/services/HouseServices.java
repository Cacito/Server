package com.program.server.services;

import com.program.server.models.House;
import com.program.server.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServices {

    @Autowired
    private HouseRepository houseRepo;

    public House addHouse(House newhouse){
        House house = houseRepo.save(newhouse);
        return house;
    }

    public Iterable<House> getAllHouse(){
        Iterable<House> houses = houseRepo.findAll();
        return houses;
    }
}
