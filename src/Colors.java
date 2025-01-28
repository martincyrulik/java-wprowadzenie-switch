/**
 * Napisz program, który dla podanego koloru (pierwsza litera),
 * odpowie z czym mu się ten kolor kojarzy
 * 'c' -> pomidor
 * 'z' -> trawa
 * 'n' -> morze
 * inny -> brak skojarzeń
 */

public class Colors {
    public static void main(String[] args) {

        char color = 'n';
        var result = "brak skojarzeń";

        switch (color) {
            case 'c':
                result = "pomidor";
                break;
            case 'z':
                result = "trawa";
                break;
            case 'n':
                result = "morze";
                break;
            default:
                result = "brak skojarzeń";
        }
        System.out.println("Kolor " + color + ": " + result);
    }
}
