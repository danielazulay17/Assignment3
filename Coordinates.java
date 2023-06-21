public class Coordinates {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int range(other Coordinates)
    {
        return int range = Math.sqrt(Math.pow((this.x-other.x),2) + Math.pow((this.y-other.y),2));
    }
}
