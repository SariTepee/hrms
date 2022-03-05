package saritepe.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import saritepe.hrms.core.entities.User;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name = "employers")
public class Employer extends User {
    @Column(name = "company_name")
    String companyName;
    @Column(name = "web_address")
    String webAddress;
    @Column(name = "phone_number")
    String phoneNumber;
}
