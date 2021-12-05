package co.edu.unab.formsaludapp.modelo;

import java.io.Serializable;

public class MasaCorporal implements Serializable {

    private String estaturaUsuario;
    private String pesoUsuario;
    private String masaCorporalUsuario;

    public MasaCorporal(String estaturaUsuario, String pesoUsuario, String masaCorporalUsuario) {
        this.estaturaUsuario = estaturaUsuario;
        this.pesoUsuario = pesoUsuario;
        this.masaCorporalUsuario = masaCorporalUsuario;
    }

    public String getEstaturaUsuario() {
        return estaturaUsuario;
    }

    public String getPesoUsuario() {
        return pesoUsuario;
    }

    public String getMasaCorporalUsuario() {
        return masaCorporalUsuario;
    }
}
