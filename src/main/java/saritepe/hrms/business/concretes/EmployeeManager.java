package saritepe.hrms.business.concretes;

import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.EmployeeService;
import saritepe.hrms.core.dataAccess.abstracts.EmployeeDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.Employee;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Result add(Employee entity) {
        return null;
    }

    @Override
    public Result update(Employee entity) {
        return null;
    }

    @Override
    public Result delete(Employee entity) {
        return null;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return null;
    }

    @Override
    public DataResult<Employee> getById(int id) {
        return null;
    }
}
