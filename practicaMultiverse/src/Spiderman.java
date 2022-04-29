public class Spiderman {
    private String nombre;
    private String alias;
    private String universo;
    private String ocupacion;
    private String identidad;
    private String genero;
    private String ciudadania;

    public Spiderman(String nombre, String alias, String universo, String ocupacion, String identidad, String genero, String ciudadania){
        this.nombre=nombre;
        this.alias=alias;
        this.universo=universo;
        this.ocupacion=ocupacion;
        this.identidad=identidad;
        this.genero=genero;
        this.ciudadania=ciudadania;
    }

    public String getNombre() { return nombre; }
    public String getAlias() { return alias; }
    public String getUniverso() { return universo; }
    public String getOcupacion() { return ocupacion; }
    public String getIdentidad() { return identidad; }
    public String getGenero() { return genero; }
    public String getCiudadania() { return ciudadania; }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else {
            return false;
        }
    }

    public boolean setAlias(String alias){
        if (!alias.isEmpty()){
            this.alias=alias;
            return true;
        }else {
            return false;
        }
    }

    public boolean setUniverso(String universo){
        if (!universo.isEmpty()){
            this.universo=universo;
            return true;
        }else {
            return false;
        }
    }

    public boolean setOcupacion(String ocupacion){
        if (!ocupacion.isEmpty()){
            this.ocupacion=ocupacion;
            return true;
        }else {
            return false;
        }
    }

    public boolean setIdentidad(String identidad){
        if (!identidad.isEmpty()){
            this.identidad=identidad;
            return true;
        }else {
            return false;
        }
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else {
            return false;
        }
    }

    public boolean setCiudadania(String ciudadania){
        if (!ciudadania.isEmpty()){
            this.ciudadania=ciudadania;
            return true;
        }else {
            return false;
        }
    }

    public String showMessage(){
        return "\nnombre: "+nombre+"\nalias: "+alias+"\nuniverso: "+universo+"\nocupacion: "+ocupacion+"\nidentidad: "+identidad+"\ngenero:"+genero+"\nciudadania: "+ciudadania+"\n";
    }
}