package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService extends BaseEntityService<Employer>{
    DataResult<Employer> getByEmail(String email);
}
