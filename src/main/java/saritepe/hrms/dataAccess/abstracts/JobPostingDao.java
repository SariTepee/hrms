package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.JobPosting;

import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
    List<JobPosting> getByEmployer_IdAndAndJobTitle_Id(int employerId, int jobTitleId);
    List<JobPosting> getAllByEmployer_Id(int employerId);
}
