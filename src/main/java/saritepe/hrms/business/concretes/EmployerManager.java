package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.core.dataAccess.abstracts.EmployerDao;
import saritepe.hrms.entities.concretes.Employer;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer entity) {
        return null;
    }

    @Override
    public Result update(Employer entity) {
        return null;
    }

    @Override
    public Result delete(Employer entity) {
        return null;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(employerDao.findAll());
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return null;
    }
}
