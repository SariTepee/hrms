package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.CandidateService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.Candidate;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@CrossOrigin
public class CandidatesController {
    private CandidateService candidateService;

    @Autowired
    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll() {
        return this.candidateService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<Candidate> getById(@RequestParam int id) {
        return this.candidateService.getById(id);
    }

    @GetMapping("/getByIdentityNumber")
    public DataResult<Candidate> getByIdentityNumber(@RequestParam String identityNumber) {
        return this.candidateService.getByIdentityNumber(identityNumber);
    }

    @GetMapping("/getByTugba")
    public DataResult<Candidate> getByEmail(String email) {
        return this.candidateService.getByEmail(email);
    }
}
