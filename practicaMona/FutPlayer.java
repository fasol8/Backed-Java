package practicaMona;

public class FutPlayer extends Mona{

    FutPlayer(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void display(){
        tackle();
        throwBall();
        runBall();
        System.out.println("-------------------------------------------------");
    }

    public void tackle(){
        System.out.println("Octocat taclea al rival");
    }

    public void throwBall(){
        System.out.println("Octocat lanza el balón");
    }

    public void runBall(){
        System.out.println("Octocat corre con el balón");
    }
}