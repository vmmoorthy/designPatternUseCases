package chainOfResponsibility;

// Concrete Validator for checking if input is a valid email
public class GmailValidator extends Validator {

    @Override
    public boolean validate(String input) {
        // Email validation logic here
        return input.indexOf("gmail") > -1;
    }

    public GmailValidator(Validator next) {
        super(next);
    }
}
