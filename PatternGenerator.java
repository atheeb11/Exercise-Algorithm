public class PatternGenerator {
    public static void main(String[] args) {
        System.out.println("Sequence Pattern:");
        int up = 6, down = 2;
        for (int i = 0; i < 5; i++) {
            System.out.print(up + " " + (i == 4 ? up + 1 : down + " "));
            up++; down--;
        }
        
        System.out.println("\n\nAB Grid:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print((i + j) % 2 == 0 ? "A " : "B ");
            }
            System.out.println();
        }

        System.out.println("\nX Triangle:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(j <= i ? "X " : "_ ");
            }
            System.out.println();
        }
    }
}