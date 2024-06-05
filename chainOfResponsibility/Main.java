package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        ValidationChain validationChain = new ValidationChain();

        String input1 = "john@example.com";
        boolean isValid1 = validationChain.validateInput(input1);
        System.out.println("Input 1 is valid: " + isValid1);

        String input2 = "email.com";
        boolean isValid2 = validationChain.validateInput(input2);
        System.out.println("Input 2 is valid: " + isValid2);

        String input3 = "user@gmail.com";
        boolean isValid3 = validationChain.validateInput(input3);
        System.out.println("Input 3 is valid: " + isValid3);
    }
}