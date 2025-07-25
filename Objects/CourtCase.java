class CourtCase {
    String caseTitle;
    String courtName;
    String judge;
    int yearFiled;
    boolean isCriminal;
    boolean isClosed;
    int hearingCount;
	
	public void getCourtCaseDetails(){
		System.out.println("Case Title: " + caseTitle);
        System.out.println("Court Name: " + courtName);
        System.out.println("Judge: " + judge);
        System.out.println("Year Filed: " + yearFiled);
        System.out.println("Is Criminal: " + isCriminal);
        System.out.println("Is Closed: " + isClosed);
        System.out.println("Hearings: " + hearingCount);
	}
}
