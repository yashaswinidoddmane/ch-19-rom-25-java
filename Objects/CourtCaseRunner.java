class CourtCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        CourtCase caseAlpha = new CourtCase();
        caseAlpha.caseTitle = "State vs Sharma";
        caseAlpha.courtName = "Delhi High Court";
        caseAlpha.judge = "Justice Ahuja";
        caseAlpha.yearFiled = 2018;
        caseAlpha.isCriminal = true;
        caseAlpha.isClosed = false;
        caseAlpha.hearingCount = 12;

        CourtCase caseBravo = new CourtCase();
        caseBravo.caseTitle = "Mehra vs Mehra";
        caseBravo.courtName = "Bombay High Court";
        caseBravo.judge = "Justice Rao";
        caseBravo.yearFiled = 2020;
        caseBravo.isCriminal = false;
        caseBravo.isClosed = false;
        caseBravo.hearingCount = 6;

        CourtCase caseCharlie = new CourtCase();
        caseCharlie.caseTitle = "State vs Khan";
        caseCharlie.courtName = "Supreme Court";
        caseCharlie.judge = "Justice Kaul";
        caseCharlie.yearFiled = 2015;
        caseCharlie.isCriminal = true;
        caseCharlie.isClosed = true;
        caseCharlie.hearingCount = 20;

        CourtCase caseDelta = new CourtCase();
        caseDelta.caseTitle = "Patel vs State";
        caseDelta.courtName = "Gujarat High Court";
        caseDelta.judge = "Justice Shah";
        caseDelta.yearFiled = 2019;
        caseDelta.isCriminal = false;
        caseDelta.isClosed = false;
        caseDelta.hearingCount = 9;

        CourtCase caseEcho = new CourtCase();
        caseEcho.caseTitle = "Verma vs Govt";
        caseEcho.courtName = "Rajasthan High Court";
        caseEcho.judge = "Justice Meena";
        caseEcho.yearFiled = 2017;
        caseEcho.isCriminal = false;
        caseEcho.isClosed = true;
        caseEcho.hearingCount = 13;

        CourtCase caseFoxtrot = new CourtCase();
        caseFoxtrot.caseTitle = "Sharma vs Sharma";
        caseFoxtrot.courtName = "Chandigarh District Court";
        caseFoxtrot.judge = "Justice Randhawa";
        caseFoxtrot.yearFiled = 2021;
        caseFoxtrot.isCriminal = false;
        caseFoxtrot.isClosed = false;
        caseFoxtrot.hearingCount = 4;

        CourtCase caseGolf = new CourtCase();
        caseGolf.caseTitle = "Kumar vs Kumar";
        caseGolf.courtName = "Patna High Court";
        caseGolf.judge = "Justice Sinha";
        caseGolf.yearFiled = 2016;
        caseGolf.isCriminal = false;
        caseGolf.isClosed = true;
        caseGolf.hearingCount = 15;

        CourtCase caseHotel = new CourtCase();
        caseHotel.caseTitle = "State vs Reddy";
        caseHotel.courtName = "Hyderabad Sessions Court";
        caseHotel.judge = "Justice Prasad";
        caseHotel.yearFiled = 2022;
        caseHotel.isCriminal = true;
        caseHotel.isClosed = false;
        caseHotel.hearingCount = 5;

        CourtCase caseIndia = new CourtCase();
        caseIndia.caseTitle = "State vs Chawla";
        caseIndia.courtName = "Punjab and Haryana High Court";
        caseIndia.judge = "Justice Bedi";
        caseIndia.yearFiled = 2014;
        caseIndia.isCriminal = true;
        caseIndia.isClosed = true;
        caseIndia.hearingCount = 18;

        CourtCase caseJuliet = new CourtCase();
        caseJuliet.caseTitle = "Sen vs Sen";
        caseJuliet.courtName = "Kolkata High Court";
        caseJuliet.judge = "Justice Ghosh";
        caseJuliet.yearFiled = 2013;
        caseJuliet.isCriminal = false;
        caseJuliet.isClosed = true;
        caseJuliet.hearingCount = 10;

        CourtCase caseKilo = new CourtCase();
        caseKilo.caseTitle = "Das vs State";
        caseKilo.courtName = "Odisha High Court";
        caseKilo.judge = "Justice Mohanty";
        caseKilo.yearFiled = 2018;
        caseKilo.isCriminal = false;
        caseKilo.isClosed = true;
        caseKilo.hearingCount = 11;

        CourtCase caseLima = new CourtCase();
        caseLima.caseTitle = "State vs Shetty";
        caseLima.courtName = "Karnataka High Court";
        caseLima.judge = "Justice Ramesh";
        caseLima.yearFiled = 2021;
        caseLima.isCriminal = true;
        caseLima.isClosed = false;
        caseLima.hearingCount = 7;

        CourtCase caseMike = new CourtCase();
        caseMike.caseTitle = "Dutta vs CompanyX";
        caseMike.courtName = "Consumer Court, Mumbai";
        caseMike.judge = "Justice Naik";
        caseMike.yearFiled = 2020;
        caseMike.isCriminal = false;
        caseMike.isClosed = true;
        caseMike.hearingCount = 3;

        CourtCase caseNovember = new CourtCase();
        caseNovember.caseTitle = "Singh vs BankY";
        caseNovember.courtName = "Delhi Consumer Forum";
        caseNovember.judge = "Justice Malhotra";
        caseNovember.yearFiled = 2019;
        caseNovember.isCriminal = false;
        caseNovember.isClosed = true;
        caseNovember.hearingCount = 8;

        CourtCase caseOscar = new CourtCase();
        caseOscar.caseTitle = "State vs Naidu";
        caseOscar.courtName = "Andhra Pradesh High Court";
        caseOscar.judge = "Justice Reddy";
        caseOscar.yearFiled = 2017;
        caseOscar.isCriminal = true;
        caseOscar.isClosed = true;
        caseOscar.hearingCount = 16;

        CourtCase casePapa = new CourtCase();
        casePapa.caseTitle = "Rao vs Rao";
        casePapa.courtName = "Family Court, Bengaluru";
        casePapa.judge = "Justice Desai";
        casePapa.yearFiled = 2022;
        casePapa.isCriminal = false;
        casePapa.isClosed = false;
        casePapa.hearingCount = 2;

        CourtCase caseQuebec = new CourtCase();
        caseQuebec.caseTitle = "Patel vs State";
        caseQuebec.courtName = "Gujarat High Court";
        caseQuebec.judge = "Justice Shah";
        caseQuebec.yearFiled = 2020;
        caseQuebec.isCriminal = false;
        caseQuebec.isClosed = true;
        caseQuebec.hearingCount = 6;

        CourtCase caseRomeo = new CourtCase();
        caseRomeo.caseTitle = "Mehta vs CorpZ";
        caseRomeo.courtName = "Delhi Corporate Tribunal";
        caseRomeo.judge = "Justice Khanna";
        caseRomeo.yearFiled = 2023;
        caseRomeo.isCriminal = false;
        caseRomeo.isClosed = false;
        caseRomeo.hearingCount = 1;

        CourtCase caseSierra = new CourtCase();
        caseSierra.caseTitle = "Govt vs NGO123";
        caseSierra.courtName = "Supreme Court";
        caseSierra.judge = "Justice Gupta";
        caseSierra.yearFiled = 2021;
        caseSierra.isCriminal = true;
        caseSierra.isClosed = false;
        caseSierra.hearingCount = 4;

        CourtCase caseTango = new CourtCase();
        caseTango.caseTitle = "Ali vs Ali";
        caseTango.courtName = "Lucknow Family Court";
        caseTango.judge = "Justice Ansari";
        caseTango.yearFiled = 2016;
        caseTango.isCriminal = false;
        caseTango.isClosed = true;
        caseTango.hearingCount = 14;
		
		System.out.println("Case Title: " + caseAlpha.caseTitle);
        System.out.println("Court Name: " + caseAlpha.courtName);
        System.out.println("Judge: " + caseAlpha.judge);
        System.out.println("Year Filed: " + caseAlpha.yearFiled);
        System.out.println("Is Criminal: " + caseAlpha.isCriminal);
        System.out.println("Is Closed: " + caseAlpha.isClosed);
        System.out.println("Hearings: " + caseAlpha.hearingCount);
		
		System.out.println("Case Title: " + caseBravo.caseTitle);
        System.out.println("Court Name: " + caseBravo.courtName);
        System.out.println("Judge: " + caseBravo.judge);
        System.out.println("Year Filed: " + caseBravo.yearFiled);
        System.out.println("Is Criminal: " + caseBravo.isCriminal);
        System.out.println("Is Closed: " + caseBravo.isClosed);
        System.out.println("Hearings: " + caseBravo.hearingCount);
		
		System.out.println("Case Title: " + caseCharlie.caseTitle);
        System.out.println("Court Name: " + caseCharlie.courtName);
        System.out.println("Judge: " + caseCharlie.judge);
        System.out.println("Year Filed: " + caseCharlie.yearFiled);
        System.out.println("Is Criminal: " + caseCharlie.isCriminal);
        System.out.println("Is Closed: " + caseCharlie.isClosed);
        System.out.println("Hearings: " + caseCharlie.hearingCount);
		
		System.out.println("Case Title: " + caseEcho.caseTitle);
        System.out.println("Court Name: " + caseEcho.courtName);
        System.out.println("Judge: " + caseEcho.judge);
        System.out.println("Year Filed: " + caseEcho.yearFiled);
        System.out.println("Is Criminal: " + caseEcho.isCriminal);
        System.out.println("Is Closed: " + caseEcho.isClosed);
        System.out.println("Hearings: " + caseEcho.hearingCount);
	}
}
		
		
