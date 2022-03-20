import Objects.*;
import Objects.Character;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        Match match = new Match("Gabriel");

        Event[] events = new Event[10];

        events[0] = new Event("Padrão");
        events[1] = new Event("Sonho");
        events[2] = new Event("Alucinação");
        events[3] = new Event("Caçada");
        events[4] = new Event("Doença");
        events[5] = new Event("Seca");
        events[6] = new Event("Festival");
        events[7] = new Event("Motim");
        events[8] = new Event("Guerra");

        Card card = new Card("Carta 1", "Você deseja os meus serviços, senhor?");
        Character character = new Character("Padre Quevedo", "Igreja");
        Option firstOption = new Option("Sim", 1, -1, 2, -2);
        Option secondOption = new Option("Não", 2, -2, 1, -1);
        card.addOptions(firstOption, secondOption);
        card.addCharacter(character);

        events[0].addCard(card);

        int saida = 0;

        do {
            match.printStats();
            card.print();

            int r;

            do r = input.nextInt();
            while (r != 1 && r != 2);

            if(r == 1) match.alterStats(card.getFirstOption());
            else match.alterStats(card.getSecondOption());
        } while (saida != 1);
    }
}