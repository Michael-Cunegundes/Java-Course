package oo.heranca.DesafioProfessor;

public class Ferrari extends Carro implements Esportivo, Luxo {


    private boolean ligarTurbo;
    private boolean ligarMassagem;
    private int nivelMassagem;

    @Override
    public void ligarMassagem() {
        ligarMassagem = true;
    }

    @Override
    public void desligarMassagem() {
        ligarMassagem = false;
    }


    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);

    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarMassagem) {
            return 35;
        } else if (ligarTurbo && ligarMassagem) {
            return 30;
        } else if (!ligarTurbo && !ligarMassagem) {
            return 20;
        }
        return 15;
    }
}

