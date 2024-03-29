import java.awt.*;

public abstract class Piece {
    String name;
    Color color;
    char symbol;
    public Piece (String name, Color color, char symbol) {
        this.name = name;
        this.color = color;
        this.symbol = symbol;
    }

}

