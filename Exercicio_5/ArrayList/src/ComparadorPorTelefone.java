import java.util.Comparator;

public class ComparadorPorTelefone implements Comparator<Contato> {
    @Override
    public int compare(Contato c1, Contato c2) {
        return c1.getTelefone().compareTo(c2.getTelefone());
    }
}