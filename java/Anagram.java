import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args) {
	    String str1 = "Akash";
	    String str2 = "Java";
	    
	    if(str1.length()==str2.length()){
	        
	        
	        char chAr1[] = str1.toCharArray();
	        char chAr2[] = str2.toCharArray();
	        
	        Arrays.sort(chAr1);
	        Arrays.sort(chAr1);
	        
	        boolean finalResult = Arrays.equals(chAr1,chAr1);
	        
	        if(finalResult){
	            System.out.println(str1 + " & " + str1 + "anagram ");
	        }
	        else{
	             System.out.println(str1 + " & " + str1 + "not anagram ");
	        }
	    }
	    else{
	        System.out.println(str1 + " & " + str1 + "not anagram");
	    }
	}
}
