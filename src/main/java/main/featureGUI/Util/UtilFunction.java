package main.featureGUI.Util;

public class UtilFunction {
    public static boolean isNumeric (String strNum){
        if (strNum == null){
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
