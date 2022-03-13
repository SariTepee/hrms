package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.VerificationCodeEmployerService;
import saritepe.hrms.core.dataAccess.abstracts.VerificationCodeEmployerDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.entities.concretes.VerificationCodeEmployer;

import java.util.List;

@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService {

    private VerificationCodeEmployerDao verificationCodeEmployerDao;

    @Autowired
    public VerificationCodeEmployerManager(VerificationCodeEmployerDao verificationCodeEmployerDao) {
        this.verificationCodeEmployerDao = verificationCodeEmployerDao;
    }

    @Override
    public Result add(VerificationCodeEmployer entity) {
        return null;
    }

    @Override
    public Result update(VerificationCodeEmployer entity) {
        return null;
    }

    @Override
    public Result delete(VerificationCodeEmployer entity) {
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
}
