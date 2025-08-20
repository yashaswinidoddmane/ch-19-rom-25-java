package com.xworkz.networkapp.network;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Network network = new Network();
        network.setNetworkId(101);
        network.setNetworkName("FastNet");
        network.setProvider("Airtel");
        network.setFrequencyGHz(5.0);
        network.setBandwidthMbps(100);
        network.setisPrivate(true);
        network.setisEncrypted(true);


        int networkId = network.getNetworkId();
        String networkName = network.getNetworkName();
        String provider = network.getProvider();
        double frequencyGHz = network.getFrequencyGHz();
        int bandwidthMbps = network.getBandwidthMbps();
        boolean isPrivate = network.getisPrivate();
        boolean isEncrypted = network.getisEncrypted();

        System.out.println("Network ID is: " + networkId);
        System.out.println("Network Name is: " + networkName);
        System.out.println("Network Provider is: " + provider);
        System.out.println("NetworkFrequency is: " + frequencyGHz);
        System.out.println("Network Bandwidth is: " + bandwidthMbps);
        System.out.println("Is Private: " + isPrivate);
        System.out.println("Is Encrypted: " + isEncrypted);

        System.out.println("Main ended");
    }
}
