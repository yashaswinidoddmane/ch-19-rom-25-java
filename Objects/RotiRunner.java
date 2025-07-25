class RotiRunner {
    public static void main(String roti[]) {
        System.out.println("Main started");

        Roti ref1 = new Roti();
        ref1.type = "Plain Roti";
        ref1.flourUsed = "Wheat";
        ref1.isStuffed = false;
        ref1.diameter = 6.0;
        ref1.isHot = true;
        ref1.shape = "Round";
        ref1.price = 10.0;

        Roti ref2 = new Roti();
        ref2.type = "Butter Roti";
        ref2.flourUsed = "Wheat";
        ref2.isStuffed = false;
        ref2.diameter = 6.0;
        ref2.isHot = true;
        ref2.shape = "Round";
        ref2.price = 12.0;

        Roti ref3 = new Roti();
        ref3.type = "Tandoori Roti";
        ref3.flourUsed = "Wheat";
        ref3.isStuffed = false;
        ref3.diameter = 7.5;
        ref3.isHot = true;
        ref3.shape = "Round";
        ref3.price = 15.0;

        Roti ref4 = new Roti();
        ref4.type = "Missi Roti";
        ref4.flourUsed = "Gram + Wheat";
        ref4.isStuffed = false;
        ref4.diameter = 6.5;
        ref4.isHot = true;
        ref4.shape = "Round";
        ref4.price = 18.0;

        Roti ref5 = new Roti();
        ref5.type = "Makki Roti";
        ref5.flourUsed = "Maize";
        ref5.isStuffed = false;
        ref5.diameter = 7.0;
        ref5.isHot = true;
        ref5.shape = "Round";
        ref5.price = 14.0;

        Roti ref6 = new Roti();
        ref6.type = "Roomali Roti";
        ref6.flourUsed = "Maida";
        ref6.isStuffed = false;
        ref6.diameter = 10.0;
        ref6.isHot = true;
        ref6.shape = "Round";
        ref6.price = 20.0;

        Roti ref7 = new Roti();
        ref7.type = "Laccha Paratha";
        ref7.flourUsed = "Wheat";
        ref7.isStuffed = false;
        ref7.diameter = 7.0;
        ref7.isHot = true;
        ref7.shape = "Round with layers";
        ref7.price = 22.0;

        Roti ref8 = new Roti();
        ref8.type = "Aloo Paratha";
        ref8.flourUsed = "Wheat";
        ref8.isStuffed = true;
        ref8.diameter = 6.5;
        ref8.isHot = true;
        ref8.shape = "Round";
        ref8.price = 25.0;

        Roti ref9 = new Roti();
        ref9.type = "Methi Roti";
        ref9.flourUsed = "Wheat";
        ref9.isStuffed = false;
        ref9.diameter = 6.0;
        ref9.isHot = true;
        ref9.shape = "Round";
        ref9.price = 13.0;

        Roti ref10 = new Roti();
        ref10.type = "Paneer Paratha";
        ref10.flourUsed = "Wheat";
        ref10.isStuffed = true;
        ref10.diameter = 7.0;
        ref10.isHot = true;
        ref10.shape = "Round";
        ref10.price = 30.0;

        Roti ref11 = new Roti();
        ref11.type = "Onion Paratha";
        ref11.flourUsed = "Wheat";
        ref11.isStuffed = true;
        ref11.diameter = 6.5;
        ref11.isHot = true;
        ref11.shape = "Round";
        ref11.price = 24.0;

        Roti ref12 = new Roti();
        ref12.type = "Radish Paratha";
        ref12.flourUsed = "Wheat";
        ref12.isStuffed = true;
        ref12.diameter = 6.5;
        ref12.isHot = true;
        ref12.shape = "Round";
        ref12.price = 23.0;

        Roti ref13 = new Roti();
        ref13.type = "Spinach Roti";
        ref13.flourUsed = "Wheat + Spinach";
        ref13.isStuffed = false;
        ref13.diameter = 6.5;
        ref13.isHot = true;
        ref13.shape = "Round";
        ref13.price = 15.0;

        Roti ref14 = new Roti();
        ref14.type = "Jowar Roti";
        ref14.flourUsed = "Jowar";
        ref14.isStuffed = false;
        ref14.diameter = 6.0;
        ref14.isHot = false;
        ref14.shape = "Round";
        ref14.price = 12.0;

        Roti ref15 = new Roti();
        ref15.type = "Bajra Roti";
        ref15.flourUsed = "Bajra";
        ref15.isStuffed = false;
        ref15.diameter = 6.0;
        ref15.isHot = false;
        ref15.shape = "Round";
        ref15.price = 13.0;

        Roti ref16 = new Roti();
        ref16.type = "Stuffed Cheese Paratha";
        ref16.flourUsed = "Wheat";
        ref16.isStuffed = true;
        ref16.diameter = 6.5;
        ref16.isHot = true;
        ref16.shape = "Round";
        ref16.price = 35.0;

        Roti ref17 = new Roti();
        ref17.type = "Egg Paratha";
        ref17.flourUsed = "Wheat";
        ref17.isStuffed = true;
        ref17.diameter = 7.0;
        ref17.isHot = true;
        ref17.shape = "Round";
        ref17.price = 28.0;

        Roti ref18 = new Roti();
        ref18.type = "Sweet Roti";
        ref18.flourUsed = "Wheat + Jaggery";
        ref18.isStuffed = false;
        ref18.diameter = 6.0;
        ref18.isHot = false;
        ref18.shape = "Round";
        ref18.price = 18.0;

        Roti ref19 = new Roti();
        ref19.type = "Khakhra";
        ref19.flourUsed = "Wheat";
        ref19.isStuffed = false;
        ref19.diameter = 5.0;
        ref19.isHot = false;
        ref19.shape = "Crispy Round";
        ref19.price = 10.0;

        Roti ref20 = new Roti();
        ref20.type = "Nachni Roti";
        ref20.flourUsed = "Ragi";
        ref20.isStuffed = false;
        ref20.diameter = 6.0;
        ref20.isHot = true;
        ref20.shape = "Round";
        ref20.price = 16.0;
		
		System.out.println("Roti type is: "+ ref1.type);
		System.out.println("flour used: "+ ref1.flourUsed);
		System.out.println("is stuffed : "+ ref1.isStuffed);
		System.out.println("roti diameter is: "+ ref1.diameter);
		System.out.println("is hot : "+ ref1.isHot);
		System.out.println("roti shape is: "+ ref1.shape);
		System.out.println("roti price is: "+ ref1.price);
		
		System.out.println("Roti type is: "+ ref2.type);
		System.out.println("flour used: "+ ref2.flourUsed);
		System.out.println("is stuffed : "+ ref2.isStuffed);
		System.out.println("roti diameter is: "+ ref2.diameter);
		System.out.println("is hot : "+ ref2.isHot);
		System.out.println("roti shape is: "+ ref2.shape);
		System.out.println("roti price is: "+ ref2.price);
		
		System.out.println("Roti type is: "+ ref3.type);
		System.out.println("flour used: "+ ref3.flourUsed);
		System.out.println("is stuffed : "+ ref3.isStuffed);
		System.out.println("roti diameter is: "+ ref3.diameter);
		System.out.println("is hot : "+ ref3.isHot);
		System.out.println("roti shape is: "+ ref3.shape);
		System.out.println("roti price is: "+ ref3.price);
		
		System.out.println("Roti type is: "+ ref4.type);
		System.out.println("flour used: "+ ref4.flourUsed);
		System.out.println("is stuffed : "+ ref4.isStuffed);
		System.out.println("roti diameter is: "+ ref4.diameter);
		System.out.println("is hot : "+ ref4.isHot);
		System.out.println("roti shape is: "+ ref4.shape);
		System.out.println("roti price is: "+ ref4.price);
		
		System.out.println("Roti type is: "+ ref5.type);
		System.out.println("flour used: "+ ref5.flourUsed);
		System.out.println("is stuffed : "+ ref5.isStuffed);
		System.out.println("roti diameter is: "+ ref5.diameter);
		System.out.println("is hot : "+ ref5.isHot);
		System.out.println("roti shape is: "+ ref5.shape);
		System.out.println("roti price is: "+ ref5.price);
		
		System.out.println("Roti type is: "+ ref6.type);
		System.out.println("flour used: "+ ref6.flourUsed);
		System.out.println("is stuffed : "+ ref6.isStuffed);
		System.out.println("roti diameter is: "+ ref6.diameter);
		System.out.println("is hot : "+ ref6.isHot);
		System.out.println("roti shape is: "+ ref6.shape);
		System.out.println("roti price is: "+ ref6.price);
		
		System.out.println("Roti type is: "+ ref7.type);
		System.out.println("flour used: "+ ref7.flourUsed);
		System.out.println("is stuffed : "+ ref7.isStuffed);
		System.out.println("roti diameter is: "+ ref7.diameter);
		System.out.println("is hot : "+ ref7.isHot);
		System.out.println("roti shape is: "+ ref7.shape);
		System.out.println("roti price is: "+ ref7.price);
		
		System.out.println("Roti type is: "+ ref8.type);
		System.out.println("flour used: "+ ref8.flourUsed);
		System.out.println("is stuffed : "+ ref8.isStuffed);
		System.out.println("roti diameter is: "+ ref8.diameter);
		System.out.println("is hot : "+ ref8.isHot);
		System.out.println("roti shape is: "+ ref8.shape);
		System.out.println("roti price is: "+ ref8.price);
		
		System.out.println("Roti type is: "+ ref9.type);
		System.out.println("flour used: "+ ref9.flourUsed);
		System.out.println("is stuffed : "+ ref9.isStuffed);
		System.out.println("roti diameter is: "+ ref9.diameter);
		System.out.println("is hot : "+ ref9.isHot);
		System.out.println("roti shape is: "+ ref9.shape);
		System.out.println("roti price is: "+ ref9.price);
		
		System.out.println("Roti type is: "+ ref10.type);
		System.out.println("flour used: "+ ref10.flourUsed);
		System.out.println("is stuffed : "+ ref10.isStuffed);
		System.out.println("roti diameter is: "+ ref10.diameter);
		System.out.println("is hot : "+ ref10.isHot);
		System.out.println("roti shape is: "+ ref10.shape);
		System.out.println("roti price is: "+ ref10.price);
		
		System.out.println("Roti type is: "+ ref11.type);
		System.out.println("flour used: "+ ref11.flourUsed);
		System.out.println("is stuffed : "+ ref11.isStuffed);
		System.out.println("roti diameter is: "+ ref11.diameter);
		System.out.println("is hot : "+ ref11.isHot);
		System.out.println("roti shape is: "+ ref11.shape);
		System.out.println("roti price is: "+ ref11.price);
		
		System.out.println("Roti type is: "+ ref12.type);
		System.out.println("flour used: "+ ref12.flourUsed);
		System.out.println("is stuffed : "+ ref12.isStuffed);
		System.out.println("roti diameter is: "+ ref12.diameter);
		System.out.println("is hot : "+ ref12.isHot);
		System.out.println("roti shape is: "+ ref12.shape);
		System.out.println("roti price is: "+ ref12.price);
		
		System.out.println("Roti type is: "+ ref13.type);
		System.out.println("flour used: "+ ref13.flourUsed);
		System.out.println("is stuffed : "+ ref13.isStuffed);
		System.out.println("roti diameter is: "+ ref13.diameter);
		System.out.println("is hot : "+ ref13.isHot);
		System.out.println("roti shape is: "+ ref13.shape);
		System.out.println("roti price is: "+ ref13.price);
		
		System.out.println("Roti type is: "+ ref14.type);
		System.out.println("flour used: "+ ref14.flourUsed);
		System.out.println("is stuffed : "+ ref14.isStuffed);
		System.out.println("roti diameter is: "+ ref14.diameter);
		System.out.println("is hot : "+ ref14.isHot);
		System.out.println("roti shape is: "+ ref14.shape);
		System.out.println("roti price is: "+ ref14.price);
		
		System.out.println("Roti type is: "+ ref15.type);
		System.out.println("flour used: "+ ref15.flourUsed);
		System.out.println("is stuffed : "+ ref15.isStuffed);
		System.out.println("roti diameter is: "+ ref15.diameter);
		System.out.println("is hot : "+ ref15.isHot);
		System.out.println("roti shape is: "+ ref15.shape);
		System.out.println("roti price is: "+ ref15.price);
		
		System.out.println("Roti type is: "+ ref16.type);
		System.out.println("flour used: "+ ref16.flourUsed);
		System.out.println("is stuffed : "+ ref16.isStuffed);
		System.out.println("roti diameter is: "+ ref16.diameter);
		System.out.println("is hot : "+ ref16.isHot);
		System.out.println("roti shape is: "+ ref16.shape);
		System.out.println("roti price is: "+ ref16.price);
		
		System.out.println("Roti type is: "+ ref17.type);
		System.out.println("flour used: "+ ref17.flourUsed);
		System.out.println("is stuffed : "+ ref17.isStuffed);
		System.out.println("roti diameter is: "+ ref17.diameter);
		System.out.println("is hot : "+ ref17.isHot);
		System.out.println("roti shape is: "+ ref17.shape);
		System.out.println("roti price is: "+ ref17.price);
		
		System.out.println("Roti type is: "+ ref18.type);
		System.out.println("flour used: "+ ref18.flourUsed);
		System.out.println("is stuffed : "+ ref18.isStuffed);
		System.out.println("roti diameter is: "+ ref18.diameter);
		System.out.println("is hot : "+ ref18.isHot);
		System.out.println("roti shape is: "+ ref18.shape);
		System.out.println("roti price is: "+ ref18.price);
		
		System.out.println("Roti type is: "+ ref19.type);
		System.out.println("flour used: "+ ref19.flourUsed);
		System.out.println("is stuffed : "+ ref19.isStuffed);
		System.out.println("roti diameter is: "+ ref19.diameter);
		System.out.println("is hot : "+ ref19.isHot);
		System.out.println("roti shape is: "+ ref19.shape);
		System.out.println("roti price is: "+ ref19.price);
		
		System.out.println("Roti type is: "+ ref20.type);
		System.out.println("flour used: "+ ref20.flourUsed);
		System.out.println("is stuffed : "+ ref20.isStuffed);
		System.out.println("roti diameter is: "+ ref20.diameter);
		System.out.println("is hot : "+ ref20.isHot);
		System.out.println("roti shape is: "+ ref20.shape);
		System.out.println("roti price is: "+ ref20.price);
		
		System.out.println("main ended");
	}
}
		
		