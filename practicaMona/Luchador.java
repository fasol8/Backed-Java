package practicaMona;

public class Luchador extends Mona{
    public Luchador(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void displey(){
        makePresentation();
        jump();
        performaceKey();
        System.out.println("-------------------------------------------------");
    }

    public void performaceKey(){
        System.out.println("Octocat realiza una llave a su rival");
    }

    public void jump(){
        System.out.println("Octocat salta desde la tercera cuerda");
    }

    public void makePresentation(){
        System.out.println("Octocat realiza su presentación espectacular");
    }
}