package br.com.auction;

import br.com.auction.builder.AuctionBuilder;
import br.com.auction.service.AuctionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuctionExecution {

    private AuctionService auctionService;
    private User john;
    private User cloe;
    private User astrid;
    private User mike;
    private User aida;
    @BeforeEach
    public void setup(){
        this.auctionService = new AuctionService();

        this.john = new User(1L, "John Due");
        this.cloe = new User(2L, "Cloe Chan");
        this.astrid = new User(3L, "Astrid Zoe");
        this.mike = new User(4L, "Mike Shin");
        this.aida = new User(5L, "Aida Ross");
    }
    @Test
    @DisplayName("Given proposal offering then return the major")
    public void givenGenericAuction_whenMakeProposalWithManyOfferings_thenReturnTheMajor(){
        Auction auction = new Auction("Home at New York");

        Offering offering1 = new Offering(john, 120000D);
        Offering offering2 = new Offering(cloe, 130000D);
        Offering offering3 = new Offering(astrid, 140000D);
        Offering offering4 = new Offering(mike, 180000D);
        Offering offering5 = new Offering(aida, 190000D);

        auction.proposal(offering1);
        auction.proposal(offering2);
        auction.proposal(offering3);
        auction.proposal(offering4);
        auction.proposal(offering5);

        Double majorExpected = 190000D;
        Double smallerExpected = 120000D;

        auctionService.getMajorOffering(auction);
        assertEquals(majorExpected, auctionService.getMajorOffering(auction));

    }

    @Test
    @DisplayName("Given proposal offering then return the smaller")
    public void givenGenericAuction_whenMakeProposalWithManyOfferings_thenReturnTheSmaller(){
        Auction auction = new AuctionBuilder().create("Ford Ka Sedan 2012")
                .withProposal(john, 9000D)
                .withProposal(cloe, 9500D)
                .withProposal(astrid, 10000D)
                .withProposal(mike, 14000D)
                .withProposal(aida, 15000D)
                .build();

        Double smallerExpected = 9000D;

        auctionService.getMajorOffering(auction);

        assertEquals(smallerExpected, auctionService.getSmallerOffering(auction));

    }

    @Test
    @DisplayName("Given just one proposal offering then return the major and then smaller")
    public void givenGenericAuction_whenMakeJustOneProposal_thenReturnTheSmallerAndTheMajorSameTime(){
        Auction auction = new AuctionBuilder().create("Ford Eco Sport 2013")
                .withProposal(john, 9000D)
                .build();

        Double smallerExpected = 9000D;
        Double majorExpected = 9000D;

        auctionService.getMajorOffering(auction);

        assertEquals(smallerExpected, auctionService.getSmallerOffering(auction));
        assertEquals(majorExpected, auctionService.getSmallerOffering(auction));

    }

    @Test
    @DisplayName("Given proposals offering then return the three majors offering")
    public void givenGenericAuction_whenMakeProposal_thenReturnTheThreeMajorOffering(){
        Auction auction = new AuctionBuilder().create("Ford Ka Sedan 2012")
                .withProposal(john, 9000D)
                .withProposal(cloe, 9500D)
                .withProposal(astrid, 10000D)
                .withProposal(mike, 14000D)
                .withProposal(aida, 15000D)
                .build();

        Double theFirsMajor = 15000D;
        Double theSecondMajor = 14000D;
        Double theThirdMajor = 10000D;

        auctionService.getMajorOffering(auction);

        assertEquals(theFirsMajor, auctionService.getThreeMajors().get(0).getValue());
        assertEquals(theSecondMajor, auctionService.getThreeMajors().get(1).getValue());
        assertEquals(theThirdMajor, auctionService.getThreeMajors().get(2).getValue());

    }
}
