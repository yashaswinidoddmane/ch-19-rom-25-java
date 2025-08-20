package com.xworkz.networkapp.network;

public class Network {
    private int networkId;
    public int getNetworkId() {
        return networkId;
    }
    public void setNetworkId(int networkId) {

        this.networkId = networkId;
    }

    private String networkName;

    public String getNetworkName() {

        return networkName;
    }

    public void setNetworkName(String networkName) {

        this.networkName = networkName;
    }

    private String provider;

    public String getProvider() {

        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    private double frequencyGHz;

    public double getFrequencyGHz() {

        return frequencyGHz;
    }

    public void setFrequencyGHz(double frequencyGHz) {

        this.frequencyGHz = frequencyGHz;
    }

    private int bandwidthMbps;

    public int getBandwidthMbps() {

        return bandwidthMbps;
    }

    public void setBandwidthMbps(int bandwidthMbps) {

        this.bandwidthMbps = bandwidthMbps;
    }

    private boolean isPrivate;

    public boolean getisPrivate() {

        return isPrivate;
    }
    public void setisPrivate(boolean isPrivate){

        this.isPrivate = isPrivate;
    }

    private boolean isEncrypted;

    public void setisEncrypted(boolean encrypted) {

        this.isEncrypted = isEncrypted;
    }

    public boolean getisEncrypted(){

        return isEncrypted;
    }
}
