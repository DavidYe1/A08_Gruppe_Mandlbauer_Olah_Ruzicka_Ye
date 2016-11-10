/**
 * @author Sebastian Olah
 * @version 2016/11/10
 */
public class Volumen implements IRaumInhalt {
    private double a, b, c, d;
    public Volumen(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Volumen(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
    }
    public Volumen(double a, double b){
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    public double prisma(){
        Flaeche f = new Flaeche(a,b,c);
        return f.getFlaeche * d;
    }
    public double quader(){
        Flaeche f = new Flaeche(a,b);
        return f.getFlaeche() * c;
    }
    public double zylinder(){
        Flaeche f = new Flaeche(a);
        return f.getFlaeche() * b;
    }
    @Override
    public double getRaumInhalt() {
        if(c == null && d == null){
            return zylinder();
        }else if(d == null){
            quader();
        }
        return prisma();
    }
}
