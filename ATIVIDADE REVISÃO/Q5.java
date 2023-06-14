package br.ifsertaope.cs.av.revisao;

/**
 *
 * @author Aluno
 */
public class fatura {
    public String numero;
    public String descricao;
    public int qtd_item;
    public double preco_item;
    public fatura (){
}
    public double getTotalfatura(double result){
        result = this.preco_item * this.qtd_item;
        return result;
}
}
