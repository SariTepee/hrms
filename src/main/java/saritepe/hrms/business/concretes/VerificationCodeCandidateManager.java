package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.VerificationCodeCandidateService;
import saritepe.hrms.business.abstracts.VerificationCodeService;
import saritepe.hrms.core.utilities.result.SuccessResult;
import saritepe.hrms.dataAccess.abstracts.VerificationCodeCandidateDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.entities.concretes.VerificationCode;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {

    private VerificationCodeCandidateDao verificationCodeCandidateDao;
    private VerificationCodeService verificationCodeService;

    @Autowired
    public VerificationCodeCandidateManager(VerificationCodeCandidateDao verificationCodeCandidateDao, VerificationCodeService verificationCodeService) {
        this.verificationCodeCandidateDao = verificationCodeCandidateDao;
        this.verificationCodeService = verificationCodeService;
    }

    @Override
    public Result add(VerificationCodeCandidate verificationCodeCandidate) {
        verificationCodeCandidate.setVerified(false);
        verificationCodeCandidate.setCode(generateCode());
        verificationCodeCandidate.setVerifiedDate(LocalDateTime.now());
        this.verificationCodeCandidateDao.save(verificationCodeCandidate);
        return new SuccessResult("Verification Code Candidate başarılı");
    }

    @Override
    public Result update(VerificationCodeCandidate verificationCodeCandidate) {
        return null;
    }

    @Override
    public Result delete(VerificationCodeCandidate verificationCodeCandidate) {
        return null;
    }

    @Override
    public DataResult<List<VerificationCodeCandidate>> getAll() {
        return new SuccessDataResult<List<VerificationCodeCandidate>>(this.verificationCodeCandidateDao.findAll());
    }

    @Override
    public DataResult<VerificationCodeCandidate> getById(int id) {
        return new SuccessDataResult<VerificationCodeCandidate>(this.verificationCodeCandidateDao.getById(id));
    }

    private String generateCode() {
        UUID code = UUID.randomUUID();

        return code.toString();
    }
}
