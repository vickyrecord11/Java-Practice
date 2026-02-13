public class PasswordStrength {

    public static String checkStrength(String password) {

        int rulesSatisfied = 0;

        if (password.length() >= 8) {
            rulesSatisfied++;
        } else {
            return "Weak";
        }

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (hasUpper){
            rulesSatisfied++;
        }
        if (hasDigit){
            rulesSatisfied++;
        }
        if (hasSpecial){
            rulesSatisfied++;
        }

        if (rulesSatisfied == 1){
            return "Weak";
        }
        else if (rulesSatisfied == 2){
            return "Medium";
        }
        else if (rulesSatisfied == 3){
            return "Good";
        }
        else{
            return "Strong";
        }
    }

    public static void main(String[] args) {

        System.out.println(checkStrength("Qw!1"));
        System.out.println(checkStrength("Qwertyuiop"));
        System.out.println(checkStrength("QwertY123"));
        System.out.println(checkStrength("Qwerty@123"));
    }
}
