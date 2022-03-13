package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.VerificationCodeCandidateService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodeCandidate")
public class VerificationCodeCandidatesController {

    private VerificationCodeCandidateService verificationCodeCandidateService;

    @Autowired
    public VerificationCodeCandidatesController(VerificationCodeCandidateService verificationCodeCandidateService) {
        this.verificationCodeCandidateService = verificationCodeCandidateService;
    }

    @GetMapping("/getAll")
    public DataResult<List<VerificationCodeCandidate>> getAll() {
        return this.verificationCodeCandidateService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<VerificationCodeCandidate> getById(int id) {
        return this.verificationCodeCandidateService.getById(id);
    }
}
