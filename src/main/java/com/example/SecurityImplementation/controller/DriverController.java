package com.example.SecurityImplementation.controller;

import com.example.SecurityImplementation.entity.Driver;
import com.example.SecurityImplementation.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController
{
    @Autowired
    private DriverService service;

@PostMapping("/save")
    public Driver SaveDriver(@RequestBody Driver driver)
{
return service.SaveDriver(driver);
}

@GetMapping("/fetchall")
    public List<Driver> fetchall()
{
    return service.fetchalldriver();
}

@PutMapping("/modify/{id}")
    public ResponseEntity<Driver> ModifyDriver(@RequestBody Driver driver, @PathVariable int id)
{
    return service.updateDriver(driver,id);

}

@DeleteMapping("/delete.{id}")
public ResponseEntity<String> RemoveDriver(@PathVariable int id)
{

}

}
