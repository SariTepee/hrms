package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.EmployeeConfirm;

public interface EmployerConfirmService extends BaseEntityService<EmployeeConfirm>{
    DataResult<EmployeeConfirm> getByIdAndEmployee_FirstName(int id, String employeeFirstName);

}
