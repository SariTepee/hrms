package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.JobTitleService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.JobTitle;

import java.util.List;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobTitle>> getAll(){
        return this.jobTitleService.getAll();
    }

    @PostMapping("/add")
    public Result add(JobTitle jobTitle){
        return this.jobTitleService.add(jobTitle);
    }

    @PostMapping("/delete")
    public Result delete(JobTitle jobTitle){
        return this.jobTitleService.delete(jobTitle);
    }
}
