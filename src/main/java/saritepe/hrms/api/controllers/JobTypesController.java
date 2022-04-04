package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.JobTypeService;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.JobType;

import java.util.List;

@RestController
@RequestMapping("/api/jobTypes")
public class JobTypesController {
    private JobTypeService jobTypeService;

    @Autowired
    public JobTypesController(JobTypeService jobTypeService) {
        this.jobTypeService = jobTypeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobType>> getAll(){
        return this.jobTypeService.getAll();
    }
}
