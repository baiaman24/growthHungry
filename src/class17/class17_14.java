package class17;

public class class17_14 {
    public static void main(String[] args) {
        boolean isVisaRequired = getVisaRequirements("USA");
        System.out.println(isVisaRequired);
    } public static boolean getVisaRequirements(String country){
        switch (country){
            case "USA":
            case "Canada":
                return false;
                default:
                    return true;
        }
    }
}
