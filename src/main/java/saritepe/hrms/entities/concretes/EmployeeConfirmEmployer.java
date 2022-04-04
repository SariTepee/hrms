package saritepe.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name = "employee_confirm_employers")
public class EmployeeConfirmEmployer extends EmployeeConfirm{

    @OneToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
}
