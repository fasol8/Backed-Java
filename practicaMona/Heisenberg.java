package practicaMona;

public class Heisenberg extends Mona{
    public Heisenberg(int id, String nombre, String identidad, String accesorio) {
        super(id, nombre, identidad, accesorio);
    }

    public void display(){
        makeDrug();
        teachingChemistry();
        teachingJesse();
        System.out.println("-------------------------------------------------");
    }

    public void makeDrug(){
        System.out.println("Octocat esta haciendo droga");
    }

    public void teachingChemistry(){
        System.out.println("Octocat esta dando clase de química");
    }

    public void teachingJesse(){
        System.out.println("Octocat le esta enseñando a octoJesse hacer droga");
    }
}
