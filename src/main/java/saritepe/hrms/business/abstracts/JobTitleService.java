package saritepe.hrms.business.abstracts;

import saritepe.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService{
    List<JobTitle> getAll();
}
