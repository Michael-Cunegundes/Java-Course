package controle.estruturas;

public class DesafioFor {

    public static void main(String[] args) {

//      desafio consiste em imprimir isso no console usando for:
//      #
//      ##
//      ###
//      ####
//      #####

        for(String valor = "#"; !valor.equals("######"); valor+= "#") {
            System.out.println(valor);

        }

    }

}
