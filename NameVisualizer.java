public class NameVisualizer {
    public static void main(String[] args) {
        String name = "Nugraha";
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.toUpperCase().charAt(j) + " ");
            }
            System.out.println();
        }
    }
}