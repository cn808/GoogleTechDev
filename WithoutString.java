/*
https://codingbat.com/prob/p192570

Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/

public String withoutString(String base, String remove) {
  if(base == null || base.length() == 0 || 
    remove == null || remove.length() == 0) return base;
  
  char[] baseCharArray = base.toLowerCase().toCharArray();
  char[] removeCharArray = remove.toLowerCase().toCharArray();
  StringBuilder sb = new StringBuilder();
  
  int baseIndex = 0;
  while(baseIndex < base.length()) {
    int removeIndex = 0;
    int temp = baseIndex;
    while(removeIndex < remove.length() && 
          temp < base.length() && 
          baseCharArray[temp] == removeCharArray[removeIndex]) 
    {
          temp++;
          removeIndex++;
    }
    
    if(removeIndex >= remove.length()) {
      baseIndex += removeIndex;
      continue;
    }
    
    if(baseIndex == base.length()) {
      sb.append(base.substring(baseIndex, baseIndex));
    } else {
      sb.append(base.substring(baseIndex, baseIndex+1));
    }
    baseIndex++;
  }
  
  return sb.toString();
}
