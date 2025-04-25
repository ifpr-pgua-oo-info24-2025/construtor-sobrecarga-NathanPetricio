public class Condutor {
    private String nome;
    private int Num_CNH;

    public String getNome() {
        return nome;
    }

    public int getNum_CNH() {
        return Num_CNH;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNum_CNH(int num_CNH) {
        Num_CNH = num_CNH;
    }

    public String toString(){
        return "Condutor:" + nome + "\tCNH:" + Num_CNH;
    }

    public Condutor(String nome, int num_cnh){
        this.nome = nome;
        this.Num_CNH = num_cnh;
    }

}
