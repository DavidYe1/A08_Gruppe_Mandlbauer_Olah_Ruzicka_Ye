import java.util.LinkedList;

/**
 * Created by @Autor DavidYe on @Version 11.11.2016.
 */
public class Zahlen implements IZahlen {

    public static LinkedList<Double> v = new LinkedList<Double>();

    public Zahlen(LinkedList<Double> v) {
        v = Zahlen.v;
    }
    @Override
    public double getSumme() {
        double erg = 0;
        for (Double sumItem : v) {
            erg += sumItem;
        }
        return erg;
    }
    @Override
    public double getMinimum() {
        return 0;
    }

    @Override
    public double getMaximum() {
        return 0;
    }

    @Override
    public void add(double value) {
        v.add(value);
    }

}

