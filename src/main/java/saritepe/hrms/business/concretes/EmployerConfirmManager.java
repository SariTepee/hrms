package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployerConfirmService;
import saritepe.hrms.core.dataAccess.abstracts.EmployeeConfirmDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.EmployeeConfirm;

import java.util.List;

@Service
public class EmployerConfirmManager implements EmployerConfirmService {

    private EmployeeConfirmDao employerConfirmDao;

    @Autowired
    public EmployerConfirmManager(EmployeeConfirmDao employerConfirmDao) {
        this.employerConfirmDao = employerConfirmDao;
    }

    @Override
    public Result add(EmployeeConfirm entity) {
        return null;
    }

    @Override
    public Result update(EmployeeConfirm entity) {
        return null;
    }

    @Override
    public Result delete(EmployeeConfirm entity) {
        return null;
    }

    @Override
    public DataResult<List<EmployeeConfirm>> getAll() {
        return null;
    }

    @Override
    public DataResult<EmployeeConfirm> getById(int id) {
        return null;
    }
}
