package chainOfResponsibility;

// Concrete Validator for checking if input is not empty
public class NotEmptyValidator extends Validator {

    public NotEmptyValidator(Validator next) {
        super(next);
    }

    @Override
    public boolean validate(String input) {
        if (input != null && !input.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}