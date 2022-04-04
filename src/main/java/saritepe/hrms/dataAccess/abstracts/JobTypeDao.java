package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.JobType;

public interface JobTypeDao extends JpaRepository<JobType, Integer> {
}
