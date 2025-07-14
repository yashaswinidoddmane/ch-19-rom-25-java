class RadioRunner{
 public static void main(String Feature[]){
  
  
  
  String brand = RadioFeature.getbrand();
  System.out.println("the brand name is: "+ brand);
  
  double frequencyRange = RadioFeature.getfrequencyRange();
  System.out.println("The frequency Range is: "+ frequencyRange);
  
  boolean isPortable = RadioFeature.getisPortable();
  System.out.println("The radio is portable: "+ isPortable);
  
  int volumeLevel = RadioFeature.getvolumeLevel();
  System.out.println("The Radio Volume level is: "+ volumeLevel);
  
  boolean isOn = RadioFeature.getisOn();
  System.out.println("The Radio is On: "+ isOn);
 
 
 }
}