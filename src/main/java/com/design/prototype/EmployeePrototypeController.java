package com.design.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees/prototype")
public class EmployeePrototypeController {

    @Autowired
    private EmployeePrototypeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestParam String name, @RequestParam String department) {
        return employeeService.createEmployee(name, department);
    }

    @PostMapping("/clone")
    public Employee cloneEmployee(@RequestBody Employee existingEmployee) {
        return employeeService.cloneEmployee(existingEmployee);
    }
}
