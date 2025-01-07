package January2025;

public class CapitalizeFirstLetter {
    public static void main(String[] args){
        String str = "i love coding";
        capitalizeFirstLetter(str);
    }

    private static void capitalizeFirstLetter(String str) {
        StringBuffer result = new StringBuffer();
        String[] data = str.split("\\s+");
        for(String d : data){
            result.append(d.substring(0,1).toUpperCase()).append(d.substring(1).toLowerCase()).append(" ");
        }

        System.out.println(result.toString().trim());

    }
}
