
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
       //Modulo
        Modulo modulo6 = new Modulo();
        modulo6.setNombre("M06");
        modulo6.setCodigo(1234);
        List<Modulo> listModulo = new ArrayList<Modulo>();
        listModulo.add(modulo6);
        session.save(modulo6);


        //Alumno
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Pablo Pantalones Cuadrados");
        alumno1.setSexo("Masculino");
        alumno1.setEdad(15);
        alumno1.setNacionalidad("Español");
        alumno1.setModulos(listModulo);
        session.save(alumno1);


        //Profesor
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Patricio Cinco Puntas");
        profesor1.setSexo("Masculino");
        session.save(profesor1);

        //Imprimimos el Alumno en un fichero
        FicheroObj.fileOutputStream(profesor1,"Alumno_1");

        tx.commit();
        session.close();
        sessionFactory.close();
    }



}
