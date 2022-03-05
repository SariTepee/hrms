package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.JobTitleService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.core.utilities.result.SuccessResult;
import saritepe.hrms.core.dataAccess.abstracts.JobTitleDao;
import saritepe.hrms.entities.concretes.JobTitle;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(jobTitleDao.findAll());
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("Urun eklendi");
    }

    @Override
    public Result delete(JobTitle jobTitle) {
        this.jobTitleDao.delete(jobTitle);
        return new SuccessResult("Urun silindi");
    }
}
