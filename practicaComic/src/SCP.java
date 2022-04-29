public class SCP {
    private int num;
    private String claseObjeto;
    private String contencion;
    private String descripcion;

    public SCP(int num, String claseObjeto, String contencion, String descripcion) {
        this.num = num;
        this.claseObjeto = claseObjeto;
        this.contencion = contencion;
        this.descripcion = descripcion;
    }

    public int getNum() {
        return num;
    }

    public String getClaseObjeto(){
        return claseObjeto;
    }

    public String getContencion(){
        return contencion;
    }

    public String getDescripcion(){
        return  descripcion;
    }

    public boolean setNum(){
        if (num>0){
            this.num=num;
            return true;
        }else {
            return false;
        }
    }

    public boolean setClaseObjeto(){
        if (!claseObjeto.isEmpty()){
            this.claseObjeto=claseObjeto;
            return true;
        }else {
            return false;
        }
    }

    public boolean setContencion(){
        if (!contencion.isEmpty()){
            this.contencion=contencion;
            return true;
        }else {
            return false;
        }
    }

    public boolean setDescripcion(){
        if (!descripcion.isEmpty()){
            this.descripcion=descripcion;
            return true;
        }else {
            return false;
        }
    }

    public String showMessage(){
        return "\nnum: "+num+"\nClase de Objeto: "+claseObjeto+"\nEsta contenido: "+contencion+"\nDescripción: "+descripcion+"\n";
    }
}