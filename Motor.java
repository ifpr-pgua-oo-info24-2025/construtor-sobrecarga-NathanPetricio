public class Motor {
    private String tipo;
    private int potencia;
    
    public void setPotencia(int potencia) {
    this.potencia = potencia;
    }
    
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
    
    public int getPotencia() {
    return potencia;
    }
    
    public String getTipo() {
    return tipo;
    }

    public Motor( String tipo, int potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String toString(){
        return "Motor:" + tipo + "\tPotencia:" + potencia;
    }
}
