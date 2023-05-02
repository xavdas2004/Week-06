package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	/*
	 * hand (List of Card) score (set to 0 in the constructor) name Methods describe
	 * (prints out information about the player and calls the describe method for
	 * each card in the Hand List) flip (removes and returns the top card of the
	 * Hand) draw (takes a Deck as an argument and calls the draw method on the
	 * deck, adding the returned Card to the hand field) incrementScore (adds 1 to
	 * the Player’s score field)
	 */
	private List<Card> hand;

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int score;
	private String name;
	private Deck deck;

	public Player(String name) {
		this.hand = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
		this.deck = new Deck();
		this.deck.shuffle();
	}

	public String describe() {
		StringBuilder playerDesc = new StringBuilder();
		playerDesc.append(this.name + " :\n");
		playerDesc.append("Player Score: " + this.score + "\n");
		playerDesc.append("Player Hand: \n");
		if (this.hand.isEmpty()) {
			playerDesc.append("There are no more cards in the hand. \n");
		} else {
			for (Card card : this.hand) {
				playerDesc.append(card.getName() + " of " + card.getSuit() + "* ");
				// return playerDesc.toString();
			}
			//playerDesc.delete(playerDesc.length() - 2, playerDesc.length());
			// return playerDesc.toString();
			System.out.println("|----------------------------------------------------------------|");
		}
		return playerDesc.toString();
	}

	public Card flip() {

		if (hand.isEmpty()) {
			System.out.println("No more cards in hand");
			return null;
		}
		Card flippedCard = hand.remove(0);
		System.out.println("Flipped card: " + flippedCard.getName() + " of " + flippedCard.getSuit());
		return flippedCard;

	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
		deck.shuffle();
	}

	public void incrementScore() {
		this.score++;
	}

}
