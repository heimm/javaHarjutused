package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        int count = 0;
        while (count < 3) {
            vilgutaPunast(foor1);
            vilgutaPunast(foor2);
            vilgutaRohelist(foor3);
            vilgutaRohelist(foor4);
            count = count + 1;
        }
    }
    public void vilgutaPunast(Foor foor) {
        foor.syytaPunane();
        foor.paus(4);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.kustutaPunane();
        foor.kustutaKollane();
        foor.vahetaRohelist();
        foor.paus(2);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.kustutaRoheline();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.kustutaKollane();
        foor.vahetaPunast();
        foor.paus(2);
        foor.kustutaPunane();

    }
    public void vilgutaRohelist(Foor foor) {
        foor.syytaRoheline();
        foor.paus(2);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.kustutaRoheline();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.kustutaKollane();
        foor.vahetaPunast();
        foor.paus(5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.kustutaPunane();
        foor.kustutaKollane();
        foor.vahetaRohelist();
        foor.paus(1);
        foor.kustutaRoheline();


    }
}
