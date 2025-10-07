package oo.heranca.DesafioProfessor;

public interface Luxo {

    void ligarMassagem();
    void desligarMassagem();
    default int nivelDaMassagem(){
        return 1;
    }

}
