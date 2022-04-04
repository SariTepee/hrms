package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.JobPostingService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.dataAccess.abstracts.JobPostingDao;
import saritepe.hrms.entities.concretes.JobPosting;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {
    private JobPostingDao jobPostingDto;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDto) {
        this.jobPostingDto = jobPostingDto;
    }

    @Override
    public Result add(JobPosting entity) {
        return null;
    }

    @Override
    public Result update(JobPosting entity) {
        return null;
    }

    @Override
    public Result delete(JobPosting entity) {
        return null;
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDto.findAll());
    }

    @Override
    public DataResult<JobPosting> getById(int id) {
        return new SuccessDataResult<JobPosting>(this.jobPostingDto.getById(id));
    }

    @Override
    public DataResult<List<JobPosting>> getByEmployer_IdAndAndJobTitle_Id(int employerId, int jobTitleId) {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDto.getByEmployer_IdAndAndJobTitle_Id(employerId, jobTitleId));
    }

    @Override
    public DataResult<List<JobPosting>> getAllByEmployer_Id(int employerId) {
        return new SuccessDataResult<List<JobPosting>>(this.jobPostingDto.getAllByEmployer_Id(employerId));
    }
}
