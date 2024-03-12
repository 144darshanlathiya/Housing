package com.Housing.Housing.Repository;

import com.Housing.Housing.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Housereposititory extends JpaRepository<House,Long> {
    @Query(value = "Select avg(salePrice) from House")
    int avgAllSell();

    @Query(value = "SELECT location , AVG(salePrice) FROM House GROUP BY location" )
    List<Object> avglocation();

    @Query(value = "SELECT id,salePrice FROM House WHERE salePrice = (SELECT MAX(salePrice) FROM House)")
    List<Object> maxsaleprice();

    @Query(value = "SELECT id,salePrice FROM House WHERE salePrice = (SELECT MIN(salePrice) FROM House)")
    List<Object> minsaleprice();
}
