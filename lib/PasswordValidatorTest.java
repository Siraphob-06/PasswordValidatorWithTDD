package lib;

public class PasswordValidatorTest{
    
    public static void run() {
          // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
        System.out.println("Test Case 1 Passed:" +" "+ pw +" "+"Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        


        // เทสCase2 : รหัสผ่านตัวเล็กทั้งหมดจะเป็น WEAK

        String st="abcdeghjll";
        PasswordStrength result2 = PasswordValidator.validate(st);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed:"+" "+ st +" "+"Lower password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }

        // เทสCase3 รหัสตัวเล็กและตัวใหญ่จะเป็น medium
        pw="Boatyuio";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed:"+" "+ pw +" "+"Lower and Upper password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }

         // เทสCase4 รหัสผ่าน ตัวเล็ก ตัวใหญ่ อักขระพิเศษ เลข จะเป็นSTRONG
         pw="Boat888-+";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed:"+" "+ pw +" "+"Lower,Upper,special,digit password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
