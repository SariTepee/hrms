package saritepe.hrms.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.EmployeeConfirmEmployerService;

@RestController
@RequestMapping(name = "/api/employeeConfirmEmployer")
public class EmployeeConfirmEmployersController {

    private EmployeeConfirmEmployerService employeeConfirmEmployerService;

    public EmployeeConfirmEmployersController(EmployeeConfirmEmployerService employeeConfirmEmployerService) {
        this.employeeConfirmEmployerService = employeeConfirmEmployerService;
    }
}
