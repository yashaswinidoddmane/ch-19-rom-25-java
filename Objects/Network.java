class Network {
    int networkId;
    String networkName;
    String provider;
    double frequencyGHz;
    int bandwidthMbps;
    boolean isPrivate;
    boolean isEncrypted;
	
	public void getNetworkDetails(){
		System.out.println("network id is:"+ networkId);
		System.out.println("network name is: "+ networkName);
		System.out.println("provider :"+ provider);
		System.out.println("frequency GHz : "+ frequencyGHz);
		System.out.println("band width Mbps: "+ bandwidthMbps);
		System.out.println("is private: "+ isPrivate);
		System.out.println("is encrypted: "+ isEncrypted);
	}
}