
package com.fullstack.service;

import com.fullstack.entity.Address;
import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        Address address = employee.getAddress();
        address.setEmployee(employee);

        return employeeRepository.save(employee);
    }
}
