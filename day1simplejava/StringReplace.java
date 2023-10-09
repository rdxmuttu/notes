class StringReplace{
	public static void main(String []args){
	String str = "Hello everyone, How are you?";
	StringBuffer sbr = new StringBuffer(str);
	//sbr.replace(str.indexOf(" "),str.indexOf(","),"folks"); 
	str=str.replace("everyone","folks");
	System.out.println(str); //original str grts replaced
}
} 