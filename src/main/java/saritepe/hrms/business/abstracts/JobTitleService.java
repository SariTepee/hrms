package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService{
    DataResult<List<JobTitle>> getAll();
}
