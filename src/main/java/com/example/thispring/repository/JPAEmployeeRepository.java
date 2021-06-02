package com.example.thispring.repository;

import com.example.thispring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAEmployeeRepository extends JpaRepository<Employee, String> {
}
