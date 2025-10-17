public class DespesaParcelada extends Despesa {
    private int totalParcelas;
    private int parcelasPagas;

    public DespesaParcelada(String descricao, double valor, String dataVencimento, String tipoDespesa,
            int totalParcelas) {

        super(descricao, valor, dataVencimento, tipoDespesa);

        this.totalParcelas = totalParcelas;
        this.parcelasPagas = 0; // GARANTE A INICIALIZAÇÃO COM 0 PARCELAS PAGAS
    }

    // GETTERS E SETTERS
    public int getTotalParcelas() {
        return totalParcelas;
    }

    public void setTotalParcelas(int totalParcelas) {
        this.totalParcelas = totalParcelas;
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(int parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

}
