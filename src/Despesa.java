public abstract  class Despesa {
    // ATRIBUTOS ENCAPSULASDOS
    private String descricao;
    private double valor;
    private String dataVencimento;
    private String tipoDespesa;
    private boolean pago;

    // CONSTRUTOR EXIGE QUE O ÚSUARIO PASSE OS DADOS PARA INSTANCIAR 
    public Despesa(String descricao, double valor, String dataVencimento, String tipoDespesa) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.tipoDespesa = tipoDespesa;
        this.pago = false; // PADRONIZAR COMO FALSE PARA DESPESAS NOVAS
    }

    // GETTERS E SETTERS 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}


