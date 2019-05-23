package gofishexperiment;

/**
 * @author g.lumsden
 */
public class Deck {

    public Card[] cards;
    public int topCard;

    /**
     * the deck of cards
     */
    public Deck() {
        cards     = new Card[52];
        cards[0]  = new Card("2",     "clubs",    2,  "2 of Clubs.gif",        null);
        cards[1]  = new Card("2",     "diamonds", 2,  "2 of Diamonds.gif",     null);
        cards[2]  = new Card("2",     "hearts",   2,  "2 of Hearts.gif",       null);
        cards[3]  = new Card("2",     "spades",   2,  "2 of Spades.gif",       null);
        cards[4]  = new Card("3",     "clubs",    3,  "3 of Clubs.gif",        null);
        cards[5]  = new Card("3",     "diamonds", 3,  "3 of Diamonds.gif",     null);
        cards[6]  = new Card("3",     "hearts",   3,  "3 of Hearts.gif",       null);
        cards[7]  = new Card("3",     "spades",   3,  "3 of Spades.gif",       null);
        cards[8]  = new Card("4",     "clubs",    4,  "4 of Clubs.gif",        null);
        cards[9]  = new Card("4",     "diamonds", 4,  "4 of Diamonds.gif",     null);
        cards[10] = new Card("4",     "hearts",   4,  "4 of Hearts.gif",       null);
        cards[11] = new Card("4",     "spades",   4,  "4 of Spades.gif",       null);
        cards[12] = new Card("5",     "clubs",    5,  "5 of Clubs.gif",        null);
        cards[13] = new Card("5",     "diamonds", 5,  "5 of Diamonds.gif",     null);
        cards[14] = new Card("5",     "hearts",   5,  "5 of Hearts.gif",       null);
        cards[15] = new Card("5",     "spades",   5,  "5 of Spades.gif",       null);
        cards[16] = new Card("6",     "clubs",    6,  "6 of Clubs.gif",        null);
        cards[17] = new Card("6",     "diamonds", 6,  "6 of Diamonds.gif",     null);
        cards[18] = new Card("6",     "hearts",   6,  "6 of Hearts.gif",       null);
        cards[19] = new Card("6",     "spades",   6,  "6 of Spades.gif",       null);
        cards[20] = new Card("7",     "clubs",    7,  "7 of Clubs.gif",        null);
        cards[21] = new Card("7",     "diamonds", 7,  "7 of Diamonds.gif",     null);
        cards[22] = new Card("7",     "hearts",   7,  "7 of Hearts.gif",       null);
        cards[23] = new Card("7",     "spades",   7,  "7 of Spades.gif",       null);
        cards[24] = new Card("8",     "clubs",    8,  "8 of Clubs.gif",        null);
        cards[25] = new Card("8",     "diamonds", 8,  "8 of Diamonds.gif",     null);
        cards[26] = new Card("8",     "hearts",   8,  "8 of Hearts.gif",       null);
        cards[27] = new Card("8",     "spades",   8,  "8 of Spades.gif",       null);
        cards[28] = new Card("9",     "clubs",    9,  "9 of Clubs.gif",        null);
        cards[29] = new Card("9",     "diamonds", 9,  "9 of Diamonds.gif",     null);
        cards[30] = new Card("9",     "hearts",   9,  "9 of Hearts.gif",       null);
        cards[31] = new Card("9",     "spades",   9,  "9 of Spades.gif",       null);
        cards[32] = new Card("10",    "clubs",    10, "10 of Clubs.gif",       null);
        cards[33] = new Card("10",    "diamonds", 10, "10 of Diamonds.gif",    null);
        cards[34] = new Card("10",    "hearts",   10, "10 of Hearts.gif",      null);
        cards[35] = new Card("10",    "spades",   10, "10 of Spades.gif",      null);
        cards[36] = new Card("Jack",  "clubs",    11, "Jack of Clubs.gif",     null);
        cards[37] = new Card("Jack",  "diamonds", 11, "Jack of Diamonds.gif",  null);
        cards[38] = new Card("Jack",  "hearts",   11, "Jack of Hearts.gif",    null);
        cards[39] = new Card("Jack",  "spades",   11, "Jack of Spades.gif",    null);
        cards[40] = new Card("Queen", "clubs",    12, "Queen of Clubs.gif",    null);
        cards[41] = new Card("Queen", "diamonds", 12, "Queen of Diamonds.gif", null);
        cards[42] = new Card("Queen", "hearts",   12, "Queen of Hearts.gif",   null);
        cards[43] = new Card("Queen", "spades",   12, "Queen of Spades.gif",   null);
        cards[44] = new Card("King",  "clubs",    13, "King of Clubs.gif",     null);
        cards[45] = new Card("King",  "diamonds", 13, "King of Diamonds.gif",  null);
        cards[46] = new Card("King",  "hearts",   13, "King of Hearts.gif",    null);
        cards[47] = new Card("King",  "spades",   13, "King of Spades.gif",    null);
        cards[48] = new Card("Ace",   "clubs",    1,  "Ace of Clubs.gif",      null);
        cards[49] = new Card("Ace",   "diamonds", 1,  "Ace of Diamonds.gif",   null);
        cards[50] = new Card("Ace",   "hearts",   1,  "Ace of Hearts.gif",     null);
        cards[51] = new Card("Ace",   "spades",   1,  "Ace of Spades.gif",     null);
        topCard = 0;
    }

    /**
     * shuffles the deck
     */
    public void shuffle() {
        Card[] newCards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            int random = random(0, 51);
            while (newCards[random] != null) {
                random = random(0, 51);
            }
            newCards[random] = cards[i];
        }
        for (int i = 0; i < cards.length; i++) {
            cards[i] = newCards[i];
        }
    }

    /**
     * Generates a random number
     *
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return the generated number
     */
    private int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double) low;
        double H      = (double) high;
        double number = (H - L + 1) * seed + L;
        int answer    = (int) number;
        return answer;
    }

    /**
     * deals a hand
     * @param size the size of the hand
     * @return returns the hand
     */
    public Hand deal(int size) {
        Hand hand = new Hand(size);
        for (int i = 0; i < size; i++) {
            hand.cards[i] = cards[topCard];
            topCard++;
        }
        return hand;
    }

    /**
     * deals a single card
     * @return the card
     */
    public Card deal() {
        if (topCard >= cards.length) {
            return null;
        }
        Card card = cards[topCard];
        topCard++;
        return card;
    }

}
