package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    Color hlava = new Color(51,204,255);
    Color spodnaCast = new Color(0,0,204);
    Color telo = new Color(0,0,255);
    public void start() {


        // MASINKA

        nakresliObdlznik(100,200, Color.orange);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(100);
        //  zofka.turnRight(180);
        nakresliObdlznik2(300,100, Color.green);

        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(25);
        // zofka.turnRight(180);

        nakresliKruh(40, Color.pink);

        zofka.turnRight(106);
        //zofka.turnLeft(144);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(20);
        nakresliKruh(20, Color.pink);

        zofka.turnRight(20);
        zofka.penUp();
        zofka.move(130);
        nakresliKruh(20, Color.pink);

        zofka.penUp();
        zofka.move(120);
        zofka.turnLeft(162);

        double stranaTrojuholnika = 100;
        double preponaT = Math.sqrt(2*Math.pow(stranaTrojuholnika, 2));
        zofka.penDown();
        zofka.setPenColor(Color.black);
        zofka.move(stranaTrojuholnika);
        zofka.turnRight(90);
        zofka.move(stranaTrojuholnika);
        zofka.turnRight(135);
        zofka.move(preponaT);
        //koniec masinky

        //presun dolava

        zofka.turnLeft(45);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();


        // ZMRZLINA

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
        zofka.turnLeft(90);
        zofka.move(150);

        //koniec zmrzliny

        nakresli10uholnik(100, spodnaCast);
        nakresli10uholnik(70, telo);
        nakresli10uholnik(50, hlava);


    }

    public void nakresliTrojuholnik (double velkostStranyT, Color farbaTrojuholnika) {
        zofka.setPenColor(farbaTrojuholnika);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
        zofka.move(velkostStranyT);
        zofka.turnLeft(120.0);
    }
    public void nakresliObdlznik2 (double stranaX, double stranaY, Color farbaObdl) {
        zofka.setPenColor(farbaObdl);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(stranaX);
        zofka.turnLeft(90);
        zofka.move(stranaY);
        zofka.turnLeft(90);
        zofka.move(stranaX);
    }

    public void nakresliPravRovnoTrojuhol (double stranaT, double prepona, Color farbaT) {
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

    public void nakresliStvorec (double stranaStvorca, Color farbaStvorca) {
        zofka.setPenColor(farbaStvorca);
        for (int s = 0; s < 4; s++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(stranaStvorca);
        }
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
    public void nakresliKruh(double dlzkaStrany, Color farbaKruhu) {
        zofka.setPenColor(farbaKruhu);
        zofka.penDown();
        for (int z = 0; z < 12; z++) {
            zofka.turnRight(36);
            zofka.move(dlzkaStrany);
        }
    }
    public void nakresli10uholnik(double dlzkaStrany, Color farbaCiar)     {
        zofka.setPenColor(farbaCiar);
        zofka.penDown();
        for (int i = 0; i <12; i++) {
            zofka.turnLeft(36);
            zofka.move(dlzkaStrany);

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
