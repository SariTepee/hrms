package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.JobPostingService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.JobPosting;

import java.util.List;

@RestController
@RequestMapping("/api/jobPosting")
@CrossOrigin
public class JobPostingsController {
    private JobPostingService jobPostingService;

    @Autowired
    public JobPostingsController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobPosting>> getAll(){
        return this.jobPostingService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<JobPosting> getById(int id){
        return this.jobPostingService.getById(id);
    }

    @GetMapping("/getByEmployer_IdAndAndJobTitle_Id")
    public DataResult<List<JobPosting>> getByEmployer_IdAndAndJobTitle_Id(int employerId, int jobTitleId){
        return this.jobPostingService.getByEmployer_IdAndAndJobTitle_Id(employerId, jobTitleId);
    }

    @GetMapping("/getAllByEmployer_Id")
    public DataResult<List<JobPosting>> getAllByEmployer_Id(int employerId) {
        return this.jobPostingService.getAllByEmployer_Id(employerId);
    }
}
