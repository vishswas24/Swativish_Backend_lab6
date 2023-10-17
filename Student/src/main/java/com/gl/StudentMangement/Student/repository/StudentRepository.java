package com.gl.StudentMangement.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.StudentMangement.Student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

