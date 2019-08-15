/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates;

/**
 *
 * @author leonardo.souza1
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorConta;
    private String campoNovo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public String getCampoNovo() {
        return campoNovo;
    }

    public void setCampoNovo(String campoNovo) {
        this.campoNovo = campoNovo;
    }
    
   public boolean credito(double valorTransferencia){
        if(valorTransferencia <= this.valorConta){
            this.valorConta -= valorTransferencia;
            System.out.println("Transferência realizada.");
            return true;
        }else{
            System.out.println("Transferência não realizada.");
            return false;
        }
    }
    
    public void debito(double valor){
        this.valorConta += valor;
    }
    
    @Override
    public String toString(){
        return ("\n nome: " + this.nome + "\n valor da conta: " + this.valorConta);  
    }
    
    
    
    
}
