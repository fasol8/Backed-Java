package practicaMona;

public class Link extends Mona{
    public Link(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void display(){
        playingOcarina();
        flying();
        attack();
        System.out.println("-------------------------------------------------");
    }

    public void attack(){
        System.out.println("Octocat ataca al enemigo");
    }

    public void flying(){
        System.out.println("Octocat esta planeando por hyrule");
    }

    public void playingOcarina(){
        System.out.println("Octocat esta tocando Ocarina");
    }
}
