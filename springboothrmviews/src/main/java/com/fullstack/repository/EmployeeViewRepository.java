
package com.fullstack.repository;

import com.fullstack.view.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeViewRepository extends JpaRepository<EmployeeView, Long> {
}
