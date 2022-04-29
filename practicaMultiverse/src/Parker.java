public class Parker extends Spiderman implements ParkerActionCallbacks {
    public Parker(String nombre, String alias, String universo, String ocupacion, String identidad, String genero, String ciudadania) {
        super(nombre, alias, universo, ocupacion, identidad, genero, ciudadania);
    }

    @Override
    public void reverse(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderReverse.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void web(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderWeb.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void sexy(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.showImage("spiderSexy.gif");
        s.setBounds(200,100,1100,900);
    }
}
