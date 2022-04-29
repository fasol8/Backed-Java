public class Comic {
    public static void main(String[] args) throws InterruptedException{
        TestComic();
    }

    public static void TestComic() throws InterruptedException{
        Screen s = new Screen();
        item49 i49 = new item49(49,"Euclid","Sector-02, site19",
                "Es un ente humanoide de unos 1.9 metros de estatura, que tiene la apariencia de un doctor de la plaga medieval");

        Runnable hisotry49 = new Runnable() {
            @Override
            public void run() {
                try {
                    i49.introduccion(s);
                    Thread.sleep(4000);
                    i49.presentarFundacion(s);
                    Thread.sleep(8000);
                    i49.presentarItem(s);
                    Thread.sleep(9000);
                    i49.presentarClaseObjeto(s);
                    Thread.sleep(6000);
                    i49.presentarContencion(s);
                    Thread.sleep(6000);
                    i49.describiritem(s);
                    Thread.sleep(9000);
                    i49.relatarDescubrimiento(s);
                    Thread.sleep(8000);
                    i49.Hablar(s);
                    Thread.sleep(6000);
                    i49.mostrarActitudCordial(s);
                    Thread.sleep(6000);
                    i49.mostrarComportamientoAgresivo(s);
                    Thread.sleep(6000);
                    i49.Matar(s);
                    Thread.sleep(6000);
                    i49.hacerOperacion(s);
                    Thread.sleep(15000);
                    i49.cooperar(s);
                    Thread.sleep(6000);
                    i49.gracias(s);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread pruebaI49 = new Thread(hisotry49);
        pruebaI49.start();
    }
}
