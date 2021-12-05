package co.edu.unab.formsaludapp.modelo;

import java.io.Serializable;

public class Metabolismo implements Serializable {

    private String estaturaUsuario;
    private String pesoUsuario;
    private String edadUsuario;
    private String sexoUsuario;
    private String metabolismoUsuario;

    public Metabolismo(String estaturaUsuario, String pesoUsuario, String edadUsuario, String sexoUsuario, String metabolismoUsuario) {
        this.estaturaUsuario = estaturaUsuario;
        this.pesoUsuario = pesoUsuario;
        this.edadUsuario = edadUsuario;
        this.sexoUsuario = sexoUsuario;
        this.metabolismoUsuario = metabolismoUsuario;
    }

    public String getEstaturaUsuario() {
        return estaturaUsuario;
    }

    public String getPesoUsuario() {
        return pesoUsuario;
    }

    public String getEdadUsuario() {
        return edadUsuario;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public String getMetabolismoUsuario() {
        return metabolismoUsuario;
    }
}
