package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.EmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.ErrorDataResult;
import saritepe.hrms.core.utilities.result.ErrorResult;
import saritepe.hrms.entities.concretes.Employer;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employer")
@CrossOrigin
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Employer employer) {
        return ResponseEntity.ok(this.employerService.add(employer));
    }

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<Employer> getById(int id) {
        return this.employerService.getById(id);
    }

    @GetMapping("/getByEmail")
    public DataResult<Employer> getByEmail(String email) {
        return this.employerService.getByEmail(email);
    }

}
