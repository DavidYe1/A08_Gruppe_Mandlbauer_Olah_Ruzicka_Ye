
/**
 * Created by @Author Viktor on @version 10.11.2016.
 */
public class Flaeche implements IFlaeche {
    private double a, b, c, erg;
    //Konstruktor für Flächeninhalt vom Kreis
    public Flaeche(double a) {
        a = this.a;
    }
    //Konstruktor für Flächeninhalt vom Rechteck
    public Flaeche(double a, double b) {
        a = this.a;
        b = this.b;
    }
    //Konstruktor für Flächeninhalt vom Dreieck
    public Flaeche(double a, double b, double c) {
        a = this.a;
        b = this.b;
        c = this.c;
    }

    @Override
    public double getFlaeche() {
        return this.erg;
    }

    public double Reckteck(double a, double b) {
        this.erg = a * b;
        return erg;
    }

    public double Kreis(double a) {
        this.erg = Math.pow(a, 2) * Math.PI;
        return erg;
    }

    public double Dreieck(double a, double b, double c) {
        double s = (a + b + c) / 2;
        this.erg = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return erg;
    }
}