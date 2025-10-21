package oo.encapsulamento.CasaA;

public class Ana {

    private String segredo = "Como feijao com sorvete"; // Apenas a própria Ana tem acesso
    String facoDentroDeCasa = "Canto no chuveiro"; // Visível apenas dentro do mesmo pacote (default/package)
    protected String formaDeFalar = "Sotaque nordestino"; // Pode ser acessado por classes filhas
    public String todosSabem = "Sou baiana"; // Visível para todos
}
