class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        GymEquipment ref1 = new GymEquipment();
        ref1.name = "Treadmill";
        ref1.type = "Cardio";
        ref1.weight = 120.5;
        ref1.brand = "PowerMax";
        ref1.price = 55000;
        ref1.isAdjustable = true;
        ref1.isAvailable = true;

        GymEquipment ref2 = new GymEquipment();
        ref2.name = "Dumbbell";
        ref2.type = "Strength";
        ref2.weight = 10.0;
        ref2.brand = "Flexnest";
        ref2.price = 1500;
        ref2.isAdjustable = false;
        ref2.isAvailable = true;

        GymEquipment ref3 = new GymEquipment();
        ref3.name = "Stationary Bike";
        ref3.type = "Cardio";
        ref3.weight = 90.0;
        ref3.brand = "Fitkit";
        ref3.price = 23000;
        ref3.isAdjustable = true;
        ref3.isAvailable = false;

        GymEquipment ref4 = new GymEquipment();
        ref4.name = "Barbell";
        ref4.type = "Strength";
        ref4.weight = 20.0;
        ref4.brand = "Kobo";
        ref4.price = 2200;
        ref4.isAdjustable = true;
        ref4.isAvailable = true;

        GymEquipment ref5 = new GymEquipment();
        ref5.name = "Kettlebell";
        ref5.type = "Strength";
        ref5.weight = 12.0;
        ref5.brand = "Reebok";
        ref5.price = 1800;
        ref5.isAdjustable = false;
        ref5.isAvailable = true;

        GymEquipment ref6 = new GymEquipment();
        ref6.name = "Smith Machine";
        ref6.type = "Multi-Gym";
        ref6.weight = 300.0;
        ref6.brand = "BodyCraft";
        ref6.price = 95000;
        ref6.isAdjustable = true;
        ref6.isAvailable = false;

        GymEquipment ref7 = new GymEquipment();
        ref7.name = "Rowing Machine";
        ref7.type = "Cardio";
        ref7.weight = 130.0;
        ref7.brand = "Concept2";
        ref7.price = 75000;
        ref7.isAdjustable = true;
        ref7.isAvailable = true;

        GymEquipment ref8 = new GymEquipment();
        ref8.name = "Resistance Bands";
        ref8.type = "Strength";
        ref8.weight = 0.5;
        ref8.brand = "Strauss";
        ref8.price = 899;
        ref8.isAdjustable = true;
        ref8.isAvailable = true;

        GymEquipment ref9 = new GymEquipment();
        ref9.name = "Pull-Up Bar";
        ref9.type = "Strength";
        ref9.weight = 5.0;
        ref9.brand = "Lifeline";
        ref9.price = 1599;
        ref9.isAdjustable = false;
        ref9.isAvailable = true;

        GymEquipment ref10 = new GymEquipment();
        ref10.name = "Leg Press Machine";
        ref10.type = "Strength";
        ref10.weight = 200.0;
        ref10.brand = "Fitness World";
        ref10.price = 48000;
        ref10.isAdjustable = true;
        ref10.isAvailable = false;

        GymEquipment ref11 = new GymEquipment();
        ref11.name = "Chest Press";
        ref11.type = "Strength";
        ref11.weight = 180.0;
        ref11.brand = "Kobo";
        ref11.price = 42000;
        ref11.isAdjustable = true;
        ref11.isAvailable = true;

        GymEquipment ref12 = new GymEquipment();
        ref12.name = "Ab Roller";
        ref12.type = "Core";
        ref12.weight = 1.0;
        ref12.brand = "Domyos";
        ref12.price = 799;
        ref12.isAdjustable = false;
        ref12.isAvailable = true;

        GymEquipment ref13 = new GymEquipment();
        ref13.name = "Cable Crossover";
        ref13.type = "Multi-Gym";
        ref13.weight = 250.0;
        ref13.brand = "Precor";
        ref13.price = 87000;
        ref13.isAdjustable = true;
        ref13.isAvailable = false;

        GymEquipment ref14 = new GymEquipment();
        ref14.name = "Dip Station";
        ref14.type = "Strength";
        ref14.weight = 40.0;
        ref14.brand = "Decathlon";
        ref14.price = 3000;
        ref14.isAdjustable = false;
        ref14.isAvailable = true;

        GymEquipment ref15 = new GymEquipment();
        ref15.name = "Squat Rack";
        ref15.type = "Strength";
        ref15.weight = 100.0;
        ref15.brand = "Joroto";
        ref15.price = 20000;
        ref15.isAdjustable = true;
        ref15.isAvailable = true;

        GymEquipment ref16 = new GymEquipment();
        ref16.name = "Yoga Mat";
        ref16.type = "Flexibility";
        ref16.weight = 1.2;
        ref16.brand = "AmazonBasics";
        ref16.price = 499;
        ref16.isAdjustable = false;
        ref16.isAvailable = true;

        GymEquipment ref17 = new GymEquipment();
        ref17.name = "Medicine Ball";
        ref17.type = "Core";
        ref17.weight = 4.0;
        ref17.brand = "ProsourceFit";
        ref17.price = 2200;
        ref17.isAdjustable = false;
        ref17.isAvailable = false;

        GymEquipment ref18 = new GymEquipment();
        ref18.name = "Stepper";
        ref18.type = "Cardio";
        ref18.weight = 50.0;
        ref18.brand = "Welcare";
        ref18.price = 16000;
        ref18.isAdjustable = true;
        ref18.isAvailable = true;

        GymEquipment ref19 = new GymEquipment();
        ref19.name = "Incline Bench";
        ref19.type = "Strength";
        ref19.weight = 45.0;
        ref19.brand = "Cockatoo";
        ref19.price = 5000;
        ref19.isAdjustable = true;
        ref19.isAvailable = true;

        GymEquipment ref20 = new GymEquipment();
        ref20.name = "Punching Bag";
        ref20.type = "Cardio";
        ref20.weight = 30.0;
        ref20.brand = "Everlast";
        ref20.price = 3500;
        ref20.isAdjustable = false;
        ref20.isAvailable = true;
		
		    System.out.println("equipment Name is: " + ref1.name);
            System.out.println("equipement Type is: " + ref1.type);
            System.out.println("equipment Weight is: " + ref1.weight);
            System.out.println("equipement Brand is: " + ref1.brand);
            System.out.println("equipement Price is: "+ ref1.price);
            System.out.println("is equipement Adjustable: " + ref1.isAdjustable);
            System.out.println("is it Available: " + ref1.isAvailable);
			
			 System.out.println("equipment Name is: " + ref2.name);
            System.out.println("equipement Type is: " + ref2.type);
            System.out.println("equipment Weight is: " + ref2.weight);
            System.out.println("equipement Brand is: " + ref2.brand);
            System.out.println("equipement Price is: "+ ref2.price);
            System.out.println("is equipement Adjustable: " + ref2.isAdjustable);
            System.out.println("is it Available: " + ref2.isAvailable);
			
			 System.out.println("equipment Name is: " + ref3.name);
            System.out.println("equipement Type is: " + ref3.type);
            System.out.println("equipment Weight is: " + ref3.weight);
            System.out.println("equipement Brand is: " + ref3.brand);
            System.out.println("equipement Price is: "+ ref3.price);
            System.out.println("is equipement Adjustable: " + ref3.isAdjustable);
            System.out.println("is it Available: " + ref3.isAvailable);
			
			 System.out.println("equipment Name is: " + ref4.name);
            System.out.println("equipement Type is: " + ref4.type);
            System.out.println("equipment Weight is: " + ref4.weight);
            System.out.println("equipement Brand is: " + ref4.brand);
            System.out.println("equipement Price is: "+ ref4.price);
            System.out.println("is equipement Adjustable: " + ref4.isAdjustable);
            System.out.println("is it Available: " + ref4.isAvailable);
			
			 System.out.println("equipment Name is: " + ref5.name);
            System.out.println("equipement Type is: " + ref5.type);
            System.out.println("equipment Weight is: " + ref5.weight);
            System.out.println("equipement Brand is: " + ref5.brand);
            System.out.println("equipement Price is: "+ ref5.price);
            System.out.println("is equipement Adjustable: " + ref5.isAdjustable);
            System.out.println("is it Available: " + ref5.isAvailable);
			
			 System.out.println("equipment Name is: " + ref6.name);
            System.out.println("equipement Type is: " + ref6.type);
            System.out.println("equipment Weight is: " + ref6.weight);
            System.out.println("equipement Brand is: " + ref6.brand);
            System.out.println("equipement Price is: "+ ref6.price);
            System.out.println("is equipement Adjustable: " + ref6.isAdjustable);
            System.out.println("is it Available: " + ref6.isAvailable);
			
			 System.out.println("equipment Name is: " + ref7.name);
            System.out.println("equipement Type is: " + ref7.type);
            System.out.println("equipment Weight is: " + ref7.weight);
            System.out.println("equipement Brand is: " + ref7.brand);
            System.out.println("equipement Price is: "+ ref7.price);
            System.out.println("is equipement Adjustable: " + ref7.isAdjustable);
            System.out.println("is it Available: " + ref7.isAvailable);
			
			 System.out.println("equipment Name is: " + ref8.name);
            System.out.println("equipement Type is: " + ref8.type);
            System.out.println("equipment Weight is: " + ref8.weight);
            System.out.println("equipement Brand is: " + ref8.brand);
            System.out.println("equipement Price is: "+ ref8.price);
            System.out.println("is equipement Adjustable: " + ref8.isAdjustable);
            System.out.println("is it Available: " + ref8.isAvailable);
			
			 System.out.println("equipment Name is: " + ref9.name);
            System.out.println("equipement Type is: " + ref9.type);
            System.out.println("equipment Weight is: " + ref9.weight );
            System.out.println("equipement Brand is: " + ref9.brand);
            System.out.println("equipement Price is: "+ ref9.price);
            System.out.println("is equipement Adjustable: " + ref9.isAdjustable);
            System.out.println("is it Available: " + ref9.isAvailable);
			
			 System.out.println("equipment Name is: " + ref10.name);
            System.out.println("equipement Type is: " + ref10.type);
            System.out.println("equipment Weight is: " + ref10.weight);
            System.out.println("equipement Brand is: " + ref10.brand);
            System.out.println("equipement Price is: "+ ref1.price);
            System.out.println("is equipement Adjustable: " + ref10.isAdjustable);
            System.out.println("is it Available: " + ref10.isAvailable);
			
			 System.out.println("equipment Name is: " + ref11.name);
            System.out.println("equipement Type is: " + ref11.type);
            System.out.println("equipment Weight is: " + ref11.weight );
            System.out.println("equipement Brand is: " + ref11.brand);
            System.out.println("equipement Price is: "+ ref11.price);
            System.out.println("is equipement Adjustable: " + ref11.isAdjustable);
            System.out.println("is it Available: " + ref11.isAvailable);
			
			 System.out.println("equipment Name is: " + ref12.name);
            System.out.println("equipement Type is: " + ref12.type);
            System.out.println("equipment Weight is: " + ref12.weight );
            System.out.println("equipement Brand is: " + ref12.brand);
            System.out.println("equipement Price is: "+ ref12.price);
            System.out.println("is equipement Adjustable: " + ref12.isAdjustable);
            System.out.println("is it Available: " + ref12.isAvailable);
			
			 System.out.println("equipment Name is: " + ref13.name);
            System.out.println("equipement Type is: " + ref13.type);
            System.out.println("equipment Weight is: " + ref13.weight );
            System.out.println("equipement Brand is: " + ref13.brand);
            System.out.println("equipement Price is: "+ ref13.price);
            System.out.println("is equipement Adjustable: " + ref13.isAdjustable);
            System.out.println("is it Available: " + ref13.isAvailable);
			
			 System.out.println("equipment Name is: " + ref14.name);
            System.out.println("equipement Type is: " + ref14.type);
            System.out.println("equipment Weight is: " + ref14.weight);
            System.out.println("equipement Brand is: " + ref14.brand);
            System.out.println("equipement Price is: "+ ref14.price);
            System.out.println("is equipement Adjustable: " + ref14.isAdjustable);
            System.out.println("is it Available: " + ref14.isAvailable);
			
			 System.out.println("equipment Name is: " + ref15.name);
            System.out.println("equipement Type is: " + ref15.type);
            System.out.println("equipment Weight is: " + ref15.weight );
            System.out.println("equipement Brand is: " + ref15.brand);
            System.out.println("equipement Price is: "+ ref15.price);
            System.out.println("is equipement Adjustable: " + ref15.isAdjustable);
            System.out.println("is it Available: " + ref15.isAvailable);
			
			 System.out.println("equipment Name is: " + ref16.name);
            System.out.println("equipement Type is: " + ref16.type);
            System.out.println("equipment Weight is: " + ref16.weight );
            System.out.println("equipement Brand is: " + ref16.brand);
            System.out.println("equipement Price is: "+ ref16.price);
            System.out.println("is equipement Adjustable: " + ref16.isAdjustable);
            System.out.println("is it Available: " + ref16.isAvailable);
			
			 System.out.println("equipment Name is: " + ref17.name);
            System.out.println("equipement Type is: " + ref17.type);
            System.out.println("equipment Weight is: " + ref17.weight );
            System.out.println("equipement Brand is: " + ref17.brand);
            System.out.println("equipement Price is: "+ ref17.price);
            System.out.println("is equipement Adjustable: " + ref17.isAdjustable);
            System.out.println("is it Available: " + ref17.isAvailable);
			
			 System.out.println("equipment Name is: " + ref18.name);
            System.out.println("equipement Type is: " + ref18.type);
            System.out.println("equipment Weight is: " + ref18.weight);
            System.out.println("equipement Brand is: " + ref18.brand);
            System.out.println("equipement Price is: "+ ref18.price);
            System.out.println("is equipement Adjustable: " + ref18.isAdjustable);
            System.out.println("is it Available: " + ref18.isAvailable);
			
			 System.out.println("equipment Name is: " + ref19.name);
            System.out.println("equipement Type is: " + ref19.type);
            System.out.println("equipment Weight is: " + ref19.weight);
            System.out.println("equipement Brand is: " + ref19.brand);
            System.out.println("equipement Price is: "+ ref19.price);
            System.out.println("is equipement Adjustable: " + ref19.isAdjustable);
            System.out.println("is it Available: " + ref19.isAvailable);
			
			 System.out.println("equipment Name is: " + ref20.name);
            System.out.println("equipement Type is: " + ref20.type);
            System.out.println("equipment Weight is: " + ref20.weight );
            System.out.println("equipement Brand is: " + ref20.brand);
            System.out.println("equipement Price is: "+ ref20.price);
            System.out.println("is equipement Adjustable: " + ref20.isAdjustable);
            System.out.println("is it Available: " + ref20.isAvailable);
	}
}