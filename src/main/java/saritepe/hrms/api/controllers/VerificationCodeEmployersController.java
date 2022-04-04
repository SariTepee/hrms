package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.VerificationCodeEmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;
import saritepe.hrms.entities.concretes.VerificationCodeEmployer;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/verificationCodeEmployer")
public class VerificationCodeEmployersController {

    private VerificationCodeEmployerService verificationCodeEmployerService;

    @Autowired
    public VerificationCodeEmployersController( VerificationCodeEmployerService verificationCodeEmployerService) {
        this.verificationCodeEmployerService = verificationCodeEmployerService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody VerificationCodeEmployer verificationCodeEmployer) {
        return ResponseEntity.ok(this.verificationCodeEmployerService.add(verificationCodeEmployer));
    }

    @GetMapping("/getAll")
    public DataResult<List<VerificationCodeEmployer>> getAll() {
        return this.verificationCodeEmployerService.getAll();

    }

    @GetMapping("/getById")
    public DataResult<VerificationCodeEmployer> getById(int id) {
        return this.verificationCodeEmployerService.getById(id);
    }
}
