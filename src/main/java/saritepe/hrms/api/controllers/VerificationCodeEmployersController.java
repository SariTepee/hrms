package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.VerificationCodeEmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.VerificationCodeEmployer;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodeEmployer")
public class VerificationCodeEmployersController {

    private VerificationCodeEmployerService verificationCodeEmployerService;

    @Autowired
    public VerificationCodeEmployersController(VerificationCodeEmployerService verificationCodeEmployerService) {
        this.verificationCodeEmployerService = verificationCodeEmployerService;
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
