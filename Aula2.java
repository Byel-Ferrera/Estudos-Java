public class Aula2 {
    public static void main(String[] args) {
        
        // aqui já vou corrigi o que errei no outro, que é das Naming Conventions

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        Float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
    

        // Operadores de atribuição = += -= /= *= %=
/* 
        double bonus = 1800;
        bonus = bonus + 1000;
*/
        //Usando os operadores

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        



















        }
    }