import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Player {
    public Color color;
    public final Pattern pattern = Pattern.compile("[1-8]{2} [1-8]{2}", Pattern.CASE_INSENSITIVE);
    public Player(Color color) {
        this.color = color;
    }
    // 11 42
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your move.");
        String input = scanner.nextLine();
        while(!ifInputValid(input)) {
            System.out.println("Invalid move, make another.");
            input = scanner.nextLine();
        }

    }
    public boolean ifInputValid(String input) {
        Matcher matcher = pattern.matcher(input);
        if(input.length() != 5) {
            return false;
        }
        return matcher.find();
    }
}
