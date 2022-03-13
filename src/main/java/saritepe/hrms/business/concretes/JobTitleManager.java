package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.JobTitleService;
import saritepe.hrms.core.utilities.result.*;
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
    public Result add(JobTitle jobTitle) {
        if (checkIfJobTitleExists(jobTitle.getTitle())){
            return new ErrorResult("Eklemek istediğiniz iş pozisyonu mevcut!");
        }


        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("İş pozisyonu eklendi");
    }

    @Override
    public Result update(JobTitle entity) {
        this.jobTitleDao.save(entity);
        return new SuccessResult("İş pozisyonu güncellendi");
    }

    @Override
    public Result delete(JobTitle jobTitle) {
        this.jobTitleDao.delete(jobTitle);
        return new SuccessResult("Urun silindi");
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(jobTitleDao.findAll());
    }

    @Override
    public DataResult<JobTitle> getById(int id) {
        return null;
    }

    @Override
    public DataResult<JobTitle> getByTitle(String title) {
        return new SuccessDataResult<JobTitle>(jobTitleDao.getByTitle(title));
    }

    private boolean checkIfJobTitleExists(String title) {
        boolean result = false;

        if (getByTitle(title).getData() == null){
            result = true;
        }

        return result;
    }
}
