package br.com.auction.builder;

import br.com.auction.Auction;
import br.com.auction.Offering;
import br.com.auction.User;

public class AuctionBuilder {

    private Auction auction;

    public AuctionBuilder create(String description){
        this.auction = new Auction(description);
        return this;
    }

    public AuctionBuilder withProposal(User user, Double value){
        auction.proposal(new Offering(user, value));
        return this;
    }

    public Auction build(){
        return this.auction;
    }

}
