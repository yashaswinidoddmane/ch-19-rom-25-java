class CoinsRunner {
    public static void main(String coin[]) {
        System.out.println("Main started");

        Coins ref1 = new Coins();
        ref1.country = "India";
        ref1.metalType = "Steel";
        ref1.year = 2020;
        ref1.weight = 5.0;
        ref1.diameter = 23.0;
        ref1.isInCirculation = true;
        ref1.isCollectible = false;

        Coins ref2 = new Coins();
        ref2.country = "USA";
        ref2.metalType = "Copper-Nickel";
        ref2.year = 1999;
        ref2.weight = 8.1;
        ref2.diameter = 26.5;
        ref2.isInCirculation = false;
        ref2.isCollectible = true;

        Coins ref3 = new Coins();
        ref3.country = "UK";
        ref3.metalType = "Nickel-Brass";
        ref3.year = 2010;
        ref3.weight = 9.5;
        ref3.diameter = 28.4;
        ref3.isInCirculation = true;
        ref3.isCollectible = false;

        Coins ref4 = new Coins();
        ref4.country = "Canada";
        ref4.metalType = "Steel";
        ref4.year = 2012;
        ref4.weight = 6.27;
        ref4.diameter = 21.2;
        ref4.isInCirculation = true;
        ref4.isCollectible = false;

        Coins ref5 = new Coins();
        ref5.country = "Australia";
        ref5.metalType = "Aluminum Bronze";
        ref5.year = 1985;
        ref5.weight = 9.0;
        ref5.diameter = 25.0;
        ref5.isInCirculation = false;
        ref5.isCollectible = true;

        Coins ref6 = new Coins();
        ref6.country = "Germany";
        ref6.metalType = "Copper";
        ref6.year = 2001;
        ref6.weight = 7.5;
        ref6.diameter = 22.0;
        ref6.isInCirculation = true;
        ref6.isCollectible = false;

        Coins ref7 = new Coins();
        ref7.country = "France";
        ref7.metalType = "Zinc";
        ref7.year = 1945;
        ref7.weight = 5.3;
        ref7.diameter = 21.0;
        ref7.isInCirculation = false;
        ref7.isCollectible = true;

        Coins ref8 = new Coins();
        ref8.country = "Japan";
        ref8.metalType = "Aluminum";
        ref8.year = 1990;
        ref8.weight = 1.0;
        ref8.diameter = 20.0;
        ref8.isInCirculation = true;
        ref8.isCollectible = false;

        Coins ref9 = new Coins();
        ref9.country = "Italy";
        ref9.metalType = "Bronze";
        ref9.year = 1975;
        ref9.weight = 3.5;
        ref9.diameter = 18.0;
        ref9.isInCirculation = false;
        ref9.isCollectible = true;

        Coins ref10 = new Coins();
        ref10.country = "Russia";
        ref10.metalType = "Steel";
        ref10.year = 2005;
        ref10.weight = 5.0;
        ref10.diameter = 24.0;
        ref10.isInCirculation = true;
        ref10.isCollectible = false;

        Coins ref11 = new Coins();
        ref11.country = "Mexico";
        ref11.metalType = "Bimetallic";
        ref11.year = 2018;
        ref11.weight = 10.5;
        ref11.diameter = 30.0;
        ref11.isInCirculation = true;
        ref11.isCollectible = false;

        Coins ref12 = new Coins();
        ref12.country = "Brazil";
        ref12.metalType = "Stainless Steel";
        ref12.year = 2000;
        ref12.weight = 4.6;
        ref12.diameter = 20.5;
        ref12.isInCirculation = true;
        ref12.isCollectible = false;

        Coins ref13 = new Coins();
        ref13.country = "China";
        ref13.metalType = "Nickel";
        ref13.year = 1995;
        ref13.weight = 5.8;
        ref13.diameter = 22.5;
        ref13.isInCirculation = true;
        ref13.isCollectible = false;

        Coins ref14 = new Coins();
        ref14.country = "South Africa";
        ref14.metalType = "Bronze";
        ref14.year = 1980;
        ref14.weight = 6.2;
        ref14.diameter = 23.3;
        ref14.isInCirculation = false;
        ref14.isCollectible = true;

        Coins ref15 = new Coins();
        ref15.country = "Spain";
        ref15.metalType = "Copper-Nickel";
        ref15.year = 1998;
        ref15.weight = 6.9;
        ref15.diameter = 25.4;
        ref15.isInCirculation = true;
        ref15.isCollectible = false;

        Coins ref16 = new Coins();
        ref16.country = "Nepal";
        ref16.metalType = "Aluminum";
        ref16.year = 2003;
        ref16.weight = 2.0;
        ref16.diameter = 18.5;
        ref16.isInCirculation = true;
        ref16.isCollectible = false;

        Coins ref17 = new Coins();
        ref17.country = "Sri Lanka";
        ref17.metalType = "Stainless Steel";
        ref17.year = 2008;
        ref17.weight = 4.2;
        ref17.diameter = 19.7;
        ref17.isInCirculation = true;
        ref17.isCollectible = false;

        Coins ref18 = new Coins();
        ref18.country = "Bangladesh";
        ref18.metalType = "Brass";
        ref18.year = 1997;
        ref18.weight = 3.8;
        ref18.diameter = 20.6;
        ref18.isInCirculation = false;
        ref18.isCollectible = true;

        Coins ref19 = new Coins();
        ref19.country = "Switzerland";
        ref19.metalType = "Copper";
        ref19.year = 1989;
        ref19.weight = 2.5;
        ref19.diameter = 18.0;
        ref19.isInCirculation = true;
        ref19.isCollectible = false;

        Coins ref20 = new Coins();
        ref20.country = "Bhutan";
        ref20.metalType = "Steel";
        ref20.year = 2015;
        ref20.weight = 3.0;
        ref20.diameter = 20.0;
        ref20.isInCirculation = true;
        ref20.isCollectible = false;
		
		System.out.println("The Country  is: " + ref1.country);
        System.out.println("The Coin Metal Type is: " + ref1.metalType);
        System.out.println("Year: " + ref1.year);
        System.out.println("Coin Weight is: " + ref1.weight );
        System.out.println("Coin Diameter is: " + ref1.diameter );
        System.out.println("In Circulation: " + ref1.isInCirculation);
        System.out.println("Collectible: " + ref1.isCollectible);
		
		System.out.println("The Country  is: " + ref2.country);
        System.out.println("The Coin Metal Type is: " + ref2.metalType);
        System.out.println("Year: " + ref2.year);
        System.out.println("Coin Weight is: " + ref2.weight );
        System.out.println("Coin Diameter is: " + ref2.diameter );
        System.out.println("In Circulation: " + ref2.isInCirculation);
        System.out.println("Collectible: " + ref2.isCollectible);
		
		System.out.println("The Country  is: " + ref3.country);
        System.out.println("The Coin Metal Type is: " + ref3.metalType);
        System.out.println("Year: " + ref3.year);
        System.out.println("Coin Weight is: " + ref3.weight );
        System.out.println("Coin Diameter is: " + ref3.diameter );
        System.out.println("In Circulation: " + ref3.isInCirculation);
        System.out.println("Collectible: " + ref3.isCollectible);
		
		System.out.println("The Country  is: " + ref4.country);
        System.out.println("The Coin Metal Type is: " + ref4.metalType);
        System.out.println("Year: " + ref4.year);
        System.out.println("Coin Weight is: " + ref4.weight );
        System.out.println("Coin Diameter is: " + ref4.diameter );
        System.out.println("In Circulation: " + ref4.isInCirculation);
        System.out.println("Collectible: " + ref4.isCollectible);
		
		System.out.println("The Country  is: " + ref5.country);
        System.out.println("The Coin Metal Type is: " + ref5.metalType);
        System.out.println("Year: " + ref5.year);
        System.out.println("Coin Weight is: " + ref5.weight );
        System.out.println("Coin Diameter is: " + ref5.diameter );
        System.out.println("In Circulation: " + ref5.isInCirculation);
        System.out.println("Collectible: " + ref5.isCollectible);
		
		System.out.println("The Country  is: " + ref6.country);
        System.out.println("The Coin Metal Type is: " + ref6.metalType);
        System.out.println("Year: " + ref6.year);
        System.out.println("Coin Weight is: " + ref6.weight );
        System.out.println("Coin Diameter is: " + ref6.diameter );
        System.out.println("In Circulation: " + ref6.isInCirculation);
        System.out.println("Collectible: " + ref6.isCollectible);
		
		System.out.println("The Country  is: " + ref7.country);
        System.out.println("The Coin Metal Type is: " + ref7.metalType);
        System.out.println("Year: " + ref7.year);
        System.out.println("Coin Weight is: " + ref7.weight );
        System.out.println("Coin Diameter is: " + ref7.diameter );
        System.out.println("In Circulation: " + ref7.isInCirculation);
        System.out.println("Collectible: " + ref7.isCollectible);
		
		System.out.println("The Country  is: " + ref8.country);
        System.out.println("The Coin Metal Type is: " + ref8.metalType);
        System.out.println("Year: " + ref8.year);
        System.out.println("Coin Weight is: " + ref8.weight );
        System.out.println("Coin Diameter is: " + ref8.diameter );
        System.out.println("In Circulation: " + ref8.isInCirculation);
        System.out.println("Collectible: " + ref8.isCollectible);
		
		System.out.println("The Country  is: " + ref9.country);
        System.out.println("The Coin Metal Type is: " + ref9.metalType);
        System.out.println("Year: " + ref9.year);
        System.out.println("Coin Weight is: " + ref9.weight );
        System.out.println("Coin Diameter is: " + ref9.diameter );
        System.out.println("In Circulation: " + ref9.isInCirculation);
        System.out.println("Collectible: " + ref9.isCollectible);
		
		System.out.println("The Country  is: " + ref10.country);
        System.out.println("The Coin Metal Type is: " + ref10.metalType);
        System.out.println("Year: " + ref10.year);
        System.out.println("Coin Weight is: " + ref10.weight );
        System.out.println("Coin Diameter is: " + ref10.diameter );
        System.out.println("In Circulation: " + ref10.isInCirculation);
        System.out.println("Collectible: " + ref10.isCollectible);
		
		System.out.println("The Country  is: " + ref11.country);
        System.out.println("The Coin Metal Type is: " + ref11.metalType);
        System.out.println("Year: " + ref11.year);
        System.out.println("Coin Weight is: " + ref11.weight );
        System.out.println("Coin Diameter is: " + ref11.diameter );
        System.out.println("In Circulation: " + ref11.isInCirculation);
        System.out.println("Collectible: " + ref11.isCollectible);
		
		System.out.println("The Country  is: " + ref12.country);
        System.out.println("The Coin Metal Type is: " + ref12.metalType);
        System.out.println("Year: " + ref12.year);
        System.out.println("Coin Weight is: " + ref12.weight );
        System.out.println("Coin Diameter is: " + ref12.diameter );
        System.out.println("In Circulation: " + ref12.isInCirculation);
        System.out.println("Collectible: " + ref12.isCollectible);
		
		System.out.println("The Country  is: " + ref13.country);
        System.out.println("The Coin Metal Type is: " + ref13.metalType);
        System.out.println("Year: " + ref13.year);
        System.out.println("Coin Weight is: " + ref13.weight );
        System.out.println("Coin Diameter is: " + ref13.diameter );
        System.out.println("In Circulation: " + ref13.isInCirculation);
        System.out.println("Collectible: " + ref13.isCollectible);
		
		System.out.println("The Country  is: " + ref14.country);
        System.out.println("The Coin Metal Type is: " + ref14.metalType);
        System.out.println("Year: " + ref14.year);
        System.out.println("Coin Weight is: " + ref14.weight );
        System.out.println("Coin Diameter is: " + ref14.diameter );
        System.out.println("In Circulation: " + ref14.isInCirculation);
        System.out.println("Collectible: " + ref14.isCollectible);
		
		System.out.println("The Country  is: " + ref15.country);
        System.out.println("The Coin Metal Type is: " + ref15.metalType);
        System.out.println("Year: " + ref15.year);
        System.out.println("Coin Weight is: " + ref15.weight );
        System.out.println("Coin Diameter is: " + ref15.diameter );
        System.out.println("In Circulation: " + ref15.isInCirculation);
        System.out.println("Collectible: " + ref15.isCollectible);
		
		System.out.println("The Country  is: " + ref16.country);
        System.out.println("The Coin Metal Type is: " + ref16.metalType);
        System.out.println("Year: " + ref16.year);
        System.out.println("Coin Weight is: " + ref16.weight );
        System.out.println("Coin Diameter is: " + ref16.diameter );
        System.out.println("In Circulation: " + ref16.isInCirculation);
        System.out.println("Collectible: " + ref16.isCollectible);
		
		System.out.println("The Country  is: " + ref17.country);
        System.out.println("The Coin Metal Type is: " + ref17.metalType);
        System.out.println("Year: " + ref17.year);
        System.out.println("Coin Weight is: " + ref17.weight );
        System.out.println("Coin Diameter is: " + ref17.diameter );
        System.out.println("In Circulation: " + ref17.isInCirculation);
        System.out.println("Collectible: " + ref17.isCollectible);
		
		System.out.println("The Country  is: " + ref18.country);
        System.out.println("The Coin Metal Type is: " + ref18.metalType);
        System.out.println("Year: " + ref18.year);
        System.out.println("Coin Weight is: " + ref18.weight );
        System.out.println("Coin Diameter is: " + ref18.diameter );
        System.out.println("In Circulation: " + ref18.isInCirculation);
        System.out.println("Collectible: " + ref18.isCollectible);
		
		System.out.println("The Country  is: " + ref19.country);
        System.out.println("The Coin Metal Type is: " + ref19.metalType);
        System.out.println("Year: " + ref19.year);
        System.out.println("Coin Weight is: " + ref19.weight );
        System.out.println("Coin Diameter is: " + ref19.diameter );
        System.out.println("In Circulation: " + ref19.isInCirculation);
        System.out.println("Collectible: " + ref19.isCollectible);
		
		System.out.println("The Country  is: " + ref20.country);
        System.out.println("The Coin Metal Type is: " + ref20.metalType);
        System.out.println("Year: " + ref20.year);
        System.out.println("Coin Weight is: " + ref20.weight );
        System.out.println("Coin Diameter is: " + ref20.diameter );
        System.out.println("In Circulation: " + ref20.isInCirculation);
        System.out.println("Collectible: " + ref20.isCollectible);
		
	}
}