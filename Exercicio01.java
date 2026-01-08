public class Exercicio01{
    public static void main(String[] args) {
      
      //1ª PARTE
     
      System.out.println("Hello, World!");

      //Só pra não dar azar, mas eu já sabia fazer esse.

     
     
      //2ª PARTE
     
     
      /*Exercício aula 14 do DevDojo playlist do Maratona Java
      
        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
          Eu <nome>, morando no endereço <endereço>, confirmo que recebi um salário de R$ <salário>, na data <data>.
          
          Campos:
          nome - String
          endereço - String
          salário - double
          data - String

      */
        String name = "Gabryel";
        String local = "Maranhão";
        Double wage = 2500.00;
        String data = "05/03/2026";
        
        System.out.println("Eu "+name+", morando no endereço "+local+", confirmo que recebi um salário de R$ "+wage+" na data "+data+".");
    
   




      //3ª PARTE

      //Só continuando as aulas e relembrar os operadores
   
        Float n1 = 10F;
        Float n2 = 20F;
        Float result = n1/n2;
        System.out.println( result);
   
        int rest = 25 % 5;
        System.out.println(rest);
        
        
        // Esqueci as outras datas


        /*4ª PARTE                  DIA 06/03/2026
        
        -> Operadores lógicos (aulas novas)
         Aula 15 - 17 (DevDojo - Maratona Java)
        */

        boolean isdezmaiorquevinte = 10 > 20;
        boolean isdezmenorquevinte = 10 < 20;
        boolean isdezigualvinte = 10 == 20;
        boolean isdezigualdez = 10 == 10;
        boolean isdezdiferentededez = 10 != 10;
        System.out.println("isdezmaiorquevinte " + isdezmaiorquevinte); 
        System.out.println("isdezmenorquevinte " + isdezmenorquevinte);
        System.out.println("isdezigualvinte " + isdezigualvinte);
        System.out.println("isdezigualdez " + isdezigualdez);
        System.out.println("isdezdiferentededez " + isdezdiferentededez);
   
  

        // && (AND) || (OR) ! (NOT)


        int idade = 29;
        Float salario = 3500F;
        boolean isdentrodaleimaiorquetrinta = idade >= 30 && salario >= 4612;
        boolean isdentrodaleimenorquetrinta = idade < 30 && salario >= 3381;
        System.out.println("isdentrodaleimaiorquetrinta " + isdentrodaleimaiorquetrinta);
        System.out.println("isdentrodaleimenorquetrinta " + isdentrodaleimenorquetrinta);
   
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}