package com.leara.dtoclasses;

/**
 * @author Jason
 */
public class Emission {
    public Emission(String emissionsLandUse, String emissionsFarm, String emissionsAnimalFeed, String emissionsProcessing, String emissionsTransport, String emissionsRetail, String emissionsPackaging, String emissionsTotal) {
        this.emissionsLandUse = emissionsLandUse;
        this.emissionsFarm = emissionsFarm;
        this.emissionsAnimalFeed = emissionsAnimalFeed;
        this.emissionsProcessing = emissionsProcessing;
        this.emissionsTransport = emissionsTransport;
        this.emissionsRetail = emissionsRetail;
        this.emissionsPackaging = emissionsPackaging;
        this.emissionsTotal = emissionsTotal;
    }

    private String emissionsLandUse;
    private String emissionsFarm;
    private String emissionsAnimalFeed;
    private String emissionsProcessing;
    private String emissionsTransport;
    private String emissionsRetail;
    private String emissionsPackaging;
    private String emissionsTotal;

    public String getEmissionsLandUse() {
        return emissionsLandUse;
    }

    public void setEmissionsLandUse(String emissionsLandUse) {
        this.emissionsLandUse = emissionsLandUse;
    }

    public String getEmissionsFarm() {
        return emissionsFarm;
    }

    public void setEmissionsFarm(String emissionsFarm) {
        this.emissionsFarm = emissionsFarm;
    }

    public String getEmissionsAnimalFeed() {
        return emissionsAnimalFeed;
    }

    public void setEmissionsAnimalFeed(String emissionsAnimalFeed) {
        this.emissionsAnimalFeed = emissionsAnimalFeed;
    }

    public String getEmissionsProcessing() {
        return emissionsProcessing;
    }

    public void setEmissionsProcessing(String emissionsProcessing) {
        this.emissionsProcessing = emissionsProcessing;
    }

    public String getEmissionsTransport() {
        return emissionsTransport;
    }

    public void setEmissionsTransport(String emissionsTransport) {
        this.emissionsTransport = emissionsTransport;
    }

    public String getEmissionsRetail() {
        return emissionsRetail;
    }

    public void setEmissionsRetail(String emissionsRetail) {
        this.emissionsRetail = emissionsRetail;
    }

    public String getEmissionsPackaging() {
        return emissionsPackaging;
    }

    public void setEmissionsPackaging(String emissionsPackaging) {
        this.emissionsPackaging = emissionsPackaging;
    }

    public String getEmissionsTotal() {
        return emissionsTotal;
    }

    public void setEmissionsTotal(String emissionsTotal) {
        this.emissionsTotal = emissionsTotal;
    }
}
