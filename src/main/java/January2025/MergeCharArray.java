package January2025;

public class MergeCharArray {
    public static void main(String[] args){
        char[] s1= {'A','B','C','D','E','t','Z'};
        char[] s2= {'c','d','e','f'};
        mergeArray(s1, s2);
    }

    private static void mergeArray(char[] s1, char[] s2) {
        StringBuffer result = new StringBuffer();
        int maxLength = Math.max(s1.length, s2.length);
        for(int i=0;i<maxLength;i++){
          if(i< s1.length){
              result.append(Character.isUpperCase(s1[i]) ? Character.toLowerCase(s1[i]) : s1[i]);
          }
          if(i<s2.length){
              result.append(Character.isLowerCase(s2[i]) ? Character.toUpperCase(s2[i]) : s2[i]);
          }
        }
        System.out.println(result.toString().toCharArray());
    }



}
