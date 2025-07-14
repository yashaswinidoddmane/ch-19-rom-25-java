class RiverRunner{
  
  public static void main(String args[]){
	  String name = RiverInfo.getName();
	  System.out.println("The river name is: "+ name);
	  
	  double length = RiverInfo.getLength();
	  System.out.println("The river length is: "+ length);
	  
	  double depth = RiverInfo.getDepth();
	  System.out.println("The river depth is: "+ depth);
	  
	  boolean isPolluted = RiverInfo.getisPolluted();
	  System.out.println("The river is polluted: "+ isPolluted);
	  
	  String origin = RiverInfo.getOrigin();
	  System.out.println("The river origin is: "+ origin);
	  }
}