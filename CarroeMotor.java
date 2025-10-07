package oo;

public class CarroeMotor {

    // Motor
    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 1000);
        }
    }

    void acelerar (){
        fatorInjecao += 0.5;
    }

    void freiar (){
        fatorInjecao -= 0.5;
    }

    // Carro
    public static void main(String[] args) {

        CarroeMotor fusca = new CarroeMotor();

        fusca.ligado = true;

        System.out.println(fusca.giros());

        fusca.acelerar();

        System.out.println(fusca.giros());

        fusca.freiar();

        System.out.println(fusca.giros());
    }
}
