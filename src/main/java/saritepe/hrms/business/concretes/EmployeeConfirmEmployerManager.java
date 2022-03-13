package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployeeConfirmEmployerService;
import saritepe.hrms.core.dataAccess.abstracts.EmployeeConfirmEmployerDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;

import java.util.List;

@Service
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService {

    private EmployeeConfirmEmployerDao employeeConfirmEmployerDao;

    @Autowired
    public EmployeeConfirmEmployerManager(EmployeeConfirmEmployerDao employeeConfirmEmployerDao) {
        this.employeeConfirmEmployerDao = employeeConfirmEmployerDao;
    }

    @Override
    public Result add(EmployeeConfirmEmployer entity) {
        return null;
    }

    @Override
    public Result update(EmployeeConfirmEmployer entity) {
        return null;
    }

    @Override
    public Result delete(EmployeeConfirmEmployer entity) {
        return null;
    }

    @Override
    public DataResult<List<EmployeeConfirmEmployer>> getAll() {
        return null;
    }

    @Override
    public DataResult<EmployeeConfirmEmployer> getById(int id) {
        return null;
    }
}
