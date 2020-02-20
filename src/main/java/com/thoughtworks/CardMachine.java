package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;

public class CardMachine {
    public ArrayList drawCard(int count) {
        if (count > 52) {
            return null;
        }
        ArrayList<int[]> cardList = new ArrayList<>();
        for (int i = 0; i < count; ) {
            int colorIndex = new Random().nextInt(4);
            int numberIndex = new Random().nextInt(13);
            int[] array = new int[]{colorIndex, numberIndex};
            if (!isContain(cardList, array)) {
                cardList.add(array);
                i++;
            }
        }
        return cardList;
    }

    public boolean isContain(ArrayList<int[]> array, int[] item) {
        for (int i = 0; i < array.size(); i++) {
            int[] containItem = array.get(i);
            if (containItem[0] == item[0] && containItem[1] == item[1]) {
                return true;
            }
        }
        return false;
    }

    public void printCardList(ArrayList<int[]> array) {
        if (array == null) {
            System.out.println("抽牌过多");
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            int colorIndex = array.get(i)[0];
            int numberIndex = array.get(i)[1];
            Card card = new Card(colorIndex, numberIndex);
            System.out.print(String.format("%s%s ", card.getColor(), card.getNumber()));
        }
    }
}
