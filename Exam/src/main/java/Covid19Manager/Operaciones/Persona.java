package Covid19Manager.Operaciones;

public class Persona {

    int id;
    String nombre;
    int edad;
    String salud;

    String [] array = {String.valueOf(id),nombre, String.valueOf(edad), salud};


    //Nueva persona
    public Persona(int id, String nombre, int edad, String salud) {
        this.setId(this.id);
        this.setNombre(this.nombre);
        this.setNacimiento(this.edad);
        this.setSalud(this.salud);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNacimiento(int edad){
        this.edad = edad;
    }

    public void setSalud(String salud){
        this.salud = salud;
    }

    //Muestras

    int idMuestras;
    int idClinico;
    int idPersona;
    int fecha;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(idMuestras);
        sb.append(idClinico);
        sb.append(idPersona);
        sb.append(fecha);
        sb.append("");
        return sb.toString();
    }
}
