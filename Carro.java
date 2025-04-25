public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }

    public Carro(String marca, String modelo, String placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }

    public String toString() {
        String info = "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Placa: " + placa + "\n"
                + "Motor: " + motor.toString();

        if (condutor != null) {
            info += "\nCondutor: " + condutor.toString();
        } else {
            info += "\nCondutor: Nenhum condutor atribuído.";
        }

        return info;
    }
}