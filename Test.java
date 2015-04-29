
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Devuelve el tiempo transcurrido en segundos en mostrar por pantalla
     * los números enteros de 1 a un millon medido en minutos y segundos. 
     */
    public static int tiempoTranscurrido()
    {
        long inicio = System.currentTimeMillis() / 1000;
        for(int i=0; i<1000000; i++){
            System.out.println(i);
        }
        int tiempo = (int) (System.currentTimeMillis() / 1000) - (int) inicio;
        return tiempo;
    }
}
