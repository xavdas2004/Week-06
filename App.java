package finalProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck ofCards = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		ofCards.describe();
		// Using a traditional for loop, iterate 52 times calling the Draw method on the
		// other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			// Card drawnCard = ofCards.draw();
			if (i % 2 == 0) {
				player1.draw(ofCards);
			} else {
				player2.draw(ofCards);
			}
		}
			System.out.println(player1.describe());
		System.out.println(player2.describe());
		// Using a traditional for loop, iterate 26 times and call the flip method for
		// each player.
		for (int i = 0; i < 26; i++) {
			Card play1topCard = player1.flip();
			Card play2topCard = player2.flip();

			/*
			 * Compare the value of each card returned by the two player’s flip methods.
			 * Call the incrementScore method on the player whose card has the higher value.
			 */
			if (play1topCard.getValue() > play2topCard.getValue()) {
				player1.incrementScore();
			} else if (play1topCard.getValue() < play2topCard.getValue()) {
				player2.incrementScore();
			} else {
				//player1.incrementScore();
				//player2.incrementScore();
			}
			//System.out.println("------------------------------------------------");
			//System.out.println("Player 1 score: " + player1.getScore());
			//System.out.println("Player 2 score: " + player2.getScore());
			if (play1topCard.getValue() > play2topCard.getValue()) {
				System.out.println("Player 1 wins!");
				System.out.println("Player 1 score: " + player1.getScore());
				System.out.println("Player 2 score: " + player2.getScore());
				System.out.println("------------------------------------------------");
			} else if (play1topCard.getValue() < play2topCard.getValue()) {
				System.out.println("Player 2 wins!");
				System.out.println("Player 1 score: " + player1.getScore());
				System.out.println("Player 2 score: " + player2.getScore());
				System.out.println("------------------------------------------------");
			} else if (play1topCard.getValue() == play2topCard.getValue()) {
				System.out.println("tie!");
				System.out.println("Player 1 score: " + player1.getScore());
				System.out.println("Player 2 score: " + player2.getScore());
				System.out.println("------------------------------------------------");
			}

		}

		// System.out.println("Player 1 final score is: " + player1.getScore());
		// System.out.println("Player 2 final score is: " + player2.getScore());
		if (player1.getScore() > player2.getScore()){
			System.out.println("Player 1 is the winner!");
		}else if(player1.getScore() < player2.getScore()){
			System.out.println("Player 2 is the winner!");
		}else {
			System.out.println("It's a draw!");
			
		}
			
	}

}
