package jogorpg;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Menu.menu();

        Object[] arrayArmas = { new Armas(0,"Espada",150,1),
                                new Armas(1,"Lança",115,2),
                                new Armas(2,"Bastão",90,1),    
                              };
                              

     //   Jogador jogadorUm = new Jogador("Vinicius",100,100,100);

        //System.out.println(jogadorUm.toString());
        
        System.out.println(arrayArmas[1]);

        
    }
}
