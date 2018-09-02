package com.mshr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.mshr.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student findByCategory(@Param("rn") String category);

	Student findByNationality(@Param("nation") String nationality);

	Student findByGender(@Param("gend") String gender);

}
