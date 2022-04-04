package saritepe.hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.EmployeeConfirmEmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/employeeConfirmEmployers")
public class EmployeeConfirmEmployersController {
    private EmployeeConfirmEmployerService employeeConfirmEmployerService;

    public EmployeeConfirmEmployersController(EmployeeConfirmEmployerService employeeConfirmEmployerService) {
        this.employeeConfirmEmployerService = employeeConfirmEmployerService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody EmployeeConfirmEmployer employeeConfirmEmployer){
        return ResponseEntity.ok(this.employeeConfirmEmployerService.add(employeeConfirmEmployer));
    }
    @GetMapping("/getById")
    public DataResult<EmployeeConfirmEmployer> getById(int id) {
        return this.employeeConfirmEmployerService.getById(id);
    }

    @GetMapping("/getByEmployeeFirstNameAndEmployerCompanyName")
    public DataResult<EmployeeConfirmEmployer> getByEmployee_FirstNameAndEmployer_CompanyName(String employeeFirstName, String employerCompanyName) {
        return this.employeeConfirmEmployerService.getByEmployee_FirstNameAndEmployer_CompanyName(employeeFirstName,employerCompanyName);
    }
}
