package edu.upc.dsa.models;

public class FAQ {

    String pregunta;
    String respuesta;

    public FAQ (String pregunta, String respuesta) {
        this.setPregunta(pregunta);
        this.setRespuesta(respuesta);
    }
    public FAQ () {

    }
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
