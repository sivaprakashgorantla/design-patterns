package com.design.abstractfactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees/abstract")
public class EmployeeAbstractController {

    @GetMapping("/getEmployee")
    public String getEmployee(@RequestParam String type) {
        System.out.println("RestController : getEmployee");
        AbstractFactory<Employee> employeeFactory = (AbstractFactory<Employee>) FactoryProvider.getFactory("Employee");
        Employee employee = employeeFactory.create(type);
        return employee != null ? employee.getDetails() : "Invalid Employee Type";
    }

    @GetMapping("/getDepartment")
    public String getDepartment(@RequestParam String type) {
        AbstractFactory<Department> departmentFactory = (AbstractFactory<Department>) FactoryProvider.getFactory("Department");
        Department department = departmentFactory.create(type);
        return department != null ? department.getDepartmentName() : "Invalid Department Type";
    }
}
