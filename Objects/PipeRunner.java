class PipeRunner {
    public static void main(String pipes[]) {
        System.out.println("Main started");

        Pipe ref1 = new Pipe();
        ref1.material = "PVC";
        ref1.length = 6.0;
        ref1.diameter = 2.5;
        ref1.color = "White";
        ref1.type = "Drainage";
        ref1.isFlexible = false;
        ref1.isInsulated = false;

        Pipe ref2 = new Pipe();
        ref2.material = "Copper";
        ref2.length = 3.0;
        ref2.diameter = 1.0;
        ref2.color = "Brown";
        ref2.type = "Water Supply";
        ref2.isFlexible = false;
        ref2.isInsulated = true;

        Pipe ref3 = new Pipe();
        ref3.material = "Steel";
        ref3.length = 4.5;
        ref3.diameter = 3.0;
        ref3.color = "Silver";
        ref3.type = "Gas";
        ref3.isFlexible = false;
        ref3.isInsulated = true;

        Pipe ref4 = new Pipe();
        ref4.material = "Rubber";
        ref4.length = 2.0;
        ref4.diameter = 1.5;
        ref4.color = "Black";
        ref4.type = "Garden";
        ref4.isFlexible = true;
        ref4.isInsulated = false;

        Pipe ref5 = new Pipe();
        ref5.material = "Plastic";
        ref5.length = 5.0;
        ref5.diameter = 2.0;
        ref5.color = "Blue";
        ref5.type = "Sewer";
        ref5.isFlexible = false;
        ref5.isInsulated = false;

        Pipe ref6 = new Pipe();
        ref6.material = "Galvanized Iron";
        ref6.length = 4.0;
        ref6.diameter = 2.25;
        ref6.color = "Grey";
        ref6.type = "Water";
        ref6.isFlexible = false;
        ref6.isInsulated = true;

        Pipe ref7 = new Pipe();
        ref7.material = "HDPE";
        ref7.length = 6.5;
        ref7.diameter = 2.0;
        ref7.color = "Green";
        ref7.type = "Irrigation";
        ref7.isFlexible = true;
        ref7.isInsulated = false;

        Pipe ref8 = new Pipe();
        ref8.material = "Aluminum";
        ref8.length = 3.5;
        ref8.diameter = 1.75;
        ref8.color = "Silver";
        ref8.type = "Ventilation";
        ref8.isFlexible = false;
        ref8.isInsulated = true;

        Pipe ref9 = new Pipe();
        ref9.material = "Brass";
        ref9.length = 2.8;
        ref9.diameter = 1.25;
        ref9.color = "Golden";
        ref9.type = "Fittings";
        ref9.isFlexible = false;
        ref9.isInsulated = true;

        Pipe ref10 = new Pipe();
        ref10.material = "Concrete";
        ref10.length = 7.0;
        ref10.diameter = 4.0;
        ref10.color = "Gray";
        ref10.type = "Storm Drain";
        ref10.isFlexible = false;
        ref10.isInsulated = false;

        Pipe ref11 = new Pipe();
        ref11.material = "Lead";
        ref11.length = 1.5;
        ref11.diameter = 1.0;
        ref11.color = "Dark Gray";
        ref11.type = "Old Plumbing";
        ref11.isFlexible = false;
        ref11.isInsulated = false;

        Pipe ref12 = new Pipe();
        ref12.material = "Fiberglass";
        ref12.length = 5.5;
        ref12.diameter = 2.75;
        ref12.color = "White";
        ref12.type = "Industrial";
        ref12.isFlexible = false;
        ref12.isInsulated = true;

        Pipe ref13 = new Pipe();
        ref13.material = "Stainless Steel";
        ref13.length = 3.3;
        ref13.diameter = 1.5;
        ref13.color = "Chrome";
        ref13.type = "Kitchen";
        ref13.isFlexible = false;
        ref13.isInsulated = true;

        Pipe ref14 = new Pipe();
        ref14.material = "Polypropylene";
        ref14.length = 6.0;
        ref14.diameter = 2.2;
        ref14.color = "Blue";
        ref14.type = "Hot Water";
        ref14.isFlexible = false;
        ref14.isInsulated = true;

        Pipe ref15 = new Pipe();
        ref15.material = "PEX";
        ref15.length = 4.2;
        ref15.diameter = 1.8;
        ref15.color = "Red";
        ref15.type = "Residential Water";
        ref15.isFlexible = true;
        ref15.isInsulated = true;

        Pipe ref16 = new Pipe();
        ref16.material = "Vinyl";
        ref16.length = 5.7;
        ref16.diameter = 2.1;
        ref16.color = "Transparent";
        ref16.type = "Aquarium";
        ref16.isFlexible = true;
        ref16.isInsulated = false;

        Pipe ref17 = new Pipe();
        ref17.material = "Cast Iron";
        ref17.length = 6.0;
        ref17.diameter = 3.5;
        ref17.color = "Rust";
        ref17.type = "Sewerage";
        ref17.isFlexible = false;
        ref17.isInsulated = false;

        Pipe ref18 = new Pipe();
        ref18.material = "ABS";
        ref18.length = 3.0;
        ref18.diameter = 1.6;
        ref18.color = "Black";
        ref18.type = "Drainage";
        ref18.isFlexible = false;
        ref18.isInsulated = false;

        Pipe ref19 = new Pipe();
        ref19.material = "Silicone";
        ref19.length = 2.5;
        ref19.diameter = 1.2;
        ref19.color = "Clear";
        ref19.type = "Medical";
        ref19.isFlexible = true;
        ref19.isInsulated = false;

        Pipe ref20 = new Pipe();
        ref20.material = "Clay";
        ref20.length = 4.8;
        ref20.diameter = 2.9;
        ref20.color = "Terracotta";
        ref20.type = "Drainage";
        ref20.isFlexible = false;
        ref20.isInsulated = false;
		
		    System.out.println("Pipe Material is: "+ ref1.material);
            System.out.println("pipe Length is: "+ ref1.length);
            System.out.println("pipe Diameter is: "+ ref1.diameter );
            System.out.println(" pipe Color is: "+ ref1.color);
            System.out.println("Type: "+ ref1.type);
            System.out.println("is Flexible?: "+ ref1.isFlexible);
            System.out.println("is Insulated?: "+ ref1.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref2.material);
            System.out.println("pipe Length is: "+ ref2.length);
            System.out.println("pipe Diameter is: "+ ref2.diameter );
            System.out.println(" pipe Color is: "+ ref2.color);
            System.out.println("Type: "+ ref2.type);
            System.out.println("is Flexible?: "+ ref2.isFlexible);
            System.out.println("is Insulated?: "+ ref2.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref3.material);
            System.out.println("pipe Length is: "+ ref3.length);
            System.out.println("pipe Diameter is: "+ ref3.diameter );
            System.out.println(" pipe Color is: "+ ref3.color);
            System.out.println("Type: "+ ref3.type);
            System.out.println("is Flexible?: "+ ref3.isFlexible);
            System.out.println("is Insulated?: "+ ref3.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref4.material);
            System.out.println("pipe Length is: "+ ref4.length);
            System.out.println("pipe Diameter is: "+ ref4.diameter );
            System.out.println(" pipe Color is: "+ ref4.color);
            System.out.println("Type: "+ ref4.type);
            System.out.println("is Flexible?: "+ ref4.isFlexible);
            System.out.println("is Insulated?: "+ ref4.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref5.material);
            System.out.println("pipe Length is: "+ ref5.length);
            System.out.println("pipe Diameter is: "+ ref5.diameter );
            System.out.println(" pipe Color is: "+ ref5.color);
            System.out.println("Type: "+ ref5.type);
            System.out.println("is Flexible?: "+ ref5.isFlexible);
            System.out.println("is Insulated?: "+ ref5.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref6.material);
            System.out.println("pipe Length is: "+ ref6.length);
            System.out.println("pipe Diameter is: "+ ref6.diameter );
            System.out.println(" pipe Color is: "+ ref6.color);
            System.out.println("Type: "+ ref6.type);
            System.out.println("is Flexible?: "+ ref6.isFlexible);
            System.out.println("is Insulated?: "+ ref6.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref7.material);
            System.out.println("pipe Length is: "+ ref7.length);
            System.out.println("pipe Diameter is: "+ ref7.diameter );
            System.out.println(" pipe Color is: "+ ref7.color);
            System.out.println("Type: "+ ref7.type);
            System.out.println("is Flexible?: "+ ref7.isFlexible);
            System.out.println("is Insulated?: "+ ref7.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref8.material);
            System.out.println("pipe Length is: "+ ref8.length);
            System.out.println("pipe Diameter is: "+ ref8.diameter );
            System.out.println(" pipe Color is: "+ ref8.color);
            System.out.println("Type: "+ ref8.type);
            System.out.println("is Flexible?: "+ ref8.isFlexible);
            System.out.println("is Insulated?: "+ ref8.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref9.material);
            System.out.println("pipe Length is: "+ ref9.length);
            System.out.println("pipe Diameter is: "+ ref9.diameter );
            System.out.println(" pipe Color is: "+ ref9.color);
            System.out.println("Type: "+ ref9.type);
            System.out.println("is Flexible?: "+ ref9.isFlexible);
            System.out.println("is Insulated?: "+ ref9.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref10.material);
            System.out.println("pipe Length is: "+ ref10.length);
            System.out.println("pipe Diameter is: "+ ref10.diameter );
            System.out.println(" pipe Color is: "+ ref10.color);
            System.out.println("Type: "+ ref10.type);
            System.out.println("is Flexible?: "+ ref10.isFlexible);
            System.out.println("is Insulated?: "+ ref10.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref11.material);
            System.out.println("pipe Length is: "+ ref11.length);
            System.out.println("pipe Diameter is: "+ ref11.diameter );
            System.out.println(" pipe Color is: "+ ref11.color);
            System.out.println("Type: "+ ref11.type);
            System.out.println("is Flexible?: "+ ref11.isFlexible);
            System.out.println("is Insulated?: "+ ref11.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref12.material);
            System.out.println("pipe Length is: "+ ref12.length);
            System.out.println("pipe Diameter is: "+ ref12.diameter );
            System.out.println(" pipe Color is: "+ ref12.color);
            System.out.println("Type: "+ ref12.type);
            System.out.println("is Flexible?: "+ ref12.isFlexible);
            System.out.println("is Insulated?: "+ ref12.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref13.material);
            System.out.println("pipe Length is: "+ ref13.length);
            System.out.println("pipe Diameter is: "+ ref13.diameter );
            System.out.println(" pipe Color is: "+ ref13.color);
            System.out.println("Type: "+ ref13.type);
            System.out.println("is Flexible?: "+ ref13.isFlexible);
            System.out.println("is Insulated?: "+ ref13.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref14.material);
            System.out.println("pipe Length is: "+ ref14.length);
            System.out.println("pipe Diameter is: "+ ref14.diameter );
            System.out.println(" pipe Color is: "+ ref14.color);
            System.out.println("Type: "+ ref14.type);
            System.out.println("is Flexible?: "+ ref14.isFlexible);
            System.out.println("is Insulated?: "+ ref14.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref15.material);
            System.out.println("pipe Length is: "+ ref15.length);
            System.out.println("pipe Diameter is: "+ ref15.diameter );
            System.out.println(" pipe Color is: "+ ref15.color);
            System.out.println("Type: "+ ref15.type);
            System.out.println("is Flexible?: "+ ref15.isFlexible);
            System.out.println("is Insulated?: "+ ref15.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref16.material);
            System.out.println("pipe Length is: "+ ref16.length);
            System.out.println("pipe Diameter is: "+ ref16.diameter );
            System.out.println(" pipe Color is: "+ ref16.color);
            System.out.println("Type: "+ ref16.type);
            System.out.println("is Flexible?: "+ ref16.isFlexible);
            System.out.println("is Insulated?: "+ ref16.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref17.material);
            System.out.println("pipe Length is: "+ ref17.length);
            System.out.println("pipe Diameter is: "+ ref17.diameter );
            System.out.println(" pipe Color is: "+ ref17.color);
            System.out.println("Type: "+ ref17.type);
            System.out.println("is Flexible?: "+ ref17.isFlexible);
            System.out.println("is Insulated?: "+ ref17.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref18.material);
            System.out.println("pipe Length is: "+ ref18.length);
            System.out.println("pipe Diameter is: "+ ref18.diameter );
            System.out.println(" pipe Color is: "+ ref18.color);
            System.out.println("Type: "+ ref18.type);
            System.out.println("is Flexible?: "+ ref18.isFlexible);
            System.out.println("is Insulated?: "+ ref18.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref19.material);
            System.out.println("pipe Length is: "+ ref19.length);
            System.out.println("pipe Diameter is: "+ ref19.diameter );
            System.out.println(" pipe Color is: "+ ref19.color);
            System.out.println("Type: "+ ref19.type);
            System.out.println("is Flexible?: "+ ref19.isFlexible);
            System.out.println("is Insulated?: "+ ref19.isInsulated);
			
			System.out.println("Pipe Material is: "+ ref20.material);
            System.out.println("pipe Length is: "+ ref20.length);
            System.out.println("pipe Diameter is: "+ ref20.diameter );
            System.out.println(" pipe Color is: "+ ref20.color);
            System.out.println("Type: "+ ref20.type);
            System.out.println("is Flexible?: "+ ref20.isFlexible);
            System.out.println("is Insulated?: "+ ref20.isInsulated);
	}
}