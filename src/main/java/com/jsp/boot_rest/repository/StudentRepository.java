package com.jsp.boot_rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.boot_rest.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByName(String name);

}
