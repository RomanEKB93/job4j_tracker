package ru.job4j.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        List<Card> cards = Stream.of(Suit.values())
                           .flatMap(x -> Stream.of(Value.values())
                           .map(y -> new Card(x, y)))
                           .collect(Collectors.toList());
        cards.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }
}