
package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{
  private String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String telefonoContacto, String Ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String correo, int edad) {
        super(Ci, nombre1, nombre2, apellido1, apellido2, direccion, correo, edad);
        this.telefonoContacto = telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                + "Telefono de contacto del cliente: "+getTelefonoContacto();
    }
  
  
    
}
