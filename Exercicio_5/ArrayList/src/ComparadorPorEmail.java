import java.util.Comparator;
public class ComparadorPorEmail implements Comparator<Contato> {
    @Override
    public int compare(Contato c1, Contato c2) {
        return c1.getEmail().compareTo(c2.getEmail());
    }
}