package com.spring.jpa.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import com.spring.jpa.SpringDataJpaApplication;
import com.spring.jpa.entity.Employee;
import com.spring.jpa.repo.EmployeeRepo;

import lombok.Data;

@Data
@Component
public class EmployeeRunner implements CommandLineRunner {

    private final SpringDataJpaApplication springDataJpaApplication;

	@Autowired
	EmployeeRepo erepo;

    EmployeeRunner(SpringDataJpaApplication springDataJpaApplication) {
        this.springDataJpaApplication = springDataJpaApplication;
    }

	public void run(String... args) throws Exception {

		Employee emp1 = new Employee();
		emp1.setEmpId(11);
		emp1.setEmpName("sandesh sir");
		emp1.setSalary(100000);
		emp1.setDesignation("SpringBoot Trainer");

		Employee emp2 = new Employee();
		emp2.setEmpId(12);
		emp2.setEmpName("neharu sir");
		emp2.setSalary(70000);
		emp2.setDesignation("Django Trainer");

		Employee emp3 = new Employee();
		emp3.setEmpId(13);
		emp3.setEmpName("Vishwas sir");
		emp3.setSalary(100000);
		emp3.setDesignation("Java Trainer");

		Employee emp4 = new Employee();
		emp4.setEmpId(14);
		emp4.setEmpName("Rahul sir");
		emp4.setSalary(90000);
		emp4.setDesignation("webtech Trainer");
		erepo.saveAll(Arrays.asList(emp1, emp2, emp3, emp4));

		Sort sort = Sort.by("empName");

		List<Employee> sortedemps = erepo.findAll(sort);

		sortedemps.forEach(System.out::println);

//		Sort sort1=Sort.by("salary").descending();
//		
//		sort1.forEach(System.out::println);
//		
		Pageable pagenation1= PageRequest.of(0, 2);
//		
		Pageable pagenation2= PageRequest.of(1, 2);
//
       Page<Employee> page1=erepo.findAll(pagenation1);
//       
       page1.forEach(System.out::println);
       Page<Employee> page2=erepo.findAll(pagenation2);
       page2.forEach(System.out::println);
       
       
       
       System.out.println("pulled request madded");
    System.out.println("hi");  
	}

}
