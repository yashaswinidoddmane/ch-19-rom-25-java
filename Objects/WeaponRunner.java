class WeaponRunner {
    public static void main(String weapon[]) {
        System.out.println("Main started");

        Weapon sword = new Weapon();
        sword.name = "Excalibur";
        sword.type = "Sword";
        sword.weight = 2.5;
        sword.material = "Steel";
        sword.rangeInMeters = 1;
        sword.isLethal = true;

        Weapon dagger = new Weapon();
        dagger.name = "Shadow Fang";
        dagger.type = "Dagger";
        dagger.weight = 0.7;
        dagger.material = "Iron";
        dagger.rangeInMeters = 0;
        dagger.isLethal = true;

        Weapon katana = new Weapon();
        katana.name = "Hattori Hanzo";
        katana.type = "Katana";
        katana.weight = 1.2;
        katana.material = "Carbon Steel";
        katana.rangeInMeters = 1;
        katana.isLethal = true;

        Weapon axe = new Weapon();
        axe.name = "Warbringer";
        axe.type = "Axe";
        axe.weight = 3.4;
        axe.material = "Steel";
        axe.rangeInMeters = 1;
        axe.isLethal = true;

        Weapon spear = new Weapon();
        spear.name = "Sky Piercer";
        spear.type = "Spear";
        spear.weight = 2.8;
        spear.material = "Wood and Iron";
        spear.rangeInMeters = 3;
        spear.isLethal = true;

        Weapon mace = new Weapon();
        mace.name = "Crushbane";
        mace.type = "Mace";
        mace.weight = 4.0;
        mace.material = "Bronze";
        mace.rangeInMeters = 1;
        mace.isLethal = true;

        Weapon bow = new Weapon();
        bow.name = "Eagle Eye";
        bow.type = "Bow";
        bow.weight = 1.8;
        bow.material = "Wood";
        bow.rangeInMeters = 50;
        bow.isLethal = true;

        Weapon crossbow = new Weapon();
        crossbow.name = "Bolt Fury";
        crossbow.type = "Crossbow";
        crossbow.weight = 3.5;
        crossbow.material = "Steel and Wood";
        crossbow.rangeInMeters = 60;
        crossbow.isLethal = true;

        Weapon slingshot = new Weapon();
        slingshot.name = "Pebble Shot";
        slingshot.type = "Slingshot";
        slingshot.weight = 0.3;
        slingshot.material = "Rubber and Wood";
        slingshot.rangeInMeters = 10;
        slingshot.isLethal = false;

        Weapon boomerang = new Weapon();
        boomerang.name = "Whirlwind";
        boomerang.type = "Boomerang";
        boomerang.weight = 0.9;
        boomerang.material = "Wood";
        boomerang.rangeInMeters = 15;
        boomerang.isLethal = false;

        Weapon trident = new Weapon();
        trident.name = "Ocean Strike";
        trident.type = "Trident";
        trident.weight = 2.6;
        trident.material = "Metal";
        trident.rangeInMeters = 2;
        trident.isLethal = true;

        Weapon chakram = new Weapon();
        chakram.name = "Spiral Blade";
        chakram.type = "Chakram";
        chakram.weight = 0.8;
        chakram.material = "Steel";
        chakram.rangeInMeters = 8;
        chakram.isLethal = true;

        Weapon flail = new Weapon();
        flail.name = "Thunder Ball";
        flail.type = "Flail";
        flail.weight = 3.7;
        flail.material = "Iron";
        flail.rangeInMeters = 1;
        flail.isLethal = true;

        Weapon whip = new Weapon();
        whip.name = "Serpent's Lash";
        whip.type = "Whip";
        whip.weight = 1.0;
        whip.material = "Leather";
        whip.rangeInMeters = 5;
        whip.isLethal = false;

        Weapon scythe = new Weapon();
        scythe.name = "Soul Reaper";
        scythe.type = "Scythe";
        scythe.weight = 3.2;
        scythe.material = "Steel";
        scythe.rangeInMeters = 2;
        scythe.isLethal = true;

        Weapon hammer = new Weapon();
        hammer.name = "Titan's Wrath";
        hammer.type = "War Hammer";
        hammer.weight = 5.0;
        hammer.material = "Iron";
        hammer.rangeInMeters = 1;
        hammer.isLethal = true;

        Weapon club = new Weapon();
        club.name = "Stone Club";
        club.type = "Club";
        club.weight = 4.2;
        club.material = "Wood and Stone";
        club.rangeInMeters = 1;
        club.isLethal = true;

        Weapon knuckle = new Weapon();
        knuckle.name = "Iron Knuckle";
        knuckle.type = "Knuckle Duster";
        knuckle.weight = 0.6;
        knuckle.material = "Steel";
        knuckle.rangeInMeters = 0;
        knuckle.isLethal = false;

        Weapon hook = new Weapon();
        hook.name = "Grappler";
        hook.type = "Hook";
        hook.weight = 1.4;
        hook.material = "Iron";
        hook.rangeInMeters = 1;
        hook.isLethal = false;

        Weapon sickle = new Weapon();
        sickle.name = "Harvest Fang";
        sickle.type = "Sickle";
        sickle.weight = 1.1;
        sickle.material = "Steel";
        sickle.rangeInMeters = 1;
        sickle.isLethal = true;
		 
		System.out.println("The weapon Name is: "+ sword.name);
		System.out.println("The weapon type is:"+ sword.type);
		System.out.println("weapon weight is: "+ sword.weight);
		System.out.println("weapon material is: "+ sword.material);
		System.out.println("The Weapon range in meters is: "+ sword.rangeInMeters);
		System.out.println("is weapon is lethal: "+ sword.isLethal);
		
		System.out.println("The weapon Name is: "+ dagger.name);
		System.out.println("The weapon type is:"+ dagger.type);
		System.out.println("weapon weight is: "+ dagger.weight);
		System.out.println("weapon material is: "+ dagger.material);
		System.out.println("The Weapon range in meters is: "+ dagger.rangeInMeters);
		System.out.println("is weapon is lethal: "+ dagger.isLethal);
		
		System.out.println("The weapon Name is: "+ katana.name);
		System.out.println("The weapon type is:"+ katana.type);
		System.out.println("weapon weight is: "+ katana.weight);
		System.out.println("weapon material is: "+ katana.material);
		System.out.println("The Weapon range in meters is: "+ katana.rangeInMeters);
		System.out.println("is weapon is lethal: "+ katana.isLethal);
		
		System.out.println("The weapon Name is: "+ axe.name);
		System.out.println("The weapon type is:"+ axe.type);
		System.out.println("weapon weight is: "+ axe.weight);
		System.out.println("weapon material is: "+ axe.material);
		System.out.println("The Weapon range in meters is: "+ axe.rangeInMeters);
		System.out.println("is weapon is lethal: "+ axe.isLethal);
		
		System.out.println("The weapon Name is: "+ spear.name);
		System.out.println("The weapon type is:"+ spear.type);
		System.out.println("weapon weight is: "+ spear.weight);
		System.out.println("weapon material is: "+ spear.material);
		System.out.println("The Weapon range in meters is: "+ spear.rangeInMeters);
		System.out.println("is weapon is lethal: "+ spear.isLethal);
		
		System.out.println("The weapon Name is: "+ mace.name);
		System.out.println("The weapon type is:"+ mace.type);
		System.out.println("weapon weight is: "+ mace.weight);
		System.out.println("weapon material is: "+ mace.material);
		System.out.println("The Weapon range in meters is: "+ mace.rangeInMeters);
		System.out.println("is weapon is lethal: "+ mace.isLethal);
		
		System.out.println("The weapon Name is: "+ bow.name);
		System.out.println("The weapon type is:"+ bow.type);
		System.out.println("weapon weight is: "+ bow.weight);
		System.out.println("weapon material is: "+ bow.material);
		System.out.println("The Weapon range in meters is: "+ bow.rangeInMeters);
		System.out.println("is weapon is lethal: "+ bow.isLethal);
		
		System.out.println("The weapon Name is: "+ crossbow.name);
		System.out.println("The weapon type is:"+ crossbow.type);
		System.out.println("weapon weight is: "+ crossbow.weight);
		System.out.println("weapon material is: "+ crossbow.material);
		System.out.println("The Weapon range in meters is: "+ crossbow.rangeInMeters);
		System.out.println("is weapon is lethal: "+ crossbow.isLethal);
		
		System.out.println("The weapon Name is: "+ slingshot.name);
		System.out.println("The weapon type is:"+ slingshot.type);
		System.out.println("weapon weight is: "+ slingshot.weight);
		System.out.println("weapon material is: "+ slingshot.material);
		System.out.println("The Weapon range in meters is: "+ slingshot.rangeInMeters);
		System.out.println("is weapon is lethal: "+ slingshot.isLethal);
		
		System.out.println("The weapon Name is: "+ boomerang.name);
		System.out.println("The weapon type is:"+ boomerang.type);
		System.out.println("weapon weight is: "+ boomerang.weight);
		System.out.println("weapon material is: "+ boomerang.material);
		System.out.println("The Weapon range in meters is: "+ boomerang.rangeInMeters);
		System.out.println("is weapon is lethal: "+ boomerang.isLethal);
		
		System.out.println("The weapon Name is: "+ trident.name);
		System.out.println("The weapon type is:"+ trident.type);
		System.out.println("weapon weight is: "+ trident.weight);
		System.out.println("weapon material is: "+ trident.material);
		System.out.println("The Weapon range in meters is: "+ trident.rangeInMeters);
		System.out.println("is weapon is lethal: "+ trident.isLethal);
		
		System.out.println("The weapon Name is: "+ chakram.name);
		System.out.println("The weapon type is:"+ chakram.type);
		System.out.println("weapon weight is: "+ chakram.weight);
		System.out.println("weapon material is: "+ chakram.material);
		System.out.println("The Weapon range in meters is: "+ chakram.rangeInMeters);
		System.out.println("is weapon is lethal: "+ chakram.isLethal);
		
		System.out.println("The weapon Name is: "+ flail.name);
		System.out.println("The weapon type is:"+ flail.type);
		System.out.println("weapon weight is: "+ flail.weight);
		System.out.println("weapon material is: "+ flail.material);
		System.out.println("The Weapon range in meters is: "+ flail.rangeInMeters);
		System.out.println("is weapon is lethal: "+ flail.isLethal);
		
		System.out.println("The weapon Name is: "+ whip.name);
		System.out.println("The weapon type is:"+ whip.type);
		System.out.println("weapon weight is: "+ whip.weight);
		System.out.println("weapon material is: "+ whip.material);
		System.out.println("The Weapon range in meters is: "+ whip.rangeInMeters);
		System.out.println("is weapon is lethal: "+ whip.isLethal);
		
		System.out.println("The weapon Name is: "+ scythe.name);
		System.out.println("The weapon type is:"+ scythe.type);
		System.out.println("weapon weight is: "+ scythe.weight);
		System.out.println("weapon material is: "+ scythe.material);
		System.out.println("The Weapon range in meters is: "+ scythe.rangeInMeters);
		System.out.println("is weapon is lethal: "+ scythe.isLethal);
		
		System.out.println("The weapon Name is: "+ hammer.name);
		System.out.println("The weapon type is:"+ hammer.type);
		System.out.println("weapon weight is: "+ hammer.weight);
		System.out.println("weapon material is: "+ hammer.material);
		System.out.println("The Weapon range in meters is: "+ hammer.rangeInMeters);
		System.out.println("is weapon is lethal: "+ hammer.isLethal);
		
		System.out.println("The weapon Name is: "+ club.name);
		System.out.println("The weapon type is:"+ club.type);
		System.out.println("weapon weight is: "+ club.weight);
		System.out.println("weapon material is: "+ club.material);
		System.out.println("The Weapon range in meters is: "+ club.rangeInMeters);
		System.out.println("is weapon is lethal: "+ club.isLethal);
		
		System.out.println("The weapon Name is: "+ knuckle.name);
		System.out.println("The weapon type is:"+ knuckle.type);
		System.out.println("weapon weight is: "+ knuckle.weight);
		System.out.println("weapon material is: "+ knuckle.material);
		System.out.println("The Weapon range in meters is: "+ knuckle.rangeInMeters);
		System.out.println("is weapon is lethal: "+ knuckle.isLethal);
		
		System.out.println("The weapon Name is: "+ hook.name);
		System.out.println("The weapon type is:"+ hook.type);
		System.out.println("weapon weight is: "+ hook.weight);
		System.out.println("weapon material is: "+ hook.material);
		System.out.println("The Weapon range in meters is: "+ hook.rangeInMeters);
		System.out.println("is weapon is lethal: "+ hook.isLethal);
		
		System.out.println("The weapon Name is: "+ sickle.name);
		System.out.println("The weapon type is:"+ sickle.type);
		System.out.println("weapon weight is: "+ sickle.weight);
		System.out.println("weapon material is: "+ sickle.material);
		System.out.println("The Weapon range in meters is: "+ sickle.rangeInMeters);
		System.out.println("is weapon is lethal: "+ sickle.isLethal);
		
		System.out.println("main ended");
    }
}
		
		
		
		
		
		
		