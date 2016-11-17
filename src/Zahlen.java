import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by @Autor DavidYe on @Version 11.11.2016.
 */
public class Zahlen implements IZahlen {

    public static LinkedList<Double> v = new LinkedList<Double>();

    /**
     * Konstruktor
     */
    public Zahlen() {
        LinkedList<Double> v = Zahlen.v;
    }

    /**
     * addiert alle Zahlen von der einer Liste
     *
     * @return summe
     */
    @Override
    public double getSumme() {
        double erg = 0;
        for (Double sumItem : v) {
            erg += sumItem;
        }
        return erg;
    }/**/

    /**
     * findet die kleinste Zahl aus einer Liste
     * @return min
     */
    @Override
    public double getMinimum() {
        return Collections.min(v);
    }

    /**
     * findet die größte Zahl aus einer Liste
     * @return max
     */
    @Override
    public double getMaximum() {
        return Collections.max(v);
    }

    @Override
    public void add(double value) {
        v.add(value);
    }

}

