public abstract class Conta {
    private String titular;
    private String saldo;
    private String deposito;
    private String transferencia;
    private String saque;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public String getSaque() {
        return saque;
    }
    
    public void setSaque(String saque) {
        this.saque = saque;
    }

}

//principal manipular todos, contas métodos
//herda ou porfismo
//saldo deposito transfinome
//conta abstrata, titular mesmo pra conta corrente, saldo,abrir conta, o que fazer depois dentro da conta
//extrato?