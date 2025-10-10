
// src/main/java/com/example/demo/repository/StudentResultRepository.java
package com.example.demo.repository;

import com.example.demo.model.StudentResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
}
