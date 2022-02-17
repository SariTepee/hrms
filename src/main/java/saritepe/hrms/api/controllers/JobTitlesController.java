package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.JobTitleService;
import saritepe.hrms.core.utilities.result.DataResult;
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
}
