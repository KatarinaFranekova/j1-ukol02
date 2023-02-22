package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    Color hlava = new Color(51-204-255);
    Color spodnaCast = new Color(0-0-204);
    Color telo = new Color(0-0-255);
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
        zofka.penUp();
        zofka.move(400);
        zofka.turnLeft(90);hjhjhjhj


        nakresli10uholnik(130, Color.blue);
        nakresli10uholnik(100, Color.red);
        nakresli10uholnik(70, Color.orange);

       nakresli10uholnik(30, Color.pink);




/*        nakresliStvorec(50, Color.yellow);


        nakresliObdlznik(50, 200, Color.blue);

        zofka.move(100);

        double stranaT = 100;
        double prepona = Math.sqrt(2*Math.pow(stranaT, 2));
        nakresliPravRovnoTrojuhol(100, prepona, Color.black);*/

    }


    /*public void nakresliSnehuliaka (double velkostStrany, Color farba) {
        zofka.setPenColor(farba);
        for (int x = 0; x <14; x++) {
            zofka.turnLeft(30);
            zofka.move(30);

    }*/


   /* public void nakresliPravRovnoTrojuhol (double stranaT, double prepona, Color farbaT) {
       // double prepona = Math.sqrt(2*Math.pow(stranaT, 2));
        zofka.setPenColor(farbaT);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(stranaT);
        zofka.turnRight(90);
        zofka.move(stranaT);
        zofka.turnRight(135);
        zofka.move(prepona);
    }

    public void nakresliObdlznik (double stranaA, double stranaB, Color farbaObdlznika) {
        zofka.setPenColor(farbaObdlznika);
        for (int o = 0; o < 2; o++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(stranaA);
            zofka.turnRight(90);
            zofka.move(stranaB);
        }




    }





    public void nakresliStvorec (double stranaStvorca, Color farbaStvorca) {
        zofka.setPenColor(farbaStvorca);
        for (int s = 0; s < 4; s++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(stranaStvorca);
        }
    }*/
    public void nakresli10uholnik(double dlzkaStrany, Color farbaCiar)     {
        zofka.setPenColor(farbaCiar);  zofka.penDown();
        for (int i = 0; i <12; i++) {
            zofka.turnLeft(36);
            zofka.move(dlzkaStrany);

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
