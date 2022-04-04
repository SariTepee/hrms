package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.entities.concretes.VerificationCode;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

public interface VerificationCodeService extends BaseEntityService<VerificationCode>{
    DataResult<List<VerificationCode>> getByIsVerified(boolean isVerified);
    DataResult<VerificationCode> getByCode(String code);
}
