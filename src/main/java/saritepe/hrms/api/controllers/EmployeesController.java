package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.EmployeeService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.Candidate;
import saritepe.hrms.entities.concretes.Employee;

@RestController
@RequestMapping(name = "/api/employee")
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getById")
    public DataResult<Employee> getById(@RequestParam int id) {
        return this.employeeService.getById(id);
    }
}
