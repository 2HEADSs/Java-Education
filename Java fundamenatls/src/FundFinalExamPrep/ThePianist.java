package FundFinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {

    static class Piece {
        String pieceName;
        String composer;
        String key;

        public Piece(String pieceName, String composer, String key) {
            this.pieceName = pieceName;
            this.composer = composer;
            this.key = key;
        }

        public String getpieceName() {
            return pieceName;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Piece> pieces = new LinkedHashMap<>();
        int countPieces = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countPieces; i++) {
            String line = scanner.nextLine();
            String[] pieceParams = line.split("\\|");
            Piece piece = new Piece(pieceParams[0], pieceParams[1], pieceParams[2]);
            pieces.put(piece.getpieceName(), piece);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add":
                    if (!pieces.containsKey(commandParts[1])) {
                        pieces.put(commandParts[1], new Piece(commandParts[1], commandParts[2], commandParts[3]));
                        System.out.println(commandParts[1] + " by " + commandParts[2] + " in " + commandParts[3] + " added to the collection!");
                    } else {
                        System.out.println(commandParts[1] + " is already in the collection!");
                    }
                    break;
                case "Remove":
                    break;
                case "ChangeKey":
                    break;
            }

            command = scanner.nextLine();
        }
    }
}