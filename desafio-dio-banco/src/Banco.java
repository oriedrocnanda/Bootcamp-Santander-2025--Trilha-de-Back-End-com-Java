import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    private List<Conta> contas = new ArrayList<>();       // Evitar o NullPointerException

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero){
        for(Conta conta : contas){
            if(conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }

    public void listarContas(){
        System.out.println(" === Contas cadastradas ===");
        for(Conta conta : contas){
            System.out.printf("Conta %d - Titular: %s%n", conta.getNumero(), conta.getCliente().getNome());
        }
    }

}
