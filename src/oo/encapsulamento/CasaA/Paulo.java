package oo.encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {

//        System.out.println(esposa.segredo); // ERRO: atributo privado
        System.out.println(esposa.facoDentroDeCasa); // Ok: está no mesmo pacote
        System.out.println(esposa.formaDeFalar); // Ok: está no mesmo pacote
        System.out.println(esposa.todosSabem); // Ok: público, qualquer um pode acessar
    }
}
