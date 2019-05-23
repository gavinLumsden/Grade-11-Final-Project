package gofishexperiment;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author g.lumsden
 */
public class Card {

    public String  type;
    public String  suit;
    public int     value;
    public String  picture;
    public JLabel  image;
    public boolean isClicked;

    /**
     * makes a card
     *
     * @param type the type of card
     * @param suit the suit of the card
     * @param value the value of the card
     * @param picture the picture of the card
     * @param image the image of the card
     */
    public Card(String type, String suit, int value, String picture, JLabel image) {
        this.type    = type;
        this.suit    = suit;
        this.value   = value;
        this.picture = picture;
        this.image   = image;
        isClicked    = false;
    }

    /**
     * gets a new image for the new player card
     */
    public void playerRedraw() {
        image.setIcon(new ImageIcon(getClass().getResource("/pictures/" + picture)));
    }

    /**
     * gets a new image for the new enemy card
     */
    public void enemyRedraw() {
        image.setIcon(new ImageIcon(getClass().getResource("/pictures/" + "Back of Card.gif")));
    }
    
    /**
     * when you click on a card it highlights it
     */
    public void click() {
        if (isClicked == false) {
            isClicked = true;
            image.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.yellow));
        } else {
            isClicked = false;
            image.setBorder(null);
        }
    }

    /**
     * when you hover over a card it highlights it
     *
     * @param isHovering checks to see if you are hovering over a card
     */
    public void hover(boolean isHovering) {
        if (isClicked == false) {
            if (isHovering == true) {
                image.setBorder(BorderFactory.createBevelBorder(1, Color.lightGray, Color.yellow));
            } else {
                image.setBorder(null);
            }
        }
    }

}
