package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.VerificationCodeService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.VerificationCode;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodes")
public class VerificationCodesController {

    private VerificationCodeService verificationCodeService;

    @Autowired
    public VerificationCodesController(VerificationCodeService verificationCodeService) {
        this.verificationCodeService = verificationCodeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<VerificationCode>> getAll() {
        return verificationCodeService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<VerificationCode> getById(int id) {
        return verificationCodeService.getById(id);
    }

}
