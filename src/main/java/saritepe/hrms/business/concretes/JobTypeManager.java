package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.JobTypeService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.core.utilities.result.SuccessDataResult;
import saritepe.hrms.dataAccess.abstracts.JobTypeDao;
import saritepe.hrms.entities.concretes.JobPosting;
import saritepe.hrms.entities.concretes.JobType;

import java.util.List;

@Service
public class JobTypeManager implements JobTypeService {
    private JobTypeDao jobTypeDao;

    @Autowired
    public JobTypeManager(JobTypeDao jobTypeDao) {
        this.jobTypeDao = jobTypeDao;
    }

    @Override
    public Result add(JobType entity) {
        return null;
    }

    @Override
    public Result update(JobType entity) {
        return null;
    }

    @Override
    public Result delete(JobType entity) {
        return null;
    }

    @Override
    public DataResult<List<JobType>> getAll() {
        return new SuccessDataResult<List<JobType>>(this.jobTypeDao.findAll());
    }

    @Override
    public DataResult<JobType> getById(int id) {
        return null;
    }
}
