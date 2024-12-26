package com.example.SecurityImplementation.repository;

import com.example.SecurityImplementation.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer>
{
Users findByUsername(String username);
}
