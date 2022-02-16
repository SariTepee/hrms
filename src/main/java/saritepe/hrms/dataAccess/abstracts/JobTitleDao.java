package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {   /// Integer kontrol et

}
