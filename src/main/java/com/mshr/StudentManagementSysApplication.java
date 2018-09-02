package com.mshr;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mshr.model.Student;
import com.mshr.repo.StudentRepo;

@SpringBootApplication
public class StudentManagementSysApplication {

	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSysApplication.class, args);
	}

	/*
	 * @Bean CommandLineRunner cmd() { return args -> { studentRepo.save(new
	 * Student(1, "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(2, "Sakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(3, "Nokib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(4,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(5, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(6, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(7,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Singapore", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(8, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Afganistan", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(9, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(10,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(11, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(12, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(13,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(14, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(15, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(16,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(17, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Female",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(18, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(19,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(20, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(21, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(22,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(23, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(24, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(25,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(26, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(27, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(28,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(29, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(30, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(31,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(32, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(33, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(33,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(34, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(35, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(36,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(37, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(38, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(39,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(40, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(41, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(42,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(43, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(44, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(45,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(46, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(47, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(48,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(49, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(50, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(51,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(52, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(53, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(54,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(55, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(56, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(57,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(58, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(59, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(60,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(61, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(1,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(1, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(1,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(1, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(1,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(1, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(1,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(1, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka")); studentRepo.save(new Student(1,
	 * "Rakib", "123", "class 13", new Date(), "01688211511",
	 * "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male", "Business Study",
	 * "4500", "none", "Uttor dendabor", "Uttor dendabor", "savar,Dhaka"));
	 * studentRepo.save(new Student(1, "Rakib", "123", "class 13", new Date(),
	 * "01688211511", "MD Mizanur Rahman", "Teacher", "Bangladeshi", "Male",
	 * "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
	 * "savar,Dhaka")); studentRepo.save(new Student(1, "Rakib", "123",
	 * "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
	 * "Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor"
	 * , "Uttor dendabor", "savar,Dhaka"));
	 * 
	 * };
	 * 
	 * }
	 */

}
