package oo.encapsulamento.CasaB;

import oo.encapsulamento.CasaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {

//        System.out.println(sogra.segredo); // ERRO: private
//        System.out.println(sogra.facoDentroDeCasa); // ERRO: package
//        System.out.println(sogra.formaDeFalar); // ERRO: protected e sem herança
        System.out.println(sogra.todosSabem); // Ok: público

    }
}

