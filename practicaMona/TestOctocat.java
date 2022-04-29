package practicaMona;

public class TestOctocat {
    public static void main(String[] args) {
        TestFutPlayer();
        TestFire();
        TestLuchador();
        TestHeisen();
        TestLink();
        TestElectro();
    }

    public static void TestFutPlayer(){
        FutPlayer fut1= new FutPlayer(93,"goretocat","Jugador de futball Americano de los 49's de San Franciso",
                "Balón y casco de los 49's de San Franciso");

        System.out.println(fut1.showMessage());
        fut1.display();
    }

    public static void TestFire(){
        Firefighter fire1 = new Firefighter(141,"Sentrytocat","Es un bombero",
                "Mangera y equipo de protección contra fuego");

        System.out.println(fire1.showMessage());
        fire1.display();
    }

    public static void TestLuchador(){
        Luchador lucha1=new Luchador(113,"Luchadortocat","Es un luchador","Mascara");

        System.out.println(lucha1.showMessage());
        lucha1.displey();
    }

    public static void TestHeisen(){
        Heisenberg heisen1 = new Heisenberg(76,"Heisencat","Es Heisenberg de la serie de Breaking Bad",
                "Tiene una mascar de gas y un martillo");

        System.out.println(heisen1.showMessage());
        heisen1.display();
    }

    public static void TestLink(){
        Link link1 = new Link(59,"Linktocat","Es link del juego de zelda",
                "La espada maestra y el escudo");

        System.out.println(link1.showMessage());
        link1.display();
    }

    public static void TestRiddle(){
        Riddler rid1 = new Riddler(50,"Riddlocat","Es el acertijo el enemigo de batman",
                "Tiene el baston y sombrero con un signo de interrogacioón ambos");

        System.out.println(rid1.showMessage());
        rid1.display();
    }

    public static void TestElectro(){
        Electro ele1 = new Electro(71,"Electrocat","Es un electricista",
                "Tiene un traje azul un cable");

        System.out.println(ele1.showMessage());
        ele1.display();
    }
}
