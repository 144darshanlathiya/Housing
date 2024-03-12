package com.Housing.Housing.Service;

import com.Housing.Housing.Entity.House;
import com.Housing.Housing.Repository.Housereposititory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingService {

    @Autowired
     Housereposititory housereposititory;



    public void adddata(List<House> data) {
        housereposititory.saveAll(data);
    }

    public int Averagesaleprice(){
        return housereposititory.avgAllSell();
    }

    public List<Object> AvrageByLocation(){
        return housereposititory.avglocation();
    }

    public List<Object> maxsaleprice(){
        return  housereposititory.maxsaleprice();
    }

    public List<Object> minsaleprice(){
        return housereposititory.minsaleprice();
    }
}
