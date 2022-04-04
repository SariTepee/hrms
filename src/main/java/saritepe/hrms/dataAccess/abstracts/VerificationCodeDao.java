package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.VerificationCode;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{
    List<VerificationCode> getByIsVerified(boolean isVerified);

    VerificationCode getByCode(String code);
}
