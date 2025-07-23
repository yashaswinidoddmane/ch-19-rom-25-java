class InvitationCardRunner {
    public static void main(String Card[]) {
        System.out.println("Main started");

        InvitationCard ref1 = new InvitationCard();
        ref1.eventType = "Wedding";
        ref1.hostName = "Anil & Sunita";
        ref1.venue = "Palm Grove Resort";
        ref1.date = "15-08-2025";
        ref1.time = "6:00 PM";
        ref1.isDigital = false;
        ref1.isRSVPRequired = true;

        InvitationCard ref2 = new InvitationCard();
        ref2.eventType = "Birthday";
        ref2.hostName = "Ravi Sharma";
        ref2.venue = "Club House, Whitefield";
        ref2.date = "01-09-2025";
        ref2.time = "4:00 PM";
        ref2.isDigital = true;
        ref2.isRSVPRequired = false;

        InvitationCard ref3 = new InvitationCard();
        ref3.eventType = "Housewarming";
        ref3.hostName = "Meera & Family";
        ref3.venue = "New Home, JP Nagar";
        ref3.date = "10-10-2025";
        ref3.time = "12:00 PM";
        ref3.isDigital = false;
        ref3.isRSVPRequired = true;

        InvitationCard ref4 = new InvitationCard();
        ref4.eventType = "Engagement";
        ref4.hostName = "Kiran & Swathi";
        ref4.venue = "Green Valley Hall";
        ref4.date = "20-07-2025";
        ref4.time = "5:30 PM";
        ref4.isDigital = true;
        ref4.isRSVPRequired = true;

        InvitationCard ref5 = new InvitationCard();
        ref5.eventType = "Graduation";
        ref5.hostName = "Divya Nair";
        ref5.venue = "City Auditorium";
        ref5.date = "30-07-2025";
        ref5.time = "2:00 PM";
        ref5.isDigital = true;
        ref5.isRSVPRequired = false;

        InvitationCard ref6 = new InvitationCard();
        ref6.eventType = "Retirement";
        ref6.hostName = "Mr. Suresh";
        ref6.venue = "Company Hall, ITPL";
        ref6.date = "12-08-2025";
        ref6.time = "6:30 PM";
        ref6.isDigital = false;
        ref6.isRSVPRequired = true;

        InvitationCard ref7 = new InvitationCard();
        ref7.eventType = "Baby Shower";
        ref7.hostName = "Sana & Ahmed";
        ref7.venue = "Blue Lotus Banquet";
        ref7.date = "05-09-2025";
        ref7.time = "11:00 AM";
        ref7.isDigital = true;
        ref7.isRSVPRequired = false;

        InvitationCard ref8 = new InvitationCard();
        ref8.eventType = "Farewell";
        ref8.hostName = "Team Omega";
        ref8.venue = "Hotel Leela";
        ref8.date = "25-07-2025";
        ref8.time = "7:00 PM";
        ref8.isDigital = false;
        ref8.isRSVPRequired = false;

        InvitationCard ref9 = new InvitationCard();
        ref9.eventType = "Reunion";
        ref9.hostName = "Batch 2010 - SJPUC";
        ref9.venue = "Grand Convention Center";
        ref9.date = "18-08-2025";
        ref9.time = "3:00 PM";
        ref9.isDigital = true;
        ref9.isRSVPRequired = true;

        InvitationCard ref10 = new InvitationCard();
        ref10.eventType = "Anniversary";
        ref10.hostName = "Ramesh & Kavya";
        ref10.venue = "Holiday Inn";
        ref10.date = "22-09-2025";
        ref10.time = "6:30 PM";
        ref10.isDigital = false;
        ref10.isRSVPRequired = true;

        InvitationCard ref11 = new InvitationCard();
        ref11.eventType = "Book Launch";
        ref11.hostName = "Author Priya Rao";
        ref11.venue = "Sapna Book House";
        ref11.date = "14-08-2025";
        ref11.time = "5:00 PM";
        ref11.isDigital = true;
        ref11.isRSVPRequired = false;

        InvitationCard ref12 = new InvitationCard();
        ref12.eventType = "Art Exhibition";
        ref12.hostName = "Canvas Club";
        ref12.venue = "Art Gallery, MG Road";
        ref12.date = "08-10-2025";
        ref12.time = "10:30 AM";
        ref12.isDigital = true;
        ref12.isRSVPRequired = false;

        InvitationCard ref13 = new InvitationCard();
        ref13.eventType = "Workshop";
        ref13.hostName = "Skill Up Academy";
        ref13.venue = "Innovation Hub";
        ref13.date = "27-08-2025";
        ref13.time = "9:00 AM";
        ref13.isDigital = true;
        ref13.isRSVPRequired = true;

        InvitationCard ref14 = new InvitationCard();
        ref14.eventType = "Charity Gala";
        ref14.hostName = "Hope Foundation";
        ref14.venue = "JW Marriott";
        ref14.date = "11-09-2025";
        ref14.time = "7:30 PM";
        ref14.isDigital = false;
        ref14.isRSVPRequired = true;

        InvitationCard ref15 = new InvitationCard();
        ref15.eventType = "Concert";
        ref15.hostName = "Youth Beats";
        ref15.venue = "Chowdiah Memorial Hall";
        ref15.date = "03-10-2025";
        ref15.time = "8:00 PM";
        ref15.isDigital = true;
        ref15.isRSVPRequired = false;

        InvitationCard ref16 = new InvitationCard();
        ref16.eventType = "Open House";
        ref16.hostName = "Horizon Builders";
        ref16.venue = "Orchid Greens Site";
        ref16.date = "19-08-2025";
        ref16.time = "9:30 AM";
        ref16.isDigital = false;
        ref16.isRSVPRequired = false;

        InvitationCard ref17 = new InvitationCard();
        ref17.eventType = "Cultural Fest";
        ref17.hostName = "ABC College";
        ref17.venue = "College Grounds";
        ref17.date = "29-07-2025";
        ref17.time = "10:00 AM";
        ref17.isDigital = true;
        ref17.isRSVPRequired = false;

        InvitationCard ref18 = new InvitationCard();
        ref18.eventType = "Festival Celebration";
        ref18.hostName = "Residents Association";
        ref18.venue = "Community Hall";
        ref18.date = "16-08-2025";
        ref18.time = "6:00 PM";
        ref18.isDigital = false;
        ref18.isRSVPRequired = false;

        InvitationCard ref19 = new InvitationCard();
        ref19.eventType = "Seminar";
        ref19.hostName = "Tech Minds";
        ref19.venue = "Bangalore International Center";
        ref19.date = "06-09-2025";
        ref19.time = "11:00 AM";
        ref19.isDigital = true;
        ref19.isRSVPRequired = true;

        InvitationCard ref20 = new InvitationCard();
        ref20.eventType = "Startup Pitch";
        ref20.hostName = "InnovateHub";
        ref20.venue = "CoWorks, Indiranagar";
        ref20.date = "09-10-2025";
        ref20.time = "2:30 PM";
        ref20.isDigital = true;
        ref20.isRSVPRequired = true;
		
		    System.out.println("The Event Type is: "+ ref1.eventType);
            System.out.println("The Host Name is: "+ ref1.hostName);
            System.out.println("Venue: "+ ref1.venue);
            System.out.println("Date: " + ref1.date);
            System.out.println("Time: " + ref1.time);
            System.out.println("Digital Invite: " + ref1.isDigital);
            System.out.println("RSVP Required: " + ref1.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref2.eventType);
            System.out.println("The Host Name is: "+ ref2.hostName);
            System.out.println("Venue: "+ ref2.venue);
            System.out.println("Date: " + ref2.date);
            System.out.println("Time: " + ref2.time);
            System.out.println("Digital Invite: " + ref2.isDigital);
            System.out.println("RSVP Required: " + ref2.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref3.eventType);
            System.out.println("The Host Name is: "+ ref3.hostName);
            System.out.println("Venue: "+ ref3.venue);
            System.out.println("Date: " + ref3.date);
            System.out.println("Time: " + ref3.time);
            System.out.println("Digital Invite: " + ref3.isDigital);
            System.out.println("RSVP Required: " + ref3.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref4.eventType);
            System.out.println("The Host Name is: "+ ref4.hostName);
            System.out.println("Venue: "+ ref4.venue);
            System.out.println("Date: " + ref4.date);
            System.out.println("Time: " + ref4.time);
            System.out.println("Digital Invite: " + ref4.isDigital);
            System.out.println("RSVP Required: " + ref4.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref5.eventType);
            System.out.println("The Host Name is: "+ ref5.hostName);
            System.out.println("Venue: "+ ref5.venue);
            System.out.println("Date: " + ref5.date);
            System.out.println("Time: " + ref5.time);
            System.out.println("Digital Invite: " + ref5.isDigital);
            System.out.println("RSVP Required: " + ref5.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref6.eventType);
            System.out.println("The Host Name is: "+ ref6.hostName);
            System.out.println("Venue: "+ ref6.venue);
            System.out.println("Date: " + ref6.date);
            System.out.println("Time: " + ref6.time);
            System.out.println("Digital Invite: " + ref6.isDigital);
            System.out.println("RSVP Required: " + ref6.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref7.eventType);
            System.out.println("The Host Name is: "+ ref7.hostName);
            System.out.println("Venue: "+ ref7.venue);
            System.out.println("Date: " + ref7.date);
            System.out.println("Time: " + ref7.time);
            System.out.println("Digital Invite: " + ref7.isDigital);
            System.out.println("RSVP Required: " + ref7.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref8.eventType);
            System.out.println("The Host Name is: "+ ref8.hostName);
            System.out.println("Venue: "+ ref8.venue);
            System.out.println("Date: " + ref8.date);
            System.out.println("Time: " + ref8.time);
            System.out.println("Digital Invite: " + ref8.isDigital);
            System.out.println("RSVP Required: " + ref8.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref9.eventType);
            System.out.println("The Host Name is: "+ ref9.hostName);
            System.out.println("Venue: "+ ref9.venue);
            System.out.println("Date: " + ref9.date);
            System.out.println("Time: " + ref9.time);
            System.out.println("Digital Invite: " + ref9.isDigital);
            System.out.println("RSVP Required: " + ref9.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref10.eventType);
            System.out.println("The Host Name is: "+ ref10.hostName);
            System.out.println("Venue: "+ ref10.venue);
            System.out.println("Date: " + ref10.date);
            System.out.println("Time: " + ref10.time);
            System.out.println("Digital Invite: " + ref10.isDigital);
            System.out.println("RSVP Required: " + ref10.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref11.eventType);
            System.out.println("The Host Name is: "+ ref11.hostName);
            System.out.println("Venue: "+ ref11.venue);
            System.out.println("Date: " + ref11.date);
            System.out.println("Time: " + ref11.time);
            System.out.println("Digital Invite: " + ref11.isDigital);
            System.out.println("RSVP Required: " + ref11.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref12.eventType);
            System.out.println("The Host Name is: "+ ref12.hostName);
            System.out.println("Venue: "+ ref12.venue);
            System.out.println("Date: " + ref12.date);
            System.out.println("Time: " + ref12.time);
            System.out.println("Digital Invite: " + ref12.isDigital);
            System.out.println("RSVP Required: " + ref12.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref13.eventType);
            System.out.println("The Host Name is: "+ ref13.hostName);
            System.out.println("Venue: "+ ref13.venue);
            System.out.println("Date: " + ref13.date);
            System.out.println("Time: " + ref13.time);
            System.out.println("Digital Invite: " + ref13.isDigital);
            System.out.println("RSVP Required: " + ref13.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref14.eventType);
            System.out.println("The Host Name is: "+ ref14.hostName);
            System.out.println("Venue: "+ ref14.venue);
            System.out.println("Date: " + ref14.date);
            System.out.println("Time: " + ref14.time);
            System.out.println("Digital Invite: " + ref14.isDigital);
            System.out.println("RSVP Required: " + ref14.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref15.eventType);
            System.out.println("The Host Name is: "+ ref15.hostName);
            System.out.println("Venue: "+ ref15.venue);
            System.out.println("Date: " + ref15.date);
            System.out.println("Time: " + ref15.time);
            System.out.println("Digital Invite: " + ref15.isDigital);
            System.out.println("RSVP Required: " + ref15.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref16.eventType);
            System.out.println("The Host Name is: "+ ref16.hostName);
            System.out.println("Venue: "+ ref16.venue);
            System.out.println("Date: " + ref16.date);
            System.out.println("Time: " + ref16.time);
            System.out.println("Digital Invite: " + ref16.isDigital);
            System.out.println("RSVP Required: " + ref16.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref17.eventType);
            System.out.println("The Host Name is: "+ ref17.hostName);
            System.out.println("Venue: "+ ref17.venue);
            System.out.println("Date: " + ref17.date);
            System.out.println("Time: " + ref17.time);
            System.out.println("Digital Invite: " + ref17.isDigital);
            System.out.println("RSVP Required: " + ref17.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref18.eventType);
            System.out.println("The Host Name is: "+ ref18.hostName);
            System.out.println("Venue: "+ ref18.venue);
            System.out.println("Date: " + ref18.date);
            System.out.println("Time: " + ref18.time);
            System.out.println("Digital Invite: " + ref18.isDigital);
            System.out.println("RSVP Required: " + ref18.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref19.eventType);
            System.out.println("The Host Name is: "+ ref19.hostName);
            System.out.println("Venue: "+ ref19.venue);
            System.out.println("Date: " + ref19.date);
            System.out.println("Time: " + ref19.time);
            System.out.println("Digital Invite: " + ref19.isDigital);
            System.out.println("RSVP Required: " + ref19.isRSVPRequired);
			
			System.out.println("The Event Type is: "+ ref20.eventType);
            System.out.println("The Host Name is: "+ ref20.hostName);
            System.out.println("Venue: "+ ref20.venue);
            System.out.println("Date: " + ref20.date);
            System.out.println("Time: " + ref20.time);
            System.out.println("Digital Invite: " + ref20.isDigital);
            System.out.println("RSVP Required: " + ref20.isRSVPRequired);
			
			System.out.println("main ended");
	}
}