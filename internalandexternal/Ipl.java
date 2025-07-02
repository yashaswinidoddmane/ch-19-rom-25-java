class Ipl{
    static String rcb = "Rcb";
	static String csk = "CSK";
	static String mi = "MI";
	static String rr = "RR";
	static String dc = "DC";
	static String kkr = "KKR";
	static String gt = "GT";
	static String lsg = "LSG";
	static String pbks = "PBKS";
	static String srh = "SRH";
    static String iplTeamNames[] = {"Rcb" , "CSK" , "MI" , "RR" , "DC" , "KKR" , "GT" , "LSG" , "PBKS" , "SRH"};
    public static void main(String Ipl[]){
      System.out.println("main started");
      System.out.println("The no of IPL teams are:");
	  for(String iplTeamName : iplTeamNames)
      System.out.println(iplTeamName);
      System.out.println("main ended");
	}

}

