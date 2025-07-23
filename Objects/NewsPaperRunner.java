class NewsPaperRunner{
   public static void main(String paper[]){
   System.out.println("main started");
   
   int age = 78;
  // ClassName referenceVariable = new Constructor(); 
   NewsPaper ref = new NewsPaper();
   System.out.println("The news paper Id is: "+ ref.newsPaperId);
   NewsPaper.newsPaperId = 1;
   System.out.println("The news paper Id is: "+ NewsPaper.newsPaperId);
   
   System.out.println("The no of pages are: "+NewsPaper.noOfPages);
   NewsPaper.noOfPages = 12;
    System.out.println("The no of pages are: "+NewsPaper.noOfPages);
	
   System.out.println("The Newspaper language is: "+NewsPaper.language);
   NewsPaper.language = "English";
   System.out.println("The Newspaper language is: "+NewsPaper.language);
   
   System.out.println("The date is: "+NewsPaper.date);
   NewsPaper.date = "22-07-2025";
   System.out.println("The date is: "+NewsPaper.date);
   
   System.out.println("The day is: "+NewsPaper.day);
   NewsPaper.day = "Tuesday";
   System.out.println("The day is: "+NewsPaper.day);
   
   System.out.println("The company name is: "+ NewsPaper.companyName);
   NewsPaper.companyName = "The Times Of India";
   System.out.println("The company name is: "+ NewsPaper.companyName);
   
                                                 //ref     //ref name
    //System.out.println("The news paper Id is: "+ NewsPaper.newsPaperId);
	//System.out.println("The no of pages are: "+NewsPaper.noOfPages);
	//System.out.println("The Newspaper language is: "+NewsPaper.language);
	//System.out.println("The date is: "+NewsPaper.date);
   
   System.out.println("main ended");
   
   }

}