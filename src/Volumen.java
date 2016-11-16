/**
 * @author Sebastian Olah
 * @version 2016/11/16
 */
public class Volumen implements IRaumInhalt {
    private double[] a = 4;

    /**
     * Volumen-Konstruktor
     * +++++++++ Quader / Zylinder / Prisma
     * @param z1 Laenge   Radius     Seite
     * @param z2 Breite   Hoehe      Seite
     * @param z3 Hoehe    null       Seite
     * @param z4 null     null       Hoehe
     */
    public Volumen(double z1, double z2, double z3, double z4){
        a[0] = z1;
        a[1] = z2;
        a[2] = z3;
        a[3] = z4;
    }
    public double getRaumInhalt(){
        if(a[2] == null && a[3] == null){
            Flaeche f = new Flaeche(a[0]);
            return f.getFlaeche() * a[1];
        }else if(a[3] == null) {
            Flaeche f = new Flaeche(a[0], a[1]);
            return f.getFlaeche() * a[2];
        }else{
            Flaeche f = new Flaeche[a[0], a[1], a[2]];
            return f.getFlaeche() * a[3];
        }
    }
}