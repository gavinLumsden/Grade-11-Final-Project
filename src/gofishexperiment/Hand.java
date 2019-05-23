package gofishexperiment;

/**
 * @author g.lumsden
 */
public class Hand {

    Card[] cards;

    /**
     * makes a hand
     *
     * @param size the size of the hand
     */
    public Hand(int size) {
        cards = new Card[size];
    }

}
