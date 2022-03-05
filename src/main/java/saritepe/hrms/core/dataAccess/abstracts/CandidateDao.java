package saritepe.hrms.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
