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
        if (password == null || password.length() < 8 ){
        return PasswordStrength.INVALID;
        }


            boolean digit=false;
            boolean upper = false;
            boolean special= false;
            boolean lower = false;

            for(char c: password.toCharArray()){
                if(Character.isLowerCase(c)){
                lower = true;
            }
            else if(Character.isUpperCase(c)){
                upper = true;
            }
            else if(Character.isDigit(c)){
                digit=true;
                
                
            }else {
                special=true;
            }
        }

            if(lower&& !upper && !digit && !special) return PasswordStrength.WEAK;
            if(lower&& upper && !digit && !special ) return PasswordStrength.MEDIUM; 
            if(lower&& upper && digit && special) return PasswordStrength.STRONG;

        
        
        
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
        
}
}
