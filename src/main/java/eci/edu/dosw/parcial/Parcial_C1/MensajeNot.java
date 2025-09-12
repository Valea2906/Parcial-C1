package eci.edu.dosw.parcial.Parcial_C1;

public class MensajeNot {
    private String usuario;
    private String asunto;
    private String cuerpo;
    private int critico;

    public MensajeNot(String usuario, String asunto, String cuerpo, int critico) {
        this.usuario = usuario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.critico = critico;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public int getCritico() {
        return critico;
    }
}
