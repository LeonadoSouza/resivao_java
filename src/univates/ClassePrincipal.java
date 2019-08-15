package univates;

import java.util.Random;

/*
   autor: Jonas Dhein
 */
public class ClassePrincipal {

    //método de inicialização da classe
    public static void main(String[] args) {
        //        //instância um objeto da classe Random usando o construtor básico
        ////Exige importação da classe java.util.Random
        //           Random gerador = new Random();
        //
        //        //imprime sequência de 10 números inteiros aleatórios entre 1 e 5
        //        for (int i = 0; i < 10; i++) {
        //            System.out.println(gerador.nextInt(5) + 1);
        //        }

        //       
        //        
        //        
        //        System.out.println(pessoa1);
        //        
        //        System.out.println(pessoa2);
        //        
        //        System.out.println("Olá Mundo");
        //        int resultado = Funcoes.somarNumeros(1, 2);
        //        System.out.println("Resultado = " + resultado);
        //        
        //        //criamos uma instância de Funcoes
        //        Funcoes func = new Funcoes();
        //        resultado = func.subtrairNumeros(4, 1);
        //        System.out.println("Resultado = " + resultado);
        //        
        //        imprimirMensagem("TESTE 1");
        //        imprimirMensagem("TESTE 2");
        //        imprimirMensagem("TESTE 3");
        //        
        //        for(int i = 0; i <10; i++){
        //            System.out.println("valor de i = " + i);
        //        }
        //        
        //        int x = 15;
        //        while( x < 18 ){
        //            System.out.println("Sem permissão!!!");
        //            x++;
        //        }
        //        
        //        int[] numeros = {1,2,3};
        //        System.out.println("ENCHANCED FOR");
        //        for(int var : numeros){
        //            System.out.println(var); 
        //       }
        //         
        //       System.out.println("FOR COMUM");
        //        for(int var = 0; var < numeros.length; var++){
        //            System.out.println(numeros[var]);
        //        }
        //        
        //        int[] numeros_array = {2,2,1};
        //        int res_soma = Funcoes.somarNumeros(numeros_array);
        //        System.out.println("RESULTADO DA SOMA = " + res_soma);
        //        
        //        int res_mul = Funcoes.multiplicaNumeros(numeros_array);
        //        System.out.println("RESULTADO DA MULTIPLICAÇÃO = " + res_mul);
        //        
        //        double res_div = Funcoes.divideNumeros(numeros_array);
        //        System.out.println("RESULTADO DA DIVISAO = " + res_div);
        //        
        //        int res_sub = Funcoes.subtraiNumeros(numeros_array);
        //        System.out.println("RESULTADO DA SUBTRACAO = " + res_sub);
        //        
        //        System.out.println();//linha em branco
        //        System.out.println();//linha em branco
        //        System.out.println();//linha em branco
        //        String sorteio = Funcoes.sortearNumeros(6, 60);
        //        System.out.println("SORTEIO = " + sorteio);
        /*definir um valorConta para cada pessoa.
        criar um método dentro da classe pessoa que diminui e um que aumentao valor da conta
        ex: transferir parte de valor de uma conta para outra
        ao final, imprimir o saldo das duas contas
        PLUS: validar se a pessoa tem saldo para essa transferencia.
         */
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.setCodigo(1);
        pessoa1.setNome("joão");
        pessoa1.setEndereco("Lajeado");
        pessoa1.setTelefone("190");
        pessoa1.setValorConta(500);
        pessoa1.setChequeEspecial(200);

        pessoa2.setCodigo(2);
        pessoa2.setNome("Mario");
        pessoa2.setEndereco("Taquari");
        pessoa2.setTelefone("181");
        pessoa2.setValorConta(1000);
        pessoa2.setChequeEspecial(100);
                
        System.out.println("Saldo Inicial:");
        System.out.println(pessoa1);
        System.out.println("-------------------");
        System.out.println(pessoa2);
        System.out.println("-------------------");
        
        double valorTransferencia = 701;
        System.out.println("Valor da Transferência: R$ " + valorTransferencia);
        
        if(pessoa1.credito(valorTransferencia) == true){
            pessoa2.debito(valorTransferencia);
        }
        
        System.out.println("Saldo Final:");
        System.out.println(pessoa1);
        System.out.println("-------------------");
        System.out.println(pessoa2);
        System.out.println("-------------------");
        
//    }
//    
//    public static void imprimirMensagem(String par1){
//        System.out.println(par1);
    }

}
