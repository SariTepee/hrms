package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerService extends BaseEntityService<EmployeeConfirmEmployer>{
    DataResult<EmployeeConfirmEmployer> getByEmployee_FirstNameAndEmployer_CompanyName(String employeeFirstName, String employerCompanyName);

}
