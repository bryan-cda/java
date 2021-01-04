package br.com.auction.service;

import br.com.auction.Auction;
import br.com.auction.Offering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuctionService {

    private Double majorValue =  Double.NEGATIVE_INFINITY;
    private Double smallerValue = Double.POSITIVE_INFINITY;
    private List<Offering> threeMajors;

    public Double getMajorOffering(Auction auction){
        for(Offering value : auction.getOfferingList()){

            if(value.getValue() > majorValue){
                majorValue = value.getValue().doubleValue();
            }
        }
        threeMajors = new ArrayList<>(auction.getOfferingList());

        threeMajors.sort((o1, o2) -> {
            if(o1.getValue() < o2.getValue()){
                return 1;
            }
            if(o1.getValue() > o2.getValue()){
                return -1;
            }
            return 0;
        });

        threeMajors = threeMajors.subList(0, threeMajors.size() >= 3 ? 3 : threeMajors.size());
        return majorValue;
    }

    public Double getSmallerOffering(Auction auction){

        for(Offering value : auction.getOfferingList()){
            if(value.getValue() < smallerValue.doubleValue()){
                this.smallerValue = value.getValue();
            }
        }
        return smallerValue;
    }

    public Double getMajorValue() {
        return majorValue;
    }

    public void setMajorValue(Double majorValue) {
        this.majorValue = majorValue;
    }

    public Double getSmallerValue() {
        return smallerValue;
    }

    public void setSmallerValue(Double smallerValue) {
        this.smallerValue = smallerValue;
    }

    public List<Offering> getThreeMajors() {
        return threeMajors;
    }

    public void setThreeMajors(List<Offering> threeMajors) {
        this.threeMajors = threeMajors;
    }
}
