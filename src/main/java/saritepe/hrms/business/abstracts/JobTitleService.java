package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.entities.User;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.Employer;
import saritepe.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService extends BaseEntityService<JobTitle>{
    DataResult<JobTitle> getByTitle(String title);
}
