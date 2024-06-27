package Fundamentos;

public class manipulacaoDeTexto {
    public static void main(String[] args) {
        
        String s = "Bom dia X";//Texto a ser manipulado
            s= s.replace("X", "Senhora");//substitui um caracter por outro
            s= s.toUpperCase();//coloca as letras maiúsculas
            s= s.concat("!!!");//Concatena algo ao final da string
        System.out.println(s);

        String x = "Léo".toUpperCase();
        System.out.println(x);

        //OUTRO MODO DE ALTERAR O TEXTO
        String y = "Bom dia X"//Texto a ser manipulado
                .replace("X", "Gui")            
                .toUpperCase()
                .concat("!!!");



    }

}
