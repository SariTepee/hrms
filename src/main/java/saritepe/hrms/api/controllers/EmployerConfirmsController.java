package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.EmployerConfirmService;
import saritepe.hrms.core.utilities.result.DataResult;

import saritepe.hrms.entities.concretes.EmployeeConfirm;

@RestController
@RequestMapping(name = "/api/employerConfirms")
public class EmployerConfirmsController {

    private EmployerConfirmService employerConfirmService;

    @Autowired
    public EmployerConfirmsController(EmployerConfirmService employerConfirmService) {
        this.employerConfirmService = employerConfirmService;
    }

    @GetMapping("/getByIdAndEmployeeFirstName")
    public DataResult<EmployeeConfirm> getByIdAndEmployee_FirstName(@RequestParam int id, @RequestParam String employeeFirstName) {
        return this.employerConfirmService.getByIdAndEmployee_FirstName(id, employeeFirstName);
    }
}
