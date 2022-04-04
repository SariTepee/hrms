package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.VerificationCodeEmployerService;
import saritepe.hrms.business.abstracts.VerificationCodeService;
import saritepe.hrms.core.utilities.result.SuccessResult;
import saritepe.hrms.dataAccess.abstracts.VerificationCodeEmployerDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.entities.concretes.VerificationCodeEmployer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService{

    private VerificationCodeEmployerDao verificationCodeEmployerDao;

    @Autowired
    public VerificationCodeEmployerManager(VerificationCodeEmployerDao verificationCodeEmployerDao) {
        this.verificationCodeEmployerDao = verificationCodeEmployerDao;
    }

    @Override
    public Result add(VerificationCodeEmployer verificationCodeEmployer) {
        verificationCodeEmployer.setVerified(false);
        verificationCodeEmployer.setCode(generateCode());
        verificationCodeEmployer.setVerifiedDate(LocalDateTime.now());
        this.verificationCodeEmployerDao.save(verificationCodeEmployer);
        return new SuccessResult("Verification Code Employer başarılı");
    }

    @Override
    public Result update(VerificationCodeEmployer verificationCodeEmployer) {
        return null;
    }

    @Override
    public Result delete(VerificationCodeEmployer verificationCodeEmployer) {
        return null;
    }

    @Override
    public DataResult<List<VerificationCodeEmployer>> getAll() {
        return new SuccessDataResult<List<VerificationCodeEmployer>>(this.verificationCodeEmployerDao.findAll());
    }

    @Override
    public DataResult<VerificationCodeEmployer> getById(int id) {
        return new SuccessDataResult<VerificationCodeEmployer>(this.verificationCodeEmployerDao.getById(id));
    }

    private String generateCode(){
        UUID code = UUID.randomUUID();
        return code.toString();
    }
}
