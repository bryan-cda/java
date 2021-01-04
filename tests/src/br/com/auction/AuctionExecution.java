package br.com.auction;

import br.com.auction.service.AuctionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuctionExecution {
    @Test
    public void main(){
        User john = new User(1L, "John Due");
        User cloe = new User(2L, "Cloe Chan");
        User astrid = new User(3L, "Astrid Zoe");
        User mike = new User(4L, "Mike Shin");
        User aida = new User(5L, "Aida Ross");

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

        AuctionService auctionService = new AuctionService();
        auctionService.getMajorOffering(auction);

        List<Offering> threeMajor = auctionService.getThreeMajors();


        assertEquals(majorExpected, auctionService.getMajorOffering(auction));
        assertEquals(smallerExpected, auctionService.getSmallerOffering(auction));
        assertEquals(threeMajor.size(), 3);
        assertEquals(threeMajor.get(0).getValue(), 190000D);
        assertEquals(threeMajor.get(1).getValue(), 180000D);
        assertEquals(threeMajor.get(2).getValue(), 140000D);



    }
}
