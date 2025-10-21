package oo.abstrato;

public class Cachorro extends Mamifero {

    @Override
    public String mamar() {
        return "Mamando leite";
    }

    // Pode sobrescrever mover, mas não é obrigatório
}

