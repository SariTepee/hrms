package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saritepe.hrms.business.abstracts.EmployerConfirmService;

@RestController
@RequestMapping(name = "/api/employerConfirms")
public class EmployerConfirmsController {

    private EmployerConfirmService employerConfirmService;

    @Autowired
    public EmployerConfirmsController(EmployerConfirmService employerConfirmService) {
        this.employerConfirmService = employerConfirmService;
    }
}
