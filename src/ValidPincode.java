import java.util.regex.*;

class ValidPincode {

    public static boolean isValidPinCode(String pinCode)
    {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        Pattern p = Pattern.compile(regex);

        if (pinCode == null) {
            return false;
        }

        Matcher m = p.matcher(pinCode);

        return m.matches();
    }

    public static void main(String args[])
    {

        String num1 = "123456";
        System.out.println(num1 + ": " + isValidPinCode(num1));

        String num2 = "560045";
        System.out.println(num2 + ": " + isValidPinCode(num2));

        String num3 = "036788";
        System.out.println(num3 + ": " + isValidPinCode(num3));

        String num4 = "88747897";
        System.out.println(num4 + ": " + isValidPinCode(num4));
    }
}
