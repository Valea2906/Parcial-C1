package eci.edu.dosw.parcial.Parcial_C1;

public class MensajeNot {
    private String usuario;
    private String asunto;
    private String cuerpo;
    private int  criticidad;

    public  MensajeNot(String  usuario, String asunto, String cuerpo, int criticidad) {
        this.usuario = usuario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.criticidad = criticidad;

    }

    public String getUsuario() {
        return usuario;
    }

    public String getAsunto() {
        return asunto;
    }

    public  String getCuerpo() {
        return cuerpo;
    }

    public int getCriticidad() {
        return criticidad;
    }
}
