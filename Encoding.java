package Unique;

import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
    
		if(m==0&&n==0)
			result.add("");
			
		else if (m == 1 && n == 0){
			result.add(".");
			}
	    else if (m == 0 && n == 1){
			result.add("-");
			}
		return result;
	}
   
}