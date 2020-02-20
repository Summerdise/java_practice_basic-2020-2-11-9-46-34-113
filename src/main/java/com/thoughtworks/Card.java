package com.thoughtworks;

public class Card {
    private final String[] colorList = new String[]{"黑桃", "红桃", "梅花", "方片"};
    private final String[] numberList = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String color;
    private String number;

    public Card(int colorIndex, int numberIndex) {
        this.color = colorList[colorIndex];
        this.number = numberList[numberIndex];
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }
}
