public class Tile {

    private char tile;
    private Board coordinates;

    public Tile (cahr tile, Board coordinates)
    {
        this.tile = tile;
        this.coordinates = coordinates;
    }

    public char getTile() {
        return tile;
    }

    public Board getCoordinates() {
        return coordinates;
    }

    public boolean isEmpty()
    {
       if(Tile.tile == '.'){
           return true;
       }
       return false;
    }

    public boolean isWall()
    {
        if(Tile.tile == '#'){
            return true;
        }
        return false;
    }

    public boolean isPlayer()
    {
        if(Tile.tile == '@'){
            return true;
        }
        return false;
    }

    public boolean isEnemy()
    {
        if(Tile.tile == 'E'){
            return true;
        }
        return false;
    }
}
