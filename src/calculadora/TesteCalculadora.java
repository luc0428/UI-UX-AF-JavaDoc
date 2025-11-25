package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        /**
        *  Instancia um objeto de calculadora com o nome calc
        *  e chama o método <b>calcular</b> com calc.calcular
        *  @param a primeiro número inteiro a ser calculado
        *  @param b segundo número inteiro a ser calculado
        *  @param operador o operador númerico que sera utilizado para fazer o calculo
        *  calc.calcular é chamado quadro vezes para testar os quatro operadores +, -, * e /
        */
        System.out.println(calc.calcular(2,3,"+"));
        System.out.println(calc.calcular( 10,4,"-"));
        System.out.println(calc.calcular( 3,5,"*"));
        System.out.println(calc.calcular( 8,2,"/"));

        /**
         * try onde tenta fazer uma divização por 0 para testar a exceção
         * onde estamos esperando o catch @return de Divisão por zero não é permitida.
         */
        try {
            System.out.println(calc.calcular(8,0,"/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
        * try onde tenta fazer um calculo com um operador não existente para testar a exceção
        * onde estamos esperando o catch @return de Divisão por zero não é permitida.
        */
        try {
            System.out.println(calc.calcular(5,5,"x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
