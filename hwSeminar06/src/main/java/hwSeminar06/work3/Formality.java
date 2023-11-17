package hwSeminar06.work3;

public interface Formality {
    public default String greet() {
        return switch (this.greet()) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            default -> "Hello.";
        };
    }
}