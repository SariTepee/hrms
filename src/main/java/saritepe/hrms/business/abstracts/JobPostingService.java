package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.JobPosting;

import java.util.List;

public interface JobPostingService extends BaseEntityService<JobPosting>{
    DataResult<List<JobPosting>> getByEmployer_IdAndAndJobTitle_Id(int employerId, int jobTitleId);
    DataResult<List<JobPosting>> getAllByEmployer_Id(int employerId);
}
