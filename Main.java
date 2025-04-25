import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resp, potencia, num_cnh, aux;
        String tipo, nome;
        Scanner scan = new Scanner(System.in);
        Carro carro = AdicionarCarro();
        
        System.out.println("Vc deseja alterar alguma informacao do Carro (1 sim / 2 nao)");
        aux = scan.nextInt();
        scan.nextLine();

        if(aux == 1){
            System.out.println("1. Motor");
            System.out.println("2. Condutor");
            resp = scan.nextInt();
            scan.nextLine();

            if (resp == 1){

                System.out.println("Digite o novo motor");
                System.out.println("Tipo:");
                tipo = scan.nextLine();

                System.out.println("Potencia:");
                potencia = scan.nextInt();
                scan.nextLine();
                
                Motor motor = new Motor(tipo, potencia);
                carro.setMotor(motor);
            }
            else if(resp == 2){
                System.out.println("Digite o novo condutor");
                System.out.println("Nome:");
                nome = scan.nextLine();

                System.out.println("CNH:");
                num_cnh = scan.nextInt();
                scan.nextLine();
                
                Condutor condutor = new Condutor(nome, num_cnh);
                carro.setCondutor(condutor);
            }
        }
        System.out.println(carro);
        InformacoesCarro(carro);
        scan.close();
    }

    public static Carro AdicionarCarro(){
        Scanner scan = new Scanner(System.in);
        String marca, placa, modelo, tipo;
        int potencia, aux;

        System.out.println("Adicionando Carro!!!");
        
        do{
            System.out.println("Este carro possui condutor (1 sim / 2 nao)");
            aux = scan.nextInt();
            scan.nextLine();
        }while(aux < 1 || aux > 2);

        
        System.out.println("Adicionando Motor");
        System.out.println("Digite o tipo do motor");
        tipo = scan.nextLine();
        
        System.out.println("Digite a potencia do motor");
        potencia = scan.nextInt();
        scan.nextLine();

        Motor motor = new Motor(tipo, potencia);
        
        System.out.println("Digite qual eh a marca do carro");
        marca = scan.nextLine();

        System.out.println("Digite qual eh a placa do carro");
        placa = scan.nextLine();
        
        System.out.println("Digite qual eh a modelo do carro");
        modelo = scan.nextLine();

        if (aux == 1){
            String nome;
            int Num_Cnh;
        
            System.out.println("Adicionando Condutor");
            System.out.println("Digite qual eh o nome do condutor");
            nome = scan.nextLine();
        
            System.out.println("Digite o numero da cnh do condutor");
            Num_Cnh = scan.nextInt();
            scan.nextLine();
        
            Condutor condutor = new Condutor(nome, Num_Cnh);
            Carro carro = new Carro(marca, modelo, placa, motor, condutor);
            return carro;
        }
        else{
            Carro carro = new Carro(marca, modelo, placa, motor);
            return carro;
        }
    }

    public static void InformacoesCarro(Carro carro){
        carro.toString();
    }
}