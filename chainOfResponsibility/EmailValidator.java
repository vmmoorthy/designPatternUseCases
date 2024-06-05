package chainOfResponsibility;

// Concrete Validator for checking if input is a valid email
public class EmailValidator extends Validator {

    public EmailValidator(Validator next) {
        super(next);
    }

    @Override
    public boolean validate(String input) {
        // Email validation logic here
        return input.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}
