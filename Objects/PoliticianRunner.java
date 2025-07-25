class PoliticianRunner {
    public static void main(String politician[]) {
        System.out.println("Main started");

        Politician gandhi = new Politician();
        gandhi.name = "Rahul Gandhi";
        gandhi.party = "INC";
        gandhi.age = 52;
        gandhi.position = "MP";
        gandhi.isCorrupt = false;
        gandhi.isInOffice = true;
        gandhi.termYears = 8;

        Politician modi = new Politician();
        modi.name = "Narendra Modi";
        modi.party = "BJP";
        modi.age = 74;
        modi.position = "PM";
        modi.isCorrupt = false;
        modi.isInOffice = true;
        modi.termYears = 10;

        Politician mamata = new Politician();
        mamata.name = "Mamata Banerjee";
        mamata.party = "TMC";
        mamata.age = 69;
        mamata.position = "CM";
        mamata.isCorrupt = false;
        mamata.isInOffice = true;
        mamata.termYears = 12;

        Politician kejriwal = new Politician();
        kejriwal.name = "Arvind Kejriwal";
        kejriwal.party = "AAP";
        kejriwal.age = 56;
        kejriwal.position = "CM";
        kejriwal.isCorrupt = true;
        kejriwal.isInOffice = true;
        kejriwal.termYears = 9;

        Politician yadav = new Politician();
        yadav.name = "Akhilesh Yadav";
        yadav.party = "SP";
        yadav.age = 51;
        yadav.position = "Ex-CM";
        yadav.isCorrupt = false;
        yadav.isInOffice = false;
        yadav.termYears = 5;

        Politician shinde = new Politician();
        shinde.name = "Eknath Shinde";
        shinde.party = "Shiv Sena";
        shinde.age = 60;
        shinde.position = "CM";
        shinde.isCorrupt = false;
        shinde.isInOffice = true;
        shinde.termYears = 2;

        Politician sonia = new Politician();
        sonia.name = "Sonia Gandhi";
        sonia.party = "INC";
        sonia.age = 77;
        sonia.position = "President";
        sonia.isCorrupt = true;
        sonia.isInOffice = false;
        sonia.termYears = 20;

        Politician amit = new Politician();
        amit.name = "Amit Shah";
        amit.party = "BJP";
        amit.age = 60;
        amit.position = "Home Minister";
        amit.isCorrupt = false;
        amit.isInOffice = true;
        amit.termYears = 9;

        Politician nitish = new Politician();
        nitish.name = "Nitish Kumar";
        nitish.party = "JD(U)";
        nitish.age = 73;
        nitish.position = "CM";
        nitish.isCorrupt = false;
        nitish.isInOffice = true;
        nitish.termYears = 14;

        Politician tejashwi = new Politician();
        tejashwi.name = "Tejashwi Yadav";
        tejashwi.party = "RJD";
        tejashwi.age = 35;
        tejashwi.position = "Deputy CM";
        tejashwi.isCorrupt = true;
        tejashwi.isInOffice = true;
        tejashwi.termYears = 3;

        Politician stalin = new Politician();
        stalin.name = "M.K. Stalin";
        stalin.party = "DMK";
        stalin.age = 71;
        stalin.position = "CM";
        stalin.isCorrupt = false;
        stalin.isInOffice = true;
        stalin.termYears = 4;

        Politician adityanath = new Politician();
        adityanath.name = "Yogi Adityanath";
        adityanath.party = "BJP";
        adityanath.age = 52;
        adityanath.position = "CM";
        adityanath.isCorrupt = false;
        adityanath.isInOffice = true;
        adityanath.termYears = 6;

        Politician pawar = new Politician();
        pawar.name = "Sharad Pawar";
        pawar.party = "NCP";
        pawar.age = 83;
        pawar.position = "Ex-Minister";
        pawar.isCorrupt = true;
        pawar.isInOffice = false;
        pawar.termYears = 25;

        Politician owaisi = new Politician();
        owaisi.name = "Asaduddin Owaisi";
        owaisi.party = "AIMIM";
        owaisi.age = 54;
        owaisi.position = "MP";
        owaisi.isCorrupt = false;
        owaisi.isInOffice = true;
        owaisi.termYears = 15;

        Politician naveen = new Politician();
        naveen.name = "Naveen Patnaik";
        naveen.party = "BJD";
        naveen.age = 78;
        naveen.position = "CM";
        naveen.isCorrupt = false;
        naveen.isInOffice = true;
        naveen.termYears = 20;

        Politician pinarayi = new Politician();
        pinarayi.name = "Pinarayi Vijayan";
        pinarayi.party = "CPIM";
        pinarayi.age = 79;
        pinarayi.position = "CM";
        pinarayi.isCorrupt = false;
        pinarayi.isInOffice = true;
        pinarayi.termYears = 7;

        Politician kcr = new Politician();
        kcr.name = "K. Chandrashekar Rao";
        kcr.party = "BRS";
        kcr.age = 70;
        kcr.position = "Ex-CM";
        kcr.isCorrupt = true;
        kcr.isInOffice = false;
        kcr.termYears = 9;

        Politician hemant = new Politician();
        hemant.name = "Hemant Soren";
        hemant.party = "JMM";
        hemant.age = 49;
        hemant.position = "CM";
        hemant.isCorrupt = true;
        hemant.isInOffice = false;
        hemant.termYears = 4;

        Politician mayawati = new Politician();
        mayawati.name = "Mayawati";
        mayawati.party = "BSP";
        mayawati.age = 68;
        mayawati.position = "Ex-CM";
        mayawati.isCorrupt = true;
        mayawati.isInOffice = false;
        mayawati.termYears = 10;

        Politician dks = new Politician();
        dks.name = "D.K. Shivakumar";
        dks.party = "INC";
        dks.age = 62;
        dks.position = "Deputy CM";
        dks.isCorrupt = true;
        dks.isInOffice = true;
        dks.termYears = 2;
		
		    System.out.println("Politician Name: " + gandhi.name);
            System.out.println("Politician Party: " + gandhi.party);
            System.out.println("Age: " + gandhi.age);
            System.out.println("Position: " + gandhi.position);
            System.out.println("Is Corrupt: " + gandhi.isCorrupt);
            System.out.println("Is in Office: " + gandhi.isInOffice);
            System.out.println("Term Years: " + gandhi.termYears);
			
			System.out.println("Politician Name: " + modi.name);
            System.out.println("Politician Party: " + modi.party);
            System.out.println("Age: " + modi.age);
            System.out.println("Position: " + modi.position);
            System.out.println("Is Corrupt: " + modi.isCorrupt);
            System.out.println("Is in Office: " + modi.isInOffice);
            System.out.println("Term Years: " + modi.termYears);
			
			System.out.println("Politician Name: " + mamata.name);
            System.out.println("Politician Party: " + mamata.party);
            System.out.println("Age: " + mamata.age);
            System.out.println("Position: " + mamata.position);
            System.out.println("Is Corrupt: " + mamata.isCorrupt);
            System.out.println("Is in Office: " + mamata.isInOffice);
            System.out.println("Term Years: " + mamata.termYears);
			
			System.out.println("Politician Name: " + kejriwal.name);
            System.out.println("Politician Party: " + kejriwal.party);
            System.out.println("Age: " + kejriwal.age);
            System.out.println("Position: " + kejriwal.position);
            System.out.println("Is Corrupt: " + kejriwal.isCorrupt);
            System.out.println("Is in Office: " + kejriwal.isInOffice);
            System.out.println("Term Years: " + kejriwal.termYears);
			
			System.out.println("Politician Name: " + yadav.name);
            System.out.println("Politician Party: " + yadav.party);
            System.out.println("Age: " + yadav.age);
            System.out.println("Position: " + yadav.position);
            System.out.println("Is Corrupt: " + yadav.isCorrupt);
            System.out.println("Is in Office: " + yadav.isInOffice);
            System.out.println("Term Years: " + yadav.termYears);
			
			System.out.println("Politician Name: " + shinde.name);
            System.out.println("Politician Party: " + shinde.party);
            System.out.println("Age: " + shinde.age);
            System.out.println("Position: " + shinde.position);
            System.out.println("Is Corrupt: " + shinde.isCorrupt);
            System.out.println("Is in Office: " + shinde.isInOffice);
            System.out.println("Term Years: " + shinde.termYears);
			
			System.out.println("Politician Name: " + sonia.name);
            System.out.println("Politician Party: " + sonia.party);
            System.out.println("Age: " + sonia.age);
            System.out.println("Position: " + sonia.position);
            System.out.println("Is Corrupt: " + sonia.isCorrupt);
            System.out.println("Is in Office: " + sonia.isInOffice);
            System.out.println("Term Years: " + sonia.termYears);
			
			System.out.println("Politician Name: " + amit.name);
            System.out.println("Politician Party: " + amit.party);
            System.out.println("Age: " + amit.age);
            System.out.println("Position: " + amit.position);
            System.out.println("Is Corrupt: " + amit.isCorrupt);
            System.out.println("Is in Office: " + amit.isInOffice);
            System.out.println("Term Years: " + amit.termYears);
			
			System.out.println("Politician Name: " + nitish.name);
            System.out.println("Politician Party: " + nitish.party);
            System.out.println("Age: " + nitish.age);
            System.out.println("Position: " + nitish.position);
            System.out.println("Is Corrupt: " + nitish.isCorrupt);
            System.out.println("Is in Office: " + nitish.isInOffice);
            System.out.println("Term Years: " + nitish.termYears);
			
			System.out.println("Politician Name: " + tejashwi.name);
            System.out.println("Politician Party: " + tejashwi.party);
            System.out.println("Age: " + tejashwi.age);
            System.out.println("Position: " + tejashwi.position);
            System.out.println("Is Corrupt: " + tejashwi.isCorrupt);
            System.out.println("Is in Office: " + tejashwi.isInOffice);
            System.out.println("Term Years: " + tejashwi.termYears);
			
			System.out.println("Politician Name: " + stalin.name);
            System.out.println("Politician Party: " + stalin.party);
            System.out.println("Age: " + stalin.age);
            System.out.println("Position: " + stalin.position);
            System.out.println("Is Corrupt: " + stalin.isCorrupt);
            System.out.println("Is in Office: " + stalin.isInOffice);
            System.out.println("Term Years: " + stalin.termYears);
			
			System.out.println("Politician Name: " + adityanath.name);
            System.out.println("Politician Party: " + adityanath.party);
            System.out.println("Age: " + adityanath.age);
            System.out.println("Position: " + adityanath.position);
            System.out.println("Is Corrupt: " + adityanath.isCorrupt);
            System.out.println("Is in Office: " + adityanath.isInOffice);
            System.out.println("Term Years: " + adityanath.termYears);
			
			System.out.println("Politician Name: " + pawar.name);
            System.out.println("Politician Party: " + pawar.party);
            System.out.println("Age: " + pawar.age);
            System.out.println("Position: " + pawar.position);
            System.out.println("Is Corrupt: " + pawar.isCorrupt);
            System.out.println("Is in Office: " + pawar.isInOffice);
            System.out.println("Term Years: " + pawar.termYears);
			
			System.out.println("Politician Name: " + owaisi.name);
            System.out.println("Politician Party: " + owaisi.party);
            System.out.println("Age: " + owaisi.age);
            System.out.println("Position: " + owaisi.position);
            System.out.println("Is Corrupt: " + owaisi.isCorrupt);
            System.out.println("Is in Office: " + owaisi.isInOffice);
            System.out.println("Term Years: " + owaisi.termYears);
			
			System.out.println("Politician Name: " + naveen.name);
            System.out.println("Politician Party: " + naveen.party);
            System.out.println("Age: " + naveen.age);
            System.out.println("Position: " + naveen.position);
            System.out.println("Is Corrupt: " + naveen.isCorrupt);
            System.out.println("Is in Office: " + naveen.isInOffice);
            System.out.println("Term Years: " + naveen.termYears);
			
			System.out.println("Politician Name: " + pinarayi.name);
            System.out.println("Politician Party: " + pinarayi.party);
            System.out.println("Age: " + pinarayi.age);
            System.out.println("Position: " + pinarayi.position);
            System.out.println("Is Corrupt: " + pinarayi.isCorrupt);
            System.out.println("Is in Office: " + pinarayi.isInOffice);
            System.out.println("Term Years: " + pinarayi.termYears);
			
			System.out.println("Politician Name: " + kcr.name);
            System.out.println("Politician Party: " + kcr.party);
            System.out.println("Age: " + kcr.age);
            System.out.println("Position: " + kcr.position);
            System.out.println("Is Corrupt: " + kcr.isCorrupt);
            System.out.println("Is in Office: " + kcr.isInOffice);
            System.out.println("Term Years: " + kcr.termYears);
			
			System.out.println("Politician Name: " + hemant.name);
            System.out.println("Politician Party: " + hemant.party);
            System.out.println("Age: " + hemant.age);
            System.out.println("Position: " + hemant.position);
            System.out.println("Is Corrupt: " + hemant.isCorrupt);
            System.out.println("Is in Office: " + hemant.isInOffice);
            System.out.println("Term Years: " + hemant.termYears);
			
			System.out.println("Politician Name: " + mayawati.name);
            System.out.println("Politician Party: " + mayawati.party);
            System.out.println("Age: " + mayawati.age);
            System.out.println("Position: " + mayawati.position);
            System.out.println("Is Corrupt: " + mayawati.isCorrupt);
            System.out.println("Is in Office: " + mayawati.isInOffice);
            System.out.println("Term Years: " + mayawati.termYears);
			
			System.out.println("Politician Name: " + dks.name);
            System.out.println("Politician Party: " + dks.party);
            System.out.println("Age: " + dks.age);
            System.out.println("Position: " + dks.position);
            System.out.println("Is Corrupt: " + dks.isCorrupt);
            System.out.println("Is in Office: " + dks.isInOffice);
            System.out.println("Term Years: " + dks.termYears);
	}
}
			