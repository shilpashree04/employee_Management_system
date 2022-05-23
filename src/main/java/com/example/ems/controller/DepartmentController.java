package com.example.ems.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.model.Department;
import com.example.ems.service.DepartmentService;

@RestController
public class DepartmentController {
	
	static final Logger logger = LogManager.getLogger(DepartmentController.class.getName());
	
	@Autowired
	private DepartmentService departmentService;
	
	//displaying list of all department
	@GetMapping ("/departments")
	public List<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}
	
	//displaying department by id
	@GetMapping("/departments/{id}")
	public Optional<Department> getDepartment(@PathVariable int id) {
		return departmentService.getDepartment(id);
	}
	
	//inserting department y id
	@PostMapping("/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}
	
	//updating department by id
	@PutMapping ("/departments/{id}")
	public void updateDepartment(@RequestBody Department d,@PathVariable int id) {
		departmentService.updateDepartment(d,id);
	}
	
	//deleting all department
	@DeleteMapping("/departments")
	public void deleteAllDepartment() {
		departmentService.deleteAllDepartment();
	}
	
	//deleting department by id
	@DeleteMapping("/departments/{id}")
	public void deleteDepartmentByID(@RequestBody Department d, @PathVariable int id) {
		departmentService.deleteDepartmentByID(id);
	}
	
	//updating/patching department by id
	@PatchMapping("/deartment/{id}")
	public void patchDepartmentByID(@RequestBody Department d, @PathVariable int id) {
		departmentService.patchDepartment(d,id);
	}
}
