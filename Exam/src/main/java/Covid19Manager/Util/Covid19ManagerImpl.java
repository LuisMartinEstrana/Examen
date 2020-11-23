package Covid19Manager.Util;

import Covid19Manager.Operaciones.Persona;

import java.util.logging.Logger;
import java.util.List;

public class Covid19ManagerImpl extends Persona {

    private static Persona instance;
    final static Logger logger = Logger.getLogger(String.valueOf(Covid19ManagerImpl.class));
    protected List<Persona> personas;

    public Covid19ManagerImpl() {
        super(id, nombre, edad, salud);
    }

    public static Covid19Manager getInstance(){
        if (instance == null) instance = new Covid19ManagerImpl();
        return (Covid19Manager) instance;
    }

    @Override
    public Persona addPersona(int id, String nombre, int edad, String salud){
        return this.addPersona(new Persona(id, nombre, edad, salud));
    }



}
