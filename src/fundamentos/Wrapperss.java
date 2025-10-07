package fundamentos;

public class Wrapperss {

    public static void main(String[] args) {

        byte Byte = 127; //-128 a 127
        short Short = - 3_2768; // -32.768 a 32.767
        int Int = 2_147_483_647; //-2.147.483.648 a 2.147.483.647
        long Long = 9_223372_18; // -2^{63} a 2^{63} -1

        float Float = 11_445.44F;
        double Double = 2_991_797_103.01;

        boolean Boolean = true; //true or false

        char Char = 'A'; // apenas um caracter

        System.out.printf("\nbyte: %d     Pode receber valor entre -128 a 127\nshort: %d     Pode receber valores de -32.768 a 32.767" +
                "\nint: %d     Pode receber valores de -2.147.483.648 a 2.147.483.647\nlong: %d     pode receber valores de -2^{63} a 2^{63} -1\n" +
                "float: é um tipo de dado primitivo que representa números de ponto flutuante de precisão simples.\n" +
                "double: é comumente usado em situações que exigem um grande intervalo de valores ou um alto grau de precisão, como cálculos científicos," +
                " aplicativos financeiros e cálculos matemáticos complexos.", Byte, Short, Int,Long );


        System.out.println("\n\nWrappers sao a versao objetos dos tipos primitivos! ");

        Byte  Bytewrapper = 10;
        Short  Shortwrapper = 10;
        Integer Intwrapper = 10;
        Long Longwrapper = 10L;

        Float FloatWrapper = 10.0F;
        Double Doublewrapper = 10.0;

        Boolean  BooleanWrapper = false;

        Character  CharWrapper = 'Z';

        String explica = "Existem para cada versao do tipo primitivo uma versao orientada a objeto, " +
                "algumas linguagens tratam inclusive os tipos primitivos como objetos, " +
                "mas o Java tem esse distincao, temos os tipos primitivos e os wrappers que as versoes orientada a objeto de cada um dos tipos primitivos, " +
                "todos sao iguais, so muda a primeira letra de minuscula para maiuscula a unica diferenca eh no caso do int que eh Integer em vez de int e o char  passa a ser Character ";

        System.out.println(explica);







    }
}
