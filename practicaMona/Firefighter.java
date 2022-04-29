package practicaMona;

public class Firefighter extends Mona{

    public Firefighter(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void display(){
        safeCat();
        putOutFire();
        removeItem();
        System.out.println("-------------------------------------------------");
    }

    public void safeCat(){
        System.out.println("Octocat va a rescatar el gato");
    }

    public void putOutFire(){
        System.out.println("Octocat va apagar el incendio");
    }

    public void removeItem(){
        System.out.println("Octocat va a quitar ek elemento peligroso del camino");
    }
}
