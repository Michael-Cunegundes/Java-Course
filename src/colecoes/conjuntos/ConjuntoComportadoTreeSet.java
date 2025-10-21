package colecoes.conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportadoTreeSet {

    public static void main(String[] args) {


//        HashSet<String> ListaAprovados = new HashSet<>();
        SortedSet<String> ListaAprovados = new TreeSet<>();

        ListaAprovados.add("Ana");
        ListaAprovados.add("Carlos");
        ListaAprovados.add("Luca");
        ListaAprovados.add("Pedro");

        System.out.println(ListaAprovados);

        for (String candidato : ListaAprovados) {
            System.out.println(candidato);

        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
