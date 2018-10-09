package io.github.hendrawd.beyondthekotlinbasics.material

data class Card(val rank: Rank, val suit: Suit)
enum class Suit {
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS
}

enum class Rank {
    TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE,
    TEN, JACK, QUEEN, KING, ACE;

    // simplify 1: with import and function
//     fun of(suit: Suit) = Card(this, suit)

    // simplify 2: with import and infix function
//    import io.github.hendrawd.beyondthekotlinbasics.view.Rank.QUEEN
//    import io.github.hendrawd.beyondthekotlinbasics.view.Suit.HEARTS
//    infix fun of(suit: Suit) = Card(this, suit)
}

class Infix {
    fun main(args: Array<String>) {
        // infix definition:
        // use function as an arithmetic operator,
        // i.e., using it without writing dots and parentheses

        // without simplify
        val card = Card(Rank.QUEEN, Suit.HEARTS)

        // simplify 1: with import and function
//        val card = QUEEN.of(HEARTS)

        // simplify 2: with import and infix function
//        val card = QUEEN of HEARTS
    }
}