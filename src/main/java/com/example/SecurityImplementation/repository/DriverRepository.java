package com.example.SecurityImplementation.repository;
import com.example.SecurityImplementation.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>
{

}
