class HighCard implements Rank {

  private static int RANK = 0

  boolean visit(Hand hand) {
    hand.rank = this
    hand.strength = getStrength(hand)
    true
  }

  String toString() {
    "High Card"
  }

  private List<Integer> getStrength(Hand h) {
    [RANK] + h.cards.collect { it.value }.sort().reverse()
  }
}