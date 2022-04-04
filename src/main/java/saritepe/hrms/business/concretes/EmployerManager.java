package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployerService;
import saritepe.hrms.core.utilities.result.*;
import saritepe.hrms.dataAccess.abstracts.EmployerDao;
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
    public Result add(Employer employer) {

        if (employer.getEmail() == null || employer.getPassword() == null || employer.getPhoneNumber() == null || employer.getCompanyName() == null || employer.getWebAddress() == null) {
            new ErrorResult("Lütfen boş alanları doldurunuz...");
        }

        if(!checkIfEmployerEmailExists(employer.getEmail())) {
            new ErrorResult("Girilen email başka bir hesaba kayıtlıdır...");
        }

        this.employerDao.save(employer);
        return new SuccessResult("İşveren başarılı şekilde eklendi...");
    }

    @Override
    public Result update(Employer employer) {
        return null;
    }

    @Override
    public Result delete(Employer employer) {
        return null;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(employerDao.findAll());
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return new SuccessDataResult<Employer>(this.employerDao.getById(id));
    }

    @Override
    public DataResult<Employer> getByEmail(String email) {
        return new SuccessDataResult<Employer>(this.employerDao.getByEmail(email));
    }

    private boolean checkIfEmployerEmailExists(String email) {
        boolean result = true;

        if (getByEmail(email).getData() == null) {
            result = false;
        }

        return result;
    }

    private Result checkEmployer(Employer employer){

        if (employer.getEmail() == null || employer.getPassword() == null || employer.getPhoneNumber() == null || employer.getCompanyName() == null || employer.getWebAddress() == null) {
            new ErrorResult("Lütfen boş alanları doldurunuz...");
        }

        if(!checkIfEmployerEmailExists(employer.getEmail())) {
            new ErrorResult("Girilen email başka bir hesaba kayıtlıdır...");
        }

        return null;
    }
}
