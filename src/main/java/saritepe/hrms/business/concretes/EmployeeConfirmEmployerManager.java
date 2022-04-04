package saritepe.hrms.business.concretes;

import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployeeConfirmEmployerService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.core.utilities.result.SuccessResult;
import saritepe.hrms.dataAccess.abstracts.EmployeeConfirmEmployerDao;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService {

    private EmployeeConfirmEmployerDao employeeConfirmEmployerDao;

    public EmployeeConfirmEmployerManager(EmployeeConfirmEmployerDao employeeConfirmEmployerDao) {
        this.employeeConfirmEmployerDao = employeeConfirmEmployerDao;
    }

    @Override
    public Result add(EmployeeConfirmEmployer employeeConfirmEmployer) {
        employeeConfirmEmployer.setConfirmDate(LocalDateTime.now());

        employeeConfirmEmployerDao.save(employeeConfirmEmployer);
        return new SuccessResult("İşveren işciyi onayladı");
    }

    @Override
    public Result update(EmployeeConfirmEmployer employeeConfirmEmployer) {
        return null;
    }

    @Override
    public Result delete(EmployeeConfirmEmployer employeeConfirmEmployer) {
        return null;
    }

    @Override
    public DataResult<List<EmployeeConfirmEmployer>> getAll() {
        return null;
    }

    @Override
    public DataResult<EmployeeConfirmEmployer> getById(int id) {
        return new SuccessDataResult<EmployeeConfirmEmployer>(this.employeeConfirmEmployerDao.getById(id), "Data Listelendi");
    }

    @Override
    public DataResult<EmployeeConfirmEmployer> getByEmployee_FirstNameAndEmployer_CompanyName(String employeeFirstName, String employerCompanyName) {
        return new SuccessDataResult<EmployeeConfirmEmployer>(this.employeeConfirmEmployerDao.getByEmployee_FirstNameAndEmployer_CompanyName(employeeFirstName,employerCompanyName), "Data Listelendi");
    }
}
