package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.Candidate;

public interface CandidateService extends BaseEntityService<Candidate>{
    DataResult<Candidate> getByIdentityNumber(String identityNumber);
    DataResult<Candidate> getByEmail(String email);

}
