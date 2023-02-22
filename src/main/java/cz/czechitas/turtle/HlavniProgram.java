package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();
    
    
    public void start() {

        zofka.setLocation(200.0, 200.0);
        nakresli10uholnik(50, Color.pink);


        zofka.turnLeft(108);
        zofka.penUp();
        zofka.move(350);
        zofka.turnLeft(180);
        zofka.turnLeft(17);
        zofka.penDown();
        zofka.setPenColor(Color.green);
        zofka.move(270);
        zofka.turnRight(107);
        zofka.move(156);
        zofka.turnRight(107);
        zofka.move(270);


        zofka.turnLeft(107);
        zofka.move(270);
    }


    /*public void nakresliSnehuliaka (double velkostStrany, Color farba) {
        zofka.setPenColor(farba);
        for (int x = 0; x <14; x++) {
            zofka.turnLeft(30);
            zofka.move(30);

    }*/
    public void nakresli10uholnik(double dlzkaStrany, Color farbaCiar)     {
        zofka.setPenColor(farbaCiar);
        for (int i = 0; i <12; i++) {
            zofka.turnLeft(36);
            zofka.move(dlzkaStrany);
            zofka.penDown();
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
