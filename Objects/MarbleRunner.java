class MarbleRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Marble ref1 = new Marble();
        ref1.color = "White";
        ref1.type = "Carrara";
        ref1.diameter = 10.0;
        ref1.material = "Calcium Carbonate";
        ref1.price = 250.0;
        ref1.isPolished = true;
        ref1.isImported = true;

        Marble ref2 = new Marble();
        ref2.color = "Green";
        ref2.type = "Udaipur";
        ref2.diameter = 12.5;
        ref2.material = "Dolomite";
        ref2.price = 180.0;
        ref2.isPolished = false;
        ref2.isImported = false;

        Marble ref3 = new Marble();
        ref3.color = "Black";
        ref3.type = "Nero Marquina";
        ref3.diameter = 11.0;
        ref3.material = "Limestone";
        ref3.price = 320.0;
        ref3.isPolished = true;
        ref3.isImported = true;

        Marble ref4 = new Marble();
        ref4.color = "Beige";
        ref4.type = "Botticino";
        ref4.diameter = 13.0;
        ref4.material = "Dolomitic Marble";
        ref4.price = 210.0;
        ref4.isPolished = true;
        ref4.isImported = true;

        Marble ref5 = new Marble();
        ref5.color = "Pink";
        ref5.type = "Jaisalmer";
        ref5.diameter = 9.5;
        ref5.material = "Sedimentary Rock";
        ref5.price = 150.0;
        ref5.isPolished = false;
        ref5.isImported = false;

        Marble ref6 = new Marble();
        ref6.color = "Brown";
        ref6.type = "Emperador";
        ref6.diameter = 14.0;
        ref6.material = "Crystalline Limestone";
        ref6.price = 280.0;
        ref6.isPolished = true;
        ref6.isImported = true;

        Marble ref7 = new Marble();
        ref7.color = "Blue";
        ref7.type = "Azul Macauba";
        ref7.diameter = 10.2;
        ref7.material = "Calcite";
        ref7.price = 450.0;
        ref7.isPolished = true;
        ref7.isImported = true;

        Marble ref8 = new Marble();
        ref8.color = "Grey";
        ref8.type = "Graphite";
        ref8.diameter = 11.3;
        ref8.material = "Carbonate Rock";
        ref8.price = 200.0;
        ref8.isPolished = false;
        ref8.isImported = false;

        Marble ref9 = new Marble();
        ref9.color = "Red";
        ref9.type = "Rosso Levanto";
        ref9.diameter = 10.8;
        ref9.material = "Metamorphic Rock";
        ref9.price = 300.0;
        ref9.isPolished = true;
        ref9.isImported = true;

        Marble ref10 = new Marble();
        ref10.color = "Ivory";
        ref10.type = "Makrana";
        ref10.diameter = 12.0;
        ref10.material = "Calcite";
        ref10.price = 170.0;
        ref10.isPolished = true;
        ref10.isImported = false;

        Marble ref11 = new Marble();
        ref11.color = "Gold";
        ref11.type = "Golden Portoro";
        ref11.diameter = 15.0;
        ref11.material = "Crystalline Marble";
        ref11.price = 500.0;
        ref11.isPolished = true;
        ref11.isImported = true;

        Marble ref12 = new Marble();
        ref12.color = "Purple";
        ref12.type = "Lilac Marble";
        ref12.diameter = 9.9;
        ref12.material = "Natural Stone";
        ref12.price = 320.0;
        ref12.isPolished = true;
        ref12.isImported = true;

        Marble ref13 = new Marble();
        ref13.color = "Yellow";
        ref13.type = "Jaisalmer Yellow";
        ref13.diameter = 13.5;
        ref13.material = "Sedimentary Rock";
        ref13.price = 160.0;
        ref13.isPolished = false;
        ref13.isImported = false;

        Marble ref14 = new Marble();
        ref14.color = "Orange";
        ref14.type = "Onyx";
        ref14.diameter = 11.7;
        ref14.material = "Silica";
        ref14.price = 370.0;
        ref14.isPolished = true;
        ref14.isImported = true;

        Marble ref15 = new Marble();
        ref15.color = "Teal";
        ref15.type = "Exotic Italian";
        ref15.diameter = 10.6;
        ref15.material = "Dolomite";
        ref15.price = 410.0;
        ref15.isPolished = true;
        ref15.isImported = true;

        Marble ref16 = new Marble();
        ref16.color = "Cream";
        ref16.type = "Crema Marfil";
        ref16.diameter = 14.2;
        ref16.material = "Limestone";
        ref16.price = 270.0;
        ref16.isPolished = true;
        ref16.isImported = true;

        Marble ref17 = new Marble();
        ref17.color = "Charcoal";
        ref17.type = "Belgian Black";
        ref17.diameter = 12.4;
        ref17.material = "Carbonate";
        ref17.price = 360.0;
        ref17.isPolished = true;
        ref17.isImported = true;

        Marble ref18 = new Marble();
        ref18.color = "Rust";
        ref18.type = "Rainforest";
        ref18.diameter = 13.3;
        ref18.material = "Feldspar-rich Rock";
        ref18.price = 250.0;
        ref18.isPolished = true;
        ref18.isImported = false;

        Marble ref19 = new Marble();
        ref19.color = "Silver";
        ref19.type = "Silver Wave";
        ref19.diameter = 11.6;
        ref19.material = "Quartzite";
        ref19.price = 390.0;
        ref19.isPolished = true;
        ref19.isImported = true;

        Marble ref20 = new Marble();
        ref20.color = "Multicolor";
        ref20.type = "Fantasy Brown";
        ref20.diameter = 12.9;
        ref20.material = "Dolomite & Quartz";
        ref20.price = 310.0;
        ref20.isPolished = true;
        ref20.isImported = true;
		
		System.out.println("Marble color is: "+ ref1.color);
		System.out.println("Marble type is: "+ ref1.type);
		System.out.println("The marble diameter is: "+ ref1.diameter);
		System.out.println("material is: "+ ref1.material);
		System.out.println("Marble price is: "+ ref1.price);
		System.out.println("is polished : "+ ref1.isPolished);
		System.out.println("is imported: "+ ref1.isImported);
		
		System.out.println("Marble color is: "+ ref2.color);
		System.out.println("Marble type is: "+ ref2.type);
		System.out.println("The marble diameter is: "+ ref2.diameter);
		System.out.println("material is: "+ ref2.material);
		System.out.println("Marble price is: "+ ref2.price);
		System.out.println("is polished : "+ ref2.isPolished);
		System.out.println("is imported: "+ ref2.isImported);
		
		System.out.println("Marble color is: "+ ref3.color);
		System.out.println("Marble type is: "+ ref3.type);
		System.out.println("The marble diameter is: "+ ref3.diameter);
		System.out.println("material is: "+ ref3.material);
		System.out.println("Marble price is: "+ ref3.price);
		System.out.println("is polished : "+ ref3.isPolished);
		System.out.println("is imported: "+ ref3.isImported);
		
		System.out.println("Marble color is: "+ ref3.color);
		System.out.println("Marble type is: "+ ref3.type);
		System.out.println("The marble diameter is: "+ ref3.diameter);
		System.out.println("material is: "+ ref3.material);
		System.out.println("Marble price is: "+ ref3.price);
		System.out.println("is polished : "+ ref3.isPolished);
		System.out.println("is imported: "+ ref3.isImported);
		
		System.out.println("Marble color is: "+ ref4.color);
		System.out.println("Marble type is: "+ ref4.type);
		System.out.println("The marble diameter is: "+ ref4.diameter);
		System.out.println("material is: "+ ref4.material);
		System.out.println("Marble price is: "+ ref4.price);
		System.out.println("is polished : "+ ref4.isPolished);
		System.out.println("is imported: "+ ref4.isImported);
		
		System.out.println("Marble color is: "+ ref5.color);
		System.out.println("Marble type is: "+ ref5.type);
		System.out.println("The marble diameter is: "+ ref5.diameter);
		System.out.println("material is: "+ ref5.material);
		System.out.println("Marble price is: "+ ref5.price);
		System.out.println("is polished : "+ ref5.isPolished);
		System.out.println("is imported: "+ ref5.isImported);
		
		System.out.println("Marble color is: "+ ref6.color);
		System.out.println("Marble type is: "+ ref6.type);
		System.out.println("The marble diameter is: "+ ref6.diameter);
		System.out.println("material is: "+ ref6.material);
		System.out.println("Marble price is: "+ ref6.price);
		System.out.println("is polished : "+ ref6.isPolished);
		System.out.println("is imported: "+ ref6.isImported);
		
		System.out.println("Marble color is: "+ ref7.color);
		System.out.println("Marble type is: "+ ref7.type);
		System.out.println("The marble diameter is: "+ ref7.diameter);
		System.out.println("material is: "+ ref7.material);
		System.out.println("Marble price is: "+ ref7.price);
		System.out.println("is polished : "+ ref7.isPolished);
		System.out.println("is imported: "+ ref7.isImported);
		
		System.out.println("Marble color is: "+ ref8.color);
		System.out.println("Marble type is: "+ ref8.type);
		System.out.println("The marble diameter is: "+ ref8.diameter);
		System.out.println("material is: "+ ref8.material);
		System.out.println("Marble price is: "+ ref8.price);
		System.out.println("is polished : "+ ref8.isPolished);
		System.out.println("is imported: "+ ref8.isImported);
		
		System.out.println("Marble color is: "+ ref9.color);
		System.out.println("Marble type is: "+ ref9.type);
		System.out.println("The marble diameter is: "+ ref9.diameter);
		System.out.println("material is: "+ ref9.material);
		System.out.println("Marble price is: "+ ref9.price);
		System.out.println("is polished : "+ ref9.isPolished);
		System.out.println("is imported: "+ ref9.isImported);
		
		System.out.println("Marble color is: "+ ref10.color);
		System.out.println("Marble type is: "+ ref10.type);
		System.out.println("The marble diameter is: "+ ref10.diameter);
		System.out.println("material is: "+ ref10.material);
		System.out.println("Marble price is: "+ ref10.price);
		System.out.println("is polished : "+ ref10.isPolished);
		System.out.println("is imported: "+ ref10.isImported);
		
		System.out.println("Marble color is: "+ ref11.color);
		System.out.println("Marble type is: "+ ref11.type);
		System.out.println("The marble diameter is: "+ ref11.diameter);
		System.out.println("material is: "+ ref11.material);
		System.out.println("Marble price is: "+ ref11.price);
		System.out.println("is polished : "+ ref11.isPolished);
		System.out.println("is imported: "+ ref11.isImported);
		
		System.out.println("Marble color is: "+ ref12.color);
		System.out.println("Marble type is: "+ ref12.type);
		System.out.println("The marble diameter is: "+ ref12.diameter);
		System.out.println("material is: "+ ref12.material);
		System.out.println("Marble price is: "+ ref12.price);
		System.out.println("is polished : "+ ref12.isPolished);
		System.out.println("is imported: "+ ref12.isImported);
		
		System.out.println("Marble color is: "+ ref13.color);
		System.out.println("Marble type is: "+ ref13.type);
		System.out.println("The marble diameter is: "+ ref13.diameter);
		System.out.println("material is: "+ ref13.material);
		System.out.println("Marble price is: "+ ref13.price);
		System.out.println("is polished : "+ ref13.isPolished);
		System.out.println("is imported: "+ ref13.isImported);
		
		System.out.println("Marble color is: "+ ref14.color);
		System.out.println("Marble type is: "+ ref14.type);
		System.out.println("The marble diameter is: "+ ref14.diameter);
		System.out.println("material is: "+ ref14.material);
		System.out.println("Marble price is: "+ ref14.price);
		System.out.println("is polished : "+ ref14.isPolished);
		System.out.println("is imported: "+ ref14.isImported);
		
		System.out.println("Marble color is: "+ ref15.color);
		System.out.println("Marble type is: "+ ref15.type);
		System.out.println("The marble diameter is: "+ ref15.diameter);
		System.out.println("material is: "+ ref15.material);
		System.out.println("Marble price is: "+ ref15.price);
		System.out.println("is polished : "+ ref15.isPolished);
		System.out.println("is imported: "+ ref15.isImported);
		
		System.out.println("Marble color is: "+ ref16.color);
		System.out.println("Marble type is: "+ ref16.type);
		System.out.println("The marble diameter is: "+ ref16.diameter);
		System.out.println("material is: "+ ref16.material);
		System.out.println("Marble price is: "+ ref16.price);
		System.out.println("is polished : "+ ref16.isPolished);
		System.out.println("is imported: "+ ref16.isImported);
		
		System.out.println("Marble color is: "+ ref17.color);
		System.out.println("Marble type is: "+ ref17.type);
		System.out.println("The marble diameter is: "+ ref17.diameter);
		System.out.println("material is: "+ ref17.material);
		System.out.println("Marble price is: "+ ref17.price);
		System.out.println("is polished : "+ ref17.isPolished);
		System.out.println("is imported: "+ ref17.isImported);
		
		System.out.println("Marble color is: "+ ref18.color);
		System.out.println("Marble type is: "+ ref18.type);
		System.out.println("The marble diameter is: "+ ref18.diameter);
		System.out.println("material is: "+ ref18.material);
		System.out.println("Marble price is: "+ ref18.price);
		System.out.println("is polished : "+ ref18.isPolished);
		System.out.println("is imported: "+ ref18.isImported);
		
		System.out.println("Marble color is: "+ ref19.color);
		System.out.println("Marble type is: "+ ref19.type);
		System.out.println("The marble diameter is: "+ ref19.diameter);
		System.out.println("material is: "+ ref19.material);
		System.out.println("Marble price is: "+ ref19.price);
		System.out.println("is polished : "+ ref19.isPolished);
		System.out.println("is imported: "+ ref19.isImported);
		
		System.out.println("Marble color is: "+ ref20.color);
		System.out.println("Marble type is: "+ ref20.type);
		System.out.println("The marble diameter is: "+ ref20.diameter);
		System.out.println("material is: "+ ref20.material);
		System.out.println("Marble price is: "+ ref20.price);
		System.out.println("is polished : "+ ref20.isPolished);
		System.out.println("is imported: "+ ref20.isImported);
		
		System.out.println("main started");
	}
}
		
		
