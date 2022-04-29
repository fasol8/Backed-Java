package practicaMona;

public class Mona {
    private int id;
    private String nombre;
    private String identidad;
    private String accesorio;

    public Mona(int id, String nombre, String identidad, String accesorio){
        this.id=id;
        this.nombre=nombre;
        this.identidad=identidad;
        this.accesorio=accesorio;
    }

    public int getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getIdentidad(){ return identidad; }
    public  String getAccesorio(){ return accesorio; }

    public boolean setID( int id){
        if (id>0){
            this.id=id;
            return true;
        }else {
            return false;
        }
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
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

    public boolean setAccesorio(String accesorio){
        if (!accesorio.isEmpty()){
            this.accesorio=accesorio;
            return true;
        }else {
            return false;
        }
    }

    public String showMessage(){
        return "id: "+id+"\nnombre: "+nombre+"\nidentidad: "+identidad+"\naccesorio: "+accesorio;
    }
}
