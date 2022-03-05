package saritepe.hrms.core.utilities.adapters.mernis;

import kps.IGPKPSPublicSoap;
import java.time.LocalDate;

public  class MernisCheckServiceAdapter implements UserCheckService{

    @Override
    public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth){

        IGPKPSPublicSoap igpkpsPublicSoap = new IGPKPSPublicSoap();

        boolean result = false;

        try {
            result = igpkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(identityNumber)
                    ,firstName.toUpperCase()
                    ,lastName.toUpperCase()
                    ,dateOfBirth.getYear());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
