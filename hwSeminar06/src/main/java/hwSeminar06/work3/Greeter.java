package hwSeminar06.work3;

public class Greeter implements Formality {
    private String formality;

    public Greeter(String formality) {
        this.formality = formality;
    }

    public String greet() {
        return null;
    }

    public String getFormality() {
        return formality;
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}