package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.VerificationCodeService;
import saritepe.hrms.core.dataAccess.abstracts.VerificationCodeDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.entities.concretes.VerificationCode;

import java.util.List;

@Service
public class VerificationCodeManager implements VerificationCodeService {

    private VerificationCodeDao verificationCodeDao;

    @Autowired
    public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
        this.verificationCodeDao = verificationCodeDao;
    }

    @Override
    public Result add(VerificationCode entity) {
        return null;
    }

    @Override
    public Result update(VerificationCode entity) {
        return null;
    }

    @Override
    public Result delete(VerificationCode entity) {
        return null;
    }

    @Override
    public DataResult<List<VerificationCode>> getAll() {
        return new SuccessDataResult<List<VerificationCode>>(verificationCodeDao.findAll());
    }

    @Override
    public DataResult<VerificationCode> getById(int id) {
        return new SuccessDataResult<VerificationCode>(verificationCodeDao.getById(id));
    }
}
