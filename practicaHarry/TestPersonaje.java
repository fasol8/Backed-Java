package practicaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Personaje dumbledore = new Personaje(
                "Albus Dumbledore","Gryffindor","Masculino","El cuerpo de su hermana Ariana",
                "Fénix","38'1 cm, Saúco, núcleo de pelo de cola de Thestral"
        );
        Personaje snape = new Personaje(
                "Severus Snape","Slytherin","Masculino","Lord Voldemort","Cierva",
                "Madera, núcleo y longitud desconocidos"
        );
        Personaje newton = new Personaje(
                "Newton Scamander","Hufflepuff","Masculino","Tener que trabajar en una oficina ",
                "Desconocido","Madera de fresno y elementos de hueso y concha marina"
        );
        Personaje quirrell = new Personaje(
                "Quirinus Quirrell","Ravenclaw","Masculino","Desconocido","No corpóreo",
                "Aliso, 23 cm, pelo de unicornio, flexible "
        );
        Personaje bellatrix = new Personaje(
                "Bellatrix Lestrange","Slytherin","Femenino","Desconocido","Desconocido",
                "Nogal y nervio de dragón, 12 pulgadas y 3/4, Inflexible"
        );
        Personaje tonks = new Personaje(
                "Nymphadora Tonks","Hufflepuff","Femenino","c",
                "Liebre (antes de 1995) - Lobo(1995-1998)","Desconocido"
        );
        Personaje luna = new Personaje(
                "Luna Lovegood","Ravenclaw","Femenino","Desconocido","Liebre","Desconocido"
        );
        Personaje cedric = new Personaje();

        cedric.setNombre("Cedric Diggory");
        cedric.setCasa("Hufflepuff");
        cedric.setGenero("Masculino");
        cedric.setBoggart("Desconocido");
        cedric.setPatronus("Desconocido");
        cedric.setVarita("Fresno, 30.5 cm, pelo de unicornio, flexible.");

        String msg="nombre: "+cedric.getNombre();
        msg+="\ncasa: "+cedric.getCasa();
        msg+="\ngenero: "+cedric.getGenero();
        msg+="\nboggart: "+cedric.getBoggart();
        msg+="\npatronus: "+cedric.getPatronus();
        msg+="\nvarita: "+cedric.getVarita();

        System.out.println(dumbledore.showMessage());
        System.out.println(snape.showMessage());
        System.out.println(newton.showMessage());
        System.out.println(quirrell.showMessage());
        System.out.println(bellatrix.showMessage());
        System.out.println(tonks.showMessage());
        System.out.println(luna.showMessage());
        System.out.println(msg);
    }
}
