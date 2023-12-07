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
            System.out.println(command);
            command = scanner.nextLine();
        }
    }
}
