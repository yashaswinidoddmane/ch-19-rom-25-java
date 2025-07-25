class NetworkRunner {
    public static void main(String network[]) {
        System.out.println("Main started");

        Network ref1 = new Network();
        ref1.networkId = 101;
        ref1.networkName = "HomeWiFi";
        ref1.provider = "Airtel";
        ref1.frequencyGHz = 2.4;
        ref1.bandwidthMbps = 100;
        ref1.isPrivate = true;
        ref1.isEncrypted = true;

        Network ref2 = new Network();
        ref2.networkId = 102;
        ref2.networkName = "OfficeNet";
        ref2.provider = "Jio";
        ref2.frequencyGHz = 5.0;
        ref2.bandwidthMbps = 200;
        ref2.isPrivate = true;
        ref2.isEncrypted = true;

        Network ref3 = new Network();
        ref3.networkId = 103;
        ref3.networkName = "CafePublic";
        ref3.provider = "BSNL";
        ref3.frequencyGHz = 2.4;
        ref3.bandwidthMbps = 50;
        ref3.isPrivate = false;
        ref3.isEncrypted = false;

        Network ref4 = new Network();
        ref4.networkId = 104;
        ref4.networkName = "LibraryNet";
        ref4.provider = "ACT";
        ref4.frequencyGHz = 5.0;
        ref4.bandwidthMbps = 150;
        ref4.isPrivate = true;
        ref4.isEncrypted = true;

        Network ref5 = new Network();
        ref5.networkId = 105;
        ref5.networkName = "MobileHotspot";
        ref5.provider = "Vi";
        ref5.frequencyGHz = 2.4;
        ref5.bandwidthMbps = 40;
        ref5.isPrivate = false;
        ref5.isEncrypted = false;

        Network ref6 = new Network();
        ref6.networkId = 106;
        ref6.networkName = "CollegeLAN";
        ref6.provider = "Tata";
        ref6.frequencyGHz = 5.0;
        ref6.bandwidthMbps = 500;
        ref6.isPrivate = true;
        ref6.isEncrypted = true;

        Network ref7 = new Network();
        ref7.networkId = 107;
        ref7.networkName = "CityNet";
        ref7.provider = "Hathway";
        ref7.frequencyGHz = 2.4;
        ref7.bandwidthMbps = 120;
        ref7.isPrivate = false;
        ref7.isEncrypted = false;

        Network ref8 = new Network();
        ref8.networkId = 108;
        ref8.networkName = "EventWiFi";
        ref8.provider = "Reliance";
        ref8.frequencyGHz = 5.0;
        ref8.bandwidthMbps = 250;
        ref8.isPrivate = false;
        ref8.isEncrypted = true;

        Network ref9 = new Network();
        ref9.networkId = 109;
        ref9.networkName = "GuestNetwork";
        ref9.provider = "Airtel";
        ref9.frequencyGHz = 2.4;
        ref9.bandwidthMbps = 60;
        ref9.isPrivate = false;
        ref9.isEncrypted = false;

        Network ref10 = new Network();
        ref10.networkId = 110;
        ref10.networkName = "SecureVPN";
        ref10.provider = "Nord";
        ref10.frequencyGHz = 5.0;
        ref10.bandwidthMbps = 300;
        ref10.isPrivate = true;
        ref10.isEncrypted = true;

        Network ref11 = new Network();
        ref11.networkId = 111;
        ref11.networkName = "TravelNet";
        ref11.provider = "Vi";
        ref11.frequencyGHz = 2.4;
        ref11.bandwidthMbps = 70;
        ref11.isPrivate = false;
        ref11.isEncrypted = true;

        Network ref12 = new Network();
        ref12.networkId = 112;
        ref12.networkName = "AirportWiFi";
        ref12.provider = "BSNL";
        ref12.frequencyGHz = 5.0;
        ref12.bandwidthMbps = 150;
        ref12.isPrivate = false;
        ref12.isEncrypted = false;

        Network ref13 = new Network();
        ref13.networkId = 113;
        ref13.networkName = "StadiumNet";
        ref13.provider = "ACT";
        ref13.frequencyGHz = 2.4;
        ref13.bandwidthMbps = 100;
        ref13.isPrivate = false;
        ref13.isEncrypted = false;

        Network ref14 = new Network();
        ref14.networkId = 114;
        ref14.networkName = "TechParkWiFi";
        ref14.provider = "JioFiber";
        ref14.frequencyGHz = 5.0;
        ref14.bandwidthMbps = 350;
        ref14.isPrivate = true;
        ref14.isEncrypted = true;

        Network ref15 = new Network();
        ref15.networkId = 115;
        ref15.networkName = "PublicLibraryNet";
        ref15.provider = "RailWire";
        ref15.frequencyGHz = 2.4;
        ref15.bandwidthMbps = 90;
        ref15.isPrivate = false;
        ref15.isEncrypted = false;

        Network ref16 = new Network();
        ref16.networkId = 116;
        ref16.networkName = "ApartmentNet";
        ref16.provider = "Excitel";
        ref16.frequencyGHz = 5.0;
        ref16.bandwidthMbps = 200;
        ref16.isPrivate = true;
        ref16.isEncrypted = true;

        Network ref17 = new Network();
        ref17.networkId = 117;
        ref17.networkName = "ParkFreeWiFi";
        ref17.provider = "BSNL";
        ref17.frequencyGHz = 2.4;
        ref17.bandwidthMbps = 40;
        ref17.isPrivate = false;
        ref17.isEncrypted = false;

        Network ref18 = new Network();
        ref18.networkId = 118;
        ref18.networkName = "ExhibitionWiFi";
        ref18.provider = "Airtel";
        ref18.frequencyGHz = 5.0;
        ref18.bandwidthMbps = 180;
        ref18.isPrivate = false;
        ref18.isEncrypted = true;

        Network ref19 = new Network();
        ref19.networkId = 119;
        ref19.networkName = "RailwayStationWiFi";
        ref19.provider = "RailTel";
        ref19.frequencyGHz = 2.4;
        ref19.bandwidthMbps = 60;
        ref19.isPrivate = false;
        ref19.isEncrypted = false;

        Network ref20 = new Network();
        ref20.networkId = 120;
        ref20.networkName = "StartupNet";
        ref20.provider = "ACT";
        ref20.frequencyGHz = 5.0;
        ref20.bandwidthMbps = 400;
        ref20.isPrivate = true;
        ref20.isEncrypted = true;
		
		System.out.println("network id is:"+ ref1.networkId);
		System.out.println("network name is: "+ ref1.networkName);
		System.out.println("provider :"+ ref1.provider);
		System.out.println("frequency GHz : "+ ref1.frequencyGHz);
		System.out.println("band width Mbps: "+ ref1.bandwidthMbps);
		System.out.println("is private: "+ ref1.isPrivate);
		System.out.println("is encrypted: "+ ref1.isEncrypted);
		
		System.out.println("network id is:"+ ref2.networkId);
		System.out.println("network name is: "+ ref2.networkName);
		System.out.println("provider :"+ ref2.provider);
		System.out.println("frequency GHz : "+ ref2.frequencyGHz);
		System.out.println("band width Mbps: "+ ref2.bandwidthMbps);
		System.out.println("is private: "+ ref2.isPrivate);
		System.out.println("is encrypted: "+ ref2.isEncrypted);
		
		System.out.println("network id is:"+ ref3.networkId);
		System.out.println("network name is: "+ ref3.networkName);
		System.out.println("provider :"+ ref3.provider);
		System.out.println("frequency GHz : "+ ref3.frequencyGHz);
		System.out.println("band width Mbps: "+ ref3.bandwidthMbps);
		System.out.println("is private: "+ ref3.isPrivate);
		System.out.println("is encrypted: "+ ref3.isEncrypted);
		
		System.out.println("network id is:"+ ref4.networkId);
		System.out.println("network name is: "+ ref4.networkName);
		System.out.println("provider :"+ ref4.provider);
		System.out.println("frequency GHz : "+ ref4.frequencyGHz);
		System.out.println("band width Mbps: "+ ref4.bandwidthMbps);
		System.out.println("is private: "+ ref4.isPrivate);
		System.out.println("is encrypted: "+ ref4.isEncrypted);
		
		System.out.println("network id is:"+ ref5.networkId);
		System.out.println("network name is: "+ ref5.networkName);
		System.out.println("provider :"+ ref5.provider);
		System.out.println("frequency GHz : "+ ref5.frequencyGHz);
		System.out.println("band width Mbps: "+ ref5.bandwidthMbps);
		System.out.println("is private: "+ ref5.isPrivate);
		System.out.println("is encrypted: "+ ref5.isEncrypted);
		
		System.out.println("network id is:"+ ref6.networkId);
		System.out.println("network name is: "+ ref6.networkName);
		System.out.println("provider :"+ ref6.provider);
		System.out.println("frequency GHz : "+ ref6.frequencyGHz);
		System.out.println("band width Mbps: "+ ref6.bandwidthMbps);
		System.out.println("is private: "+ ref6.isPrivate);
		System.out.println("is encrypted: "+ ref6.isEncrypted);
		
		System.out.println("network id is:"+ ref7.networkId);
		System.out.println("network name is: "+ ref7.networkName);
		System.out.println("provider :"+ ref7.provider);
		System.out.println("frequency GHz : "+ ref7.frequencyGHz);
		System.out.println("band width Mbps: "+ ref7.bandwidthMbps);
		System.out.println("is private: "+ ref7.isPrivate);
		System.out.println("is encrypted: "+ ref7.isEncrypted);
		
		System.out.println("network id is:"+ ref8.networkId);
		System.out.println("network name is: "+ ref8.networkName);
		System.out.println("provider :"+ ref8.provider);
		System.out.println("frequency GHz : "+ ref8.frequencyGHz);
		System.out.println("band width Mbps: "+ ref8.bandwidthMbps);
		System.out.println("is private: "+ ref8.isPrivate);
		System.out.println("is encrypted: "+ ref8.isEncrypted);
		
		System.out.println("network id is:"+ ref9.networkId);
		System.out.println("network name is: "+ ref9.networkName);
		System.out.println("provider :"+ ref9.provider);
		System.out.println("frequency GHz : "+ ref9.frequencyGHz);
		System.out.println("band width Mbps: "+ ref9.bandwidthMbps);
		System.out.println("is private: "+ ref9.isPrivate);
		System.out.println("is encrypted: "+ ref9.isEncrypted);
		
		System.out.println("network id is:"+ ref10.networkId);
		System.out.println("network name is: "+ ref10.networkName);
		System.out.println("provider :"+ ref10.provider);
		System.out.println("frequency GHz : "+ ref10.frequencyGHz);
		System.out.println("band width Mbps: "+ ref10.bandwidthMbps);
		System.out.println("is private: "+ ref10.isPrivate);
		System.out.println("is encrypted: "+ ref10.isEncrypted);
		
		System.out.println("network id is:"+ ref11.networkId);
		System.out.println("network name is: "+ ref11.networkName);
		System.out.println("provider :"+ ref11.provider);
		System.out.println("frequency GHz : "+ ref11.frequencyGHz);
		System.out.println("band width Mbps: "+ ref11.bandwidthMbps);
		System.out.println("is private: "+ ref11.isPrivate);
		System.out.println("is encrypted: "+ ref11.isEncrypted);
		
		System.out.println("network id is:"+ ref12.networkId);
		System.out.println("network name is: "+ ref12.networkName);
		System.out.println("provider :"+ ref12.provider);
		System.out.println("frequency GHz : "+ ref12.frequencyGHz);
		System.out.println("band width Mbps: "+ ref12.bandwidthMbps);
		System.out.println("is private: "+ ref12.isPrivate);
		System.out.println("is encrypted: "+ ref12.isEncrypted);
		
		System.out.println("network id is:"+ ref13.networkId);
		System.out.println("network name is: "+ ref13.networkName);
		System.out.println("provider :"+ ref13.provider);
		System.out.println("frequency GHz : "+ ref13.frequencyGHz);
		System.out.println("band width Mbps: "+ ref13.bandwidthMbps);
		System.out.println("is private: "+ ref13.isPrivate);
		System.out.println("is encrypted: "+ ref13.isEncrypted);
		
		System.out.println("network id is:"+ ref14.networkId);
		System.out.println("network name is: "+ ref14.networkName);
		System.out.println("provider :"+ ref14.provider);
		System.out.println("frequency GHz : "+ ref14.frequencyGHz);
		System.out.println("band width Mbps: "+ ref14.bandwidthMbps);
		System.out.println("is private: "+ ref14.isPrivate);
		System.out.println("is encrypted: "+ ref14.isEncrypted);
		
		System.out.println("network id is:"+ ref15.networkId);
		System.out.println("network name is: "+ ref15.networkName);
		System.out.println("provider :"+ ref15.provider);
		System.out.println("frequency GHz : "+ ref15.frequencyGHz);
		System.out.println("band width Mbps: "+ ref15.bandwidthMbps);
		System.out.println("is private: "+ ref15.isPrivate);
		System.out.println("is encrypted: "+ ref15.isEncrypted);
		
		System.out.println("network id is:"+ ref16.networkId);
		System.out.println("network name is: "+ ref16.networkName);
		System.out.println("provider :"+ ref16.provider);
		System.out.println("frequency GHz : "+ ref16.frequencyGHz);
		System.out.println("band width Mbps: "+ ref16.bandwidthMbps);
		System.out.println("is private: "+ ref16.isPrivate);
		System.out.println("is encrypted: "+ ref16.isEncrypted);
		
		System.out.println("network id is:"+ ref17.networkId);
		System.out.println("network name is: "+ ref17.networkName);
		System.out.println("provider :"+ ref17.provider);
		System.out.println("frequency GHz : "+ ref17.frequencyGHz);
		System.out.println("band width Mbps: "+ ref17.bandwidthMbps);
		System.out.println("is private: "+ ref17.isPrivate);
		System.out.println("is encrypted: "+ ref17.isEncrypted);
		
		System.out.println("network id is:"+ ref18.networkId);
		System.out.println("network name is: "+ ref18.networkName);
		System.out.println("provider :"+ ref18.provider);
		System.out.println("frequency GHz : "+ ref18.frequencyGHz);
		System.out.println("band width Mbps: "+ ref18.bandwidthMbps);
		System.out.println("is private: "+ ref18.isPrivate);
		System.out.println("is encrypted: "+ ref18.isEncrypted);
		
		System.out.println("network id is:"+ ref19.networkId);
		System.out.println("network name is: "+ ref19.networkName);
		System.out.println("provider :"+ ref19.provider);
		System.out.println("frequency GHz : "+ ref19.frequencyGHz);
		System.out.println("band width Mbps: "+ ref19.bandwidthMbps);
		System.out.println("is private: "+ ref19.isPrivate);
		System.out.println("is encrypted: "+ ref19.isEncrypted);
		
		System.out.println("network id is:"+ ref20.networkId);
		System.out.println("network name is: "+ ref20.networkName);
		System.out.println("provider :"+ ref20.provider);
		System.out.println("frequency GHz : "+ ref20.frequencyGHz);
		System.out.println("band width Mbps: "+ ref20.bandwidthMbps);
		System.out.println("is private: "+ ref20.isPrivate);
		System.out.println("is encrypted: "+ ref20.isEncrypted);
	}

}
		
		