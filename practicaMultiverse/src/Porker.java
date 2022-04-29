public class Porker extends Spiderman implements PorkerActionCallbacks {
    public Porker(String nombre, String alias, String universo, String ocupacion, String identidad, String genero, String ciudadania) {
        super(nombre, alias, universo, ocupacion, identidad, genero, ciudadania);
    }

    @Override
    public void introduce(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderHand.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hammerBlow(Screen s) {
//        s.cls();
//        s.repaint();
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderHammer.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void saygoodbye(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderPorky.gif");
        s.setBounds(200,100,1100,900);
    }
}
