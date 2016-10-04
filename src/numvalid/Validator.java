package numvalid;

public final class Validator {

    public Validator(String string) throws Exception {
        if (checkForIllegalLetters(string)) {
            throw new Exception("illegal letters");
        }

        if (!checkForProperForm(string, 0, 0)) {
            throw new Exception("illegal form");
        }
    }

    private boolean checkForProperForm(String string, int position, int lastNumeral) {
        if (position >= string.length()) {
            return true;
        }
        /*
        Ideana oli tehdä rekursiivinen metodi joka apumetodeja käyttäen tunnistaa lailliset kirjainyhdistelmät ja
        jakaa merkkijonon tavuihin, missä jokaisen seuraavan tavun tulee olla paitsi validi muodoltaan, myös edellistä
        tavua pienempi arvoltaan
         */
        
        return true;
    }

    private boolean checkForIllegalLetters(String string) {
        return !string.matches("^[IVXLCDM]+$");
    }

    private int getValue(String string) {
        return Numeral.valueOf(string).value;
    }

    private boolean isLetterCombinationANumeral(String string) {
        try {
            getValue(string);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
