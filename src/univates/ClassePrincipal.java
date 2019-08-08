package univates;

public class ClassePrincipal {

    public static void main(String[] args) {
        //instaciar uma clase
        Funcoes objFuncoes = new Funcoes();
        int resultado = objFuncoes.soma(2, 3);
        System.out.println("Resultado da soma é = "+ resultado);
        int result = objFuncoes.subtracao(4, 5);
        System.out.println("Resultado da soma é = "+ result);
        
        
        //teste condicional(verdadeiro ou falso)
        String var1 = "Juca";
        String var2 = "juca";
        //equalsIgnoreCase = compara texto ignorando o caseSensitive
        if (!var1.equals(var2)) {
            System.out.println("IF");
        } else {
            System.out.println("ELSE");
        }
        // laços de repetição
        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i = " + i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println("valor de i = " + i);
            i += 1;
        }
        i = 0;
        do {
            System.out.println("valor de i = " + i);
            i++;
        } while (i < 10);
        //tipos de variaveis
        boolean n1 = false;
        int n2 = 10;
        float n3 = 5.4f;
        System.out.println(n3);
        double n4 = 5.3241524532452346234234;
        System.out.println(n4);
        String n5 = "Juca Bala";
        System.out.println(n5.trim());//remive espaços
        System.out.println(n5.trim().toUpperCase().length());
    }

    
}
