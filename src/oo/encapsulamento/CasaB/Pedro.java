package oo.encapsulamento.CasaB;

import oo.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        Ana mae = new Ana();

//        System.out.println(mae.segredo); // ERRO: private
//        System.out.println(mae.facoDentroDeCasa); // ERRO: default/package não é acessível fora do pacote
//        System.out.println(mae.formaDeFalar); // ERRO: protected, mas acessado via instância
        System.out.println(mae.todosSabem); // Ok: público
    }
}

