package zad4;

public class Customer {
    Transmission transmission;
    Language language;
    public void setTransmission(Transmission t) {
        transmission = t;
    }
    public void setLanguage(Language l) {
        language = l;
    }
    public void sendMessage() {
        language.language();
        transmission.transmission();
    }
}
