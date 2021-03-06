package GoogleTechDev;

public class StringSplosion {
  /*
    https://codingbat.com/prob/p117334

    Given a non-empty string like "Code" return a string like "CCoCodCode".
    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
  */

  public static String stringSplosion(String str) {
    if(str == null || str.length() == 0) return str;

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++) {
      sb.append(str.substring(0, i+1));
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(stringSplosion("Code"));
    System.out.println(stringSplosion("abc"));
    System.out.println(stringSplosion("ab"));
  }
}