/**
 * @author Sebastian Olah
 * @version 2016/11/10
 */
public class Volumen implements IRaumInhalt {
    private double a, b, c, d;
    public Volumen(double seite1, double seite2, double seite3, double hoehe){
        this.a = seite1;
        this.b = seite2;
        this.c = seite3;
        this.d = hoehe;
    }
    public Volumen(double laenge, double breite, double hoehe){
        this.a = laenge;
        this.b = breite;
        this.c = hoehe;
        this.d = 0;
    }
    public Volumen(double radius, double hoehe){
        this.a = radius;
        this.b = hoehe;
        this.c = 0;
        this.d = 0;
    }
    public double prisma(){
        Flaeche f = new Flaeche(b, c);
        return f.getFlaeche() * d;
    }
    public double quader(){
        Flaeche f = new Flaeche(b);
        return f.getFlaeche() * c;
    }
    public double zylinder(){
        Flaeche f = new Flaeche();
        return f.getFlaeche() * b;
    }
    @Override
    public double getRaumInhalt() {
        if (c == 0 && d == 0) {
            return zylinder();
        } else if (d == 0) {
            quader();
        }
        return prisma();
    }
}
