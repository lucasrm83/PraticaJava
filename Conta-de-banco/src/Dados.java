public class Dados {
    public int numConta;
    public String usuario;
    public double conta;

    public Dados(int numConta, String usuario, double conta) {
        this.numConta = numConta;
        this.usuario = usuario;
        deposito(conta);

    }
    public Dados(int numConta, String usuario) {
        this.numConta = numConta;
        this.usuario = usuario;
    }


    public void deposito(double conta){
        this.conta += conta;

    }

    public void saque (double conta){
        this.conta -=conta+ 5.0;
    }




    public int getNumConta() {
        return numConta;
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

    @Override
    public String toString() {
        return "Dados: " +
                "Numero da conta: " + numConta +
                ", usuario: " + usuario +
                ", Conta: " + conta;
    }
}
