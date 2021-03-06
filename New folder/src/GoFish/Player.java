public abstract class Player {

    /** The name of the player */
    protected String username;
    
    /** The hand: the cards held by one player. */
    protected Hand hand;
    
    /**
     * Instantiates a new player with an empty hand.
     *
     * @param username, the name of the player
     * @param password, the password of the player
     */  
    public Player(String username, String password) {
       
        // Dont't know how to login
        
    }

    
    /**
     * Instantiates a new guest player with an empty hand.
     *
     * @param guest, the name of the player
     */    
    public Player(String guest) {
        this.username = guest;
        this.hand = new Hand();
    }

    /**
     * Gets the name.
     *
     * @return the name of the player.
     */
    public String getName() {
        return username;
    }

    /**
     * Gets the hand.
     *
     * @return the player's hand. */
    public Hand getHand() {
        return hand;
    }

    /**
     * Play: this is an abstract method 
     */
    public abstract Card play(Game GoFish);

    public int score() {
    	
    	return 1;
    }

    /**
     * Display the cards in player's hand.
     */
    public void display() {
    	System.out.println(username + "'s hand:");
        System.out.println(hand);
    }

    /**
     * Display the player's name and score.
     */
    public void displayScore() {
        System.out.println(username + " has " + score() + " points");
    }

    /**
     * Card matches: two cards match if their rank is the same. 
	 * @param card1, the card 1
     * @param card2, the card 2
     * @return true, if card1 matches card2
     */
    public static boolean cardMatches(Card card1, Card card2) {
    	return card1.getRank() == card2.getRank();
    		    	
    }
}
