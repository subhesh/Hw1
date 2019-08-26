package Unique;

public class UClass {
public String uniqueLetters(String str) {
	int count =0;
	String text="";
	for(int x=0;x<str.length();x++) 
	{
			for(int y=0;y<str.length();y++) 
			{
				if(str.charAt(x)==str.charAt(y)) 
				{
					count++;
				}
			}
			
			if(count==1) 
				text += str.charAt(x);
			
	}
	return text;
}



}
