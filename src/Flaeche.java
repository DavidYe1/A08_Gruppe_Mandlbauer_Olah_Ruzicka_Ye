
/**
 * Created by @Author Viktor on @version 10.11.2016.
 */
public class Flaeche implements IFlaeche {
    private double a,b,r;
    @Override
    public double getFlaeche() {
        return 0;
    }
    Flaeche(){
        a = this.a;
        b = this.b;
        r = this.r;
    }

    public double Reckteck(double a, double b){
        double erg = a * b;
        return erg;
    }

    public double Kreis(double r )
        double erg  = Math.pow(r,2)*Math.PI;
}
