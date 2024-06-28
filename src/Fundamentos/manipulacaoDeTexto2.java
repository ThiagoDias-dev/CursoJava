package Fundamentos;

public class manipulacaoDeTexto2 {
    public static void main(String[] args) {
        String s = "Boa tarde"; //Declaramos a string a ser manipulada
        System.out.println(s.concat("!!!"));//Concatenação
        System.out.println(s + "!!!");//Outra forma de Concatenação
        System.out.println(s.startsWith("Boa"));//Começa com...
        System.out.println(s.toLowerCase().startsWith("boa"));//Tudo minúscula, começa com...
        System.out.println(s.toUpperCase().endsWith("TARDE"));//Tudo maiúscula, termina com...
        System.out.println(s.length());//Quantos caracteres tem a frase
        System.out.println(s.toLowerCase().equals("boa tarde"));//Tudo minúscula, comparando a frase
        System.out.println(s.equalsIgnoreCase("boa tarde"));//ignorando tudo e comparando a frase

        //DECLARAMOS OUTRA VARIÁVEL 
        var nome = "Thiago";
        var sobrenome = "Dias";
        var idade = 33;
        var salario = 1412.52;

        System.out.printf("O senhor %s %s, tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);
        //Forma de imprimir variável direto na saída da linha

        String frase = String.format("O senhor %s %s, tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);
        //Nesse caso, declaramos uma String com as informações e depois imprimimos

    }

}
