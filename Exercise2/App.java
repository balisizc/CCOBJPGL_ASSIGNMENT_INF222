import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet pluto = new Pluto();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();
        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        venus.accept(astronaut);
        jupiter.accept(astronaut);
        pluto.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        venus.accept(rover);
        jupiter.accept(rover);
        pluto.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
    }
}