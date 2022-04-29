package practicaMona;

public class Electro extends Mona{
    public Electro(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void display(){
        connectCable();
        repair();
        installDiablito();
        System.out.println("-------------------------------------------------");
    }

    public void connectCable(){
        System.out.println("Octocat va a conectar los cables");
    }

    public void repair(){
        System.out.println("Octocat repara la instalaci'on de luz");
    }

    public void installDiablito(){
        System.out.println("Octocat instala un diablito");
    }
}
