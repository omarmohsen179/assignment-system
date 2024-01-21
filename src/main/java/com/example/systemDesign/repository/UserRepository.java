package com.example.systemDesign.repository;

import com.example.systemDesign.model.Assessment;
import com.example.systemDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
