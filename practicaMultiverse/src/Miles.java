public class Miles extends Spiderman implements MilesActionCallbacks {
    public Miles(String nombre, String alias, String universo, String ocupacion, String identidad, String genero, String ciudadania) {
        super(nombre, alias, universo, ocupacion, identidad, genero, ciudadania);
    }

    @Override
    public void jump(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderJump.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void kick(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderKick.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hit(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderHit.gif");
        s.setBounds(200,100,1100,900);
    }
}
