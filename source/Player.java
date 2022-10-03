package source;

public class Player {
    private byte points = 0;

    public byte readPoints() {
        return this.points;
    }

    public void incrementPoints() {
        this.points += 1;
    }

    public void decrementPoints() {
        this.points -= 1;
    }
}
