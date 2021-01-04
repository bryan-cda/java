package br.com.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private String description;
    List<Offering> offeringList = new ArrayList<>();

    public Auction(String description) {
        this.description = description;
    }

    public Auction() {
    }

    public void proposal(Offering  offering){
        this.getOfferingList().add(offering);
    }

    @Override
    public String toString() {
        return "Auction{" +
                "description='" + description + '\'' +
                ", offeringList=" + offeringList +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Offering> getOfferingList() {
        return offeringList;
    }

    public void setOfferingList(List<Offering> offeringList) {
        this.offeringList = offeringList;
    }
}
