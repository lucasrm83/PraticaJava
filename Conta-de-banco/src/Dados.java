public class Dados {
    public int numConta;
    public String usuario;
    public double conta;


    public void deposito(double conta){
        this.conta += conta;

    }

    public void saque (double conta){
        this.conta -=conta;
    }

    public void iniciaConta(String sn){
        if sn.equals("s"){
            setConta(0);

        }
    }



    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }
}
