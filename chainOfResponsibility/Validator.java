package chainOfResponsibility;

// Validator interface
public abstract class Validator {
    private Validator next;

    Validator(Validator next) {
        this.next = next;
    }

    public boolean handle(String input) {
        var response = validate(input);
        if (!response)
            return response;
        if (next != null)
            return next.handle(input);
        return response;
    }

    public abstract boolean validate(String input);

}
