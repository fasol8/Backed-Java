public class item49 extends SCP implements item49ActionCallbacks{

    public item49(int num, String claseObjeto, String contencion, String descripcion) {
        super(num, claseObjeto, contencion, descripcion);
    }

    @Override
    public void introduccion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Esta hitoria esta inspirada en scp, donde veremos un caso\n","Helvetica",24,Colors.Grisaille);
        s.out("La Fundación SCP es una organización ficticia dedicada a la investigación de fenómenos paranormales. Pertenece al universo de ficción colaborativa registrado en el sitio web homónimo.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("scp.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void presentarFundacion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("SCP\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP es una organización secreta con el objetivo de contener y estudiar individuos, entidades, lugares, objetos y fenómenos anómalos que desafían la ley natural (denominados como \"objetos SCP\" o coloquialmente como \"SCP\").\n","Helvetica",24,Colors.Grisaille);
        s.out("Ahora veremos un caso...\n","Helvetica",24,Colors.Grisaille);
        s.showImage("scp.jpeg");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void presentarItem(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",24,Colors.Grisaille);
        s.showImage("49.png");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void presentarClaseObjeto(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Clase del objeto\n\n","Helvetica",34,Colors.Grisaille);
        s.out("Un resumen del sistema estándar de clasificación de anomalías y lo que cada designación significa sobre su respectiva anomalía.\n","Helvetica",24,Colors.Grisaille);
        s.out("Los Objetos Clase-Euclid son anomalías que no son lo suficientemente entendidas o inherentemente predecibles como para que la contención fiable no sea confiable o posible, pero no suponen una amenaza tan grande\n","Helvetica",24,Colors.Grisaille);
    }

    @Override
    public void presentarContencion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Contención\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 está contenido dentro de una Celda Estándar de Contención Segura para Humanoides en el Sector-02 de Investigación del Sitio-19.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_conten.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void describiritem(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Descrirpción\n\n","Helvetica",34,Colors.Grisaille);
        s.out("Si bien SCP-049 parece llevar los ropajes gruesos y la máscara de cerámica propias de esa profesión, sus prendas parecen haber crecido a partir del cuerpo de SCP-049 a lo largo del tiempo, y es casi indiscernible de la forma que pueda haber bajo ellas. Los rayos X indican que, a pesar de esto, SCP-049 tiene una estructura esquelética humanoide bajo su capa exterior.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49esqueleto.jpeg");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void relatarDescubrimiento(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("SCP\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 fue descubierto durante la investigación de una serie de desapariciones desconocidas en la ciudad de Montauban, en el sur de Francia.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("Montauban.jpeg");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void Hablar(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Idiomas\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 es capaz de hablar en varios idiomas, si bien prefiere el inglés o el francés medieval.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_speak.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void mostrarActitudCordial(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Coordial\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 tiende a cooperar con la mayoría del personal de la Fundación, se responderá con violencia a arrebatos o cambios conductuales súbitos.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_cordial.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void mostrarComportamientoAgresivo(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Agresivo\n\n","Helvetica",34,Colors.Grisaille);
        s.out("Aunque SCP-049 es cordial y coopera con el personal de la Fundación por regla general, puede irritarse notablemente o volverse agresivo en ocasiones en las que siente que se halla en presencia de lo que llama la \"Pestilencia\".\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_agresive.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void Matar(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Muerte\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 tratará de matar a cualesquiera de estos individuos; SCP-049 es capaz de provocar el final de todas las funciones biológicas de un organismo mediante el contacto cutáneo directo.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_kill.jpeg");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void hacerOperacion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Operación\n\n","Helvetica",34,Colors.Grisaille);
        s.out("SCP-049 ha expresado frustración o remordimientos tras estas muertes, indicando que habían hecho poco para matar a \"La Pestilencia\", aunque tratará de realizar una intervención quirúrgica tosca en el cadáver mediante las herramientas contenidas en una bolsa negra de doctor que siempre lleva consigo. " +
                "Si bien estas intervenciones no son siempre \"exitosas\", suelen resultar en la creación de casos de SCP-049-2.\n" +
                "\n" +
                "Los casos de SCP-049-2 son cadáveres reanimados en los que SCP-049 ha operado. Estos casos no parecen retener recuerdos ni funciones cognitivas, demostrando tan sólo aptitudes motrices básicas y mecanismos de respuesta.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_surgery.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void cooperar(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Coopera\n\n","Helvetica",34,Colors.Grisaille);
        s.out("Para facilitar la contención de SCP-049, el ente recibirá el cadáver de un animal recientemente fallecido (típicamente, un bovino u otro gran mamífero) una vez cada dos semanas para su estudio.\n","Helvetica",24,Colors.Grisaille);
        s.showImage("49_coopera.gif");
        s.setBounds(200,100,1100,900 );
    }

    @Override
    public void gracias(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("Gracias por su atenci'on\n\n","Helvetica",34,Colors.Grisaille);
        s.out("Esta historia esta basada en \n","Helvetica",24,Colors.Grisaille);
        s.out("http://scp-es.com/scp-049\n","Helvetica",18,Colors.BLUE);
    }
}

