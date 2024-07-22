package SE17Herencia;

import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private static int  ContadorCliente;
    private boolean vip;

    //
    public Cliente(String nombre,char genero , int edad, String direccion,Date fechaRegistro , boolean vip){
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.ContadorCliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ idCliente = ").append(idCliente);
        sb.append(" , Fecha registro = ").append(fechaRegistro);
        sb.append(" , Vip = ").append(vip);
        sb.append(", ").append(super.toString());
        sb.append(" ]");
        return sb.toString();

    }

    //sobreescritura metodo toString()
    


    
    
}
