package com.example.SecurityImplementation.service;

import com.example.SecurityImplementation.entity.Driver;
import com.example.SecurityImplementation.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService
{
    @Autowired
    private DriverRepository repo;

    public Driver SaveDriver(Driver driver)
    {
        return repo.save(driver);
    }

    public List<Driver> fetchalldriver()
    {
        return repo.findAll();
    }

    public ResponseEntity<Driver> updateDriver(Driver driver,int id)
    {
        Optional<Driver>  d=repo.findById(id);
        if(d.isPresent())
        {
            Driver driver1=d.get();
            driver1.setName(driver.getName());
            driver1.setAddress(driver.getAddress());
            driver1.setSalary(driver.getSalary());
            return ResponseEntity.ok(repo.save(driver1));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    public boolean removeDriver(int id)
    {
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return  true;
        }
        else
        {
            return
                    false;
        }
    }




}
