package com.thoughtworks;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    CardMachine cardMachine = new CardMachine();
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    ArrayList cardList=cardMachine.drawCard(count);
    cardMachine.printCardList(cardList);
  }
}
