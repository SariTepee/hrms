package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
}
