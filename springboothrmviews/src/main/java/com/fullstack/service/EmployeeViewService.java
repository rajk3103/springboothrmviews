
package com.fullstack.service;

import com.fullstack.repository.EmployeeViewRepository;
import com.fullstack.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeViewService {

    @Autowired
    private EmployeeViewRepository employeeViewRepository;

    public List<EmployeeView> findAll() {
        return employeeViewRepository.findAll();
    }
}
