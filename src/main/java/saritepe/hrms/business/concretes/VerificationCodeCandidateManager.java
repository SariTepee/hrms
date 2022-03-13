package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.VerificationCodeCandidateService;
import saritepe.hrms.core.dataAccess.abstracts.VerificationCodeCandidateDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {

    private VerificationCodeCandidateDao verificationCodeCandidateDao;

    @Autowired
    public VerificationCodeCandidateManager(VerificationCodeCandidateDao verificationCodeCandidateDao) {
        this.verificationCodeCandidateDao = verificationCodeCandidateDao;
    }


    @Override
    public Result add(VerificationCodeCandidate entity) {
        return null;
    }

    @Override
    public Result update(VerificationCodeCandidate entity) {
        return null;
    }

    @Override
    public Result delete(VerificationCodeCandidate entity) {
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
}
