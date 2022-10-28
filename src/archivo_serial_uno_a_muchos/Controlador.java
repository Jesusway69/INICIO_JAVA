package archivo_serial_uno_a_muchos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    public static boolean existe(String idAlumno) {
        boolean bandera = false;
        for (Alumno a : VentanaAlumno.alumnos_al) {
            if (a.getIdAlumno().equalsIgnoreCase(idAlumno)) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    public static List<String> leerIdAsignatura(String nra) {
        List<String> idasignaturas_al = new ArrayList<>();
        String fila = "";

        File f;
        FileReader fr;
        BufferedReader br;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    idasignaturas_al.add(fila.trim());
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }

        return idasignaturas_al;
    }

    public static boolean validoIdAlumno(String idAlumno) {
        String patron = "A[1-9]{1,2}";
        boolean correcto = idAlumno.matches(patron);
        return correcto;
    }

    public static boolean crear(String nra) {
        boolean bandera = true;
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nra));
            oos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean escribir(String nra, Object objeto) {
        boolean bandera = true;
        try {
            MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(nra, true));
            moos.writeUnshared(objeto);
            System.out.println("LLEGO");
            moos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean escribirAlumno(String nra, Alumno alumno) {
        boolean bandera = true;
        try {
            MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(nra, true));
            moos.writeUnshared(alumno);
            moos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }
    
    public static List<Alumno> leerAlumno(String nra) {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nra));
            Alumno alumno = (Alumno) ois.readObject();
            while (alumno!= null) {
                alumnos_al.add(alumno);
                alumno = (Alumno) ois.readObject();
            }
            ois.close();
        } catch (EOFException e) {
            System.out.print("LECTURA CORRECTA\n");
        } catch (IOException | ClassNotFoundException e) {
            alumnos_al = null;
        }
        return alumnos_al;
    }

    public static boolean escribirAsignatura(String nra, Asignatura asignatura) {
        boolean bandera = true;
        try {
            MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(nra, true));
            moos.writeUnshared(asignatura);
            moos.close();
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<Asignatura> leerAsignatura(String nra) {
        List<Asignatura> asignaturas_al = new ArrayList<Asignatura>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nra));
            
            Asignatura asignatura = (Asignatura)ois.readObject();
            
            
            
            while (asignatura != null) {
                asignaturas_al.add(asignatura);
                asignatura = (Asignatura) ois.readObject();
            }
            ois.close();
        } catch (EOFException e) {
            System.out.print("LECTURA CORRECTA\n");
        } catch (IOException | ClassNotFoundException e) {
            asignaturas_al = null;
        }
        return asignaturas_al;
    }

    public static List<Object> leer(String nra) {
        List<Object> objetos_al = new ArrayList<Object>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nra));
            Object objeto = ois.readObject();
            while (objeto != null) {
                objetos_al.add(objeto);
                objeto = ois.readObject();
            }
            ois.close();
        } catch (EOFException e) {
            System.out.print("LECTURA CORRECTA\n");
        } catch (IOException | ClassNotFoundException e) {
            objetos_al = null;
        }
        return objetos_al;
    }

    public static String getDescripcionAsignatura(String idAsignatura) {
        String descripcion = "";
        List<String> asignaturas_al = leerIdAsignatura("src/archivo_serial_uno_a_muchos/idasignaturas.csv");
        for (String s : asignaturas_al) {
            String[] parte = s.split(";");
            if (parte[0].equalsIgnoreCase(idAsignatura)) {
                descripcion = parte[1];
                break;
            }
        }
        return descripcion;
    }
    /*
    public static List<Object> getAlumnosPorIdAsignatura(String nra, String idAsignatura) {
        List<Object> objetos_al = new ArrayList<Object>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nra));
            Object objeto = ois.readObject();
            while (objeto != null) {
                if (objeto instanceof Alumno) {
                    Alumno alumno = (Alumno) objeto;
                    if (alumno.getIdAsignatura().equalsIgnoreCase(idAsignatura)) {
                        objetos_al.add(objeto);
                    }
                }

                objeto = ois.readObject();
            }
            ois.close();
        } catch (EOFException e) {
            System.out.print("LECTURA CORRECTA\n");
        } catch (IOException | ClassNotFoundException e) {
            objetos_al = null;
        }
        return objetos_al;
    }
     */
}
