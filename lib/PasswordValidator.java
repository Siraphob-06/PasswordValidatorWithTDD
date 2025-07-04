package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความปลอดภัยของรหัสผ่าน
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password เป็นstring ที่ต้องการตรวจสอบ ต้องไม่ต่ำกว่า8ตัวและไม่มีช่องว่าง
     * @return passwordStrenght Invaild อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if(password.length()<8 || password==null)
            return PasswordStrength.INVALID;


            boolean lower=false;
            boolean digit = false;
            boolean upper = false;
            boolean special = false;

            for(char c: password.toCharArray()){
                if(Character.isDigit(c)){
                digit = true;
            }
            else if(Character.isUpperCase(c)){
                upper = true;
            }
            else if(!Character.isLowerCase(c)){
                lower=true;
                
                
            }else {
                special=true;
            }

            if(!digit && !upper && !special && lower){
                return PasswordStrength.WEAK;
            }
            if(!digit && upper && !special && lower){
                return PasswordStrength.MEDIUM;
            }
            if(digit && upper && special && lower){
                return PasswordStrength.STRONG;
            }

        }
        
        
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
        
}
}
