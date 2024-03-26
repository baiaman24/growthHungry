package class14;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPasswordValid;
        System.out.println("Please enter a password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Password must be a minimum of eight (8) characters in length");
            isPasswordValid = false;
        } else {
            if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain at least one lowercase letter (a-z)");
                isPasswordValid = false;
            } else {
                if (!password.matches(".*[A-Z].*")) {
                    System.out.println("Password must contain at least one uppercase letter (A-Z)");
                    isPasswordValid = false;
                } else {
                    if (!password.matches(".*[\\d].*")) {
                        System.out.println("Password must contain at least one digit (0-9)");
                        isPasswordValid = false;
                    } else {
                        List<String> symbols = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")");
                        for (String symbol : symbols) {
                            if (password.contains(symbol)) {
                                System.out.println("Password accepted ");
                                isPasswordValid = true;
                                break;
                            } else {
                                System.out.println("Password must contain at least one special character (!@#$%^&*())");
                            }
                        }


                    }
                }
            }

        }


    }
}
/**
 * Ask user to enter a new password.
 * If the password does not match any of the requirements below, print a message based on what requirement it is breaking and return false.
 * If it does not break any requirement, print 'Password accepted' and return true.
 * <p>
 * Password requirements:
 * Be a minimum of eight (8) characters in length
 * Contain at least one uppercase letter (A-Z)
 * Contain at least one lowercase letter (a-z)
 * Contain at least one digit (0-9) - tip: regex to match (.)*(\d)(.)*)
 * Contain at least one special character (!@#$%^&*()) - note: use List.
 */