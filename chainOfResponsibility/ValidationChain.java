package chainOfResponsibility;

// Validator Chain
public class ValidationChain {
    private Validator validatorChain;

    public ValidationChain() {
        // Build the chain
        // validatorChain = new GmailValidator(validatorChain);
        validatorChain = new NotEmptyValidator(validatorChain);
        validatorChain = new EmailValidator(validatorChain);
    }

    public boolean validateInput(String input) {
        return validatorChain.handle(input);
    }
}
