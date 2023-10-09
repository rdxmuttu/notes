import java.util.Scanner;
class Anagram{
public String checkAnagrams(String w1,String w2){
	char [] array1=w1.toCharArray();
	char [] array2=w2.toCharArray();
	String str1=new String(array1);
	String str2=new String(array2);
	String output="";
	boolean result=false;
	if (str1.length()==str2.length())
	 result=str1.equals(str2);
	if (str1.isEmpty() && str2.isEmpty())
	output=" Give proper input,not empty phrases";
	else if(result)
	output=" Given phrase are anagrams";
	else
	output=" Given phrase are not anagrams";
	return output; }
 }
class AnagramsMain{
 	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string 1:");
	String w1=sc.nextLine();
	System.out.println("Enter string 2:");
	String w2=sc.nextLine();
	Anagram anag=new Anagram();
	String result=anag.checkAnagrams(w1,w2);
	System.out.println(result);
}
}