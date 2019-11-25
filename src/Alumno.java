import java.io.Serializable;
import java.util.List;

public class Alumno implements Serializable {
    int id;
    String nombre;
    String Nacionalidad;
    int edad;
    String sexo;
    List modulos;

//ToString
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", modulos=" + modulos +
                '}';
    }
//GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List getModulos() {
        return modulos;
    }

    public void setModulos(List modulos) {
        this.modulos = modulos;
    }

}
