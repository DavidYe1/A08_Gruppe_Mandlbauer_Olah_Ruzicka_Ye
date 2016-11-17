/**
 * @author Moritz Ruzicka
 * @version 10.11.2016 v 1.0
 *
 */
public class Test {
    /*
    Testet die Klassen Zahlen, Volumen und Fleache.
    @author Moritz Ruzicka
    @since 10.11.2016
     */
    public static void main(String[] args){
        Volumen v = new Volumen(8, 8, 8, 12);
        Volumen v2 = new Volumen(4, 6, 4);
        Volumen v3 = new Volumen(7, 10);
        double erg = v.getRaumInhalt();
        double erg2 = v2.getRaumInhalt();
        double erg3 = v3.getRaumInhalt();

        Flaeche f = new Flaeche();
        Flaeche f2 = new Flaeche(5);
        Flaeche f3 = new Flaeche(2, 8);

        Zahlen z = new Zahlen();
        v.add(1.0);
        v.add(1.0);
        System.out.println(this.getSumme());
    }
}

