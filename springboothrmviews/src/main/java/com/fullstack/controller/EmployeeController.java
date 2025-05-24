
package com.fullstack.controller;

import com.fullstack.entity.Employee;
import com.fullstack.service.EmployeeService;
import com.fullstack.service.EmployeeViewService;
import com.fullstack.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeViewService employeeViewService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping("/findall")
    public ResponseEntity<List<EmployeeView>> findAll() {
        return ResponseEntity.ok(employeeViewService.findAll());
    }
}
