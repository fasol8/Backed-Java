package practicaMona;

public class Riddler extends Mona{

    public Riddler(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }
    public void display(){
        observe();
        createRiddle();
        setTrap();
        System.out.println("-------------------------------------------------");
    }

    public void setTrap(){
        System.out.println("Octocat esta poniendo una trampa a batman");
    }

    public void createRiddle(){
        System.out.println("Octocat esta creando un acertijo");
    }

    public void observe(){
        System.out.println("Octocat esta observando a su proxima victima");
    }
}
