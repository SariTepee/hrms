package saritepe.hrms.core.utilities.adapters.mernis;

import kps.IGPKPSPublicSoap;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public  class MernisCheckServiceAdapter implements UserCheckService{

    @Override
    public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth){

        IGPKPSPublicSoap igpkpsPublicSoap = new IGPKPSPublicSoap();

        try {
            return igpkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(identityNumber), firstName.toUpperCase(), lastName.toUpperCase(), dateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
