class InvitationCard {
    String eventType;
    String hostName;
    String venue;
    String date;
    String time;
    boolean isDigital;
    boolean isRSVPRequired;
	
	public void getInvitationCardDetails(){
		System.out.println("The Event Type is: "+ eventType);
        System.out.println("The Host Name is: "+ hostName);
        System.out.println("Venue: "+ venue);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Digital Invite: " + isDigital);
        System.out.println("RSVP Required: " + isRSVPRequired);
	}
}
