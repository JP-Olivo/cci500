package Q22Ants;

public class Ant {

    Direction direction;
    Coordinate location;
    Grid grid;

    public Ant(Direction direction,Coordinate location) {
        this.direction = direction;
        this.location = location;
        grid = new Grid(location);

    }


    public void move() {
        switch (direction) {
            case Up:
                if(grid.black(location)) {
                    grid.turnwhite(location);
                    direction = Direction.Left;
                    location = new Coordinate(location.x - 1, location.y);

                } else {
                    grid.turnblack(location);
                    direction = Direction.Right;
                    location = new Coordinate(location.x + 1, location.y);

                }
                break;
            case Down:
                if(grid.black(location)) {
                    grid.turnwhite(location);
                    direction = Direction.Right;
                    location = new Coordinate(location.x + 1, location.y);
                } else {
                    grid.turnblack(location);
                    direction = Direction.Left;
                    location = new Coordinate(location.x - 1, location.y);
                }
                break;
            case Right:
                if(grid.black(location)) {
                    grid.turnwhite(location);
                    direction = Direction.Up;
                    location = new Coordinate(location.x, location.y +1);
                } else {
                    grid.turnblack(location);
                    direction = Direction.Down;
                    location = new Coordinate(location.x , location.y -1);

                }
                break;
            case Left:
                if(grid.black(location)) {
                    grid.turnwhite(location);
                    direction = Direction.Down;
                    location = new Coordinate(location.x, location.y-1);

                } else {
                    grid.turnblack(location);
                    direction = Direction.Up;
                    location = new Coordinate(location.x, location.y +1);

                }


        }
        grid.updateedge(location);
    }

}
