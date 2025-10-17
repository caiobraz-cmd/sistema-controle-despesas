public class DespesaAvista extends Despesa {
    public DespesaAvista(String descricao, double valor, String dataVencimento, String tipoDespesa) {
        // O SUPER CHAMA O CONTRUTOR DA CLASSE MÃE
        super(descricao, valor, dataVencimento, tipoDespesa);
    }
    
}
