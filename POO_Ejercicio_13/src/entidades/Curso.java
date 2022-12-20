
package entidades;


public class Curso {
    
    private String nombreCurso;
    private int cantidadHoras;
    private int cantidadDias;
    private String turno;
    private int precioHora;
    private String [] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHoras, int cantidadDias, String turno, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoras = cantidadHoras;
        this.cantidadDias = cantidadDias;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHoras=" + cantidadHoras + ", cantidadDias=" + cantidadDias + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + alumnos + '}';
    }
    
    
}
