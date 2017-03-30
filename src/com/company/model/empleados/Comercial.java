package com.company.model.empleados;

/**
 * Created by Manu on 15/03/2017.
 */
public class Comercial extends Empleado{

    protected String zona;
    protected int altasMes;
    protected int altasTotales;
    protected double sueldo;

    //Constructores


    public Comercial() {
        super();
        this.altasMes = 0;
        this.altasTotales = 0;
        this.sueldo = this.calcularSueldo();
    }

    public Comercial(String nombre,
                     String apellido,
                     String dni,
                     String numeroSegSocial,
                     String direccion,
                     String telefono,
                     String email,
                     String zona,
                     int altasMes,
                     int altasTotales)
    {
        super(nombre, apellido, dni, numeroSegSocial, direccion, telefono, email);
        this.zona = zona;
        this.altasMes = altasMes;
        this.altasTotales = altasTotales;
    }

    //Accesores


    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getAltasMes() {
        return altasMes;
    }

    public void setAltasMes(int altasMes) {
        this.altasMes = altasMes;
    }

    public int getAltasTotales() {
        return altasTotales;
    }

    public void setAltasTotales(int altasTotales) {
        this.altasTotales = altasTotales;
    }

    public double getSueldo() {
        sueldo = 850;

        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Métodos

    @Override
    public double calcularSueldo() {

        double resultado = 850;

        if (this.getAltasMes() >= 100 && this.getAltasMes() < 300){
            resultado += resultado * 8 / 100;
        }else if (this.getAltasMes() >= 300 && this. getAltasMes() < 500){
            resultado += resultado * 10 / 100;
        } else if (this.getAltasMes() > 500){
            resultado += resultado * 15 / 100;
        }

        resultado += this.getAltasTotales() * 12;

        resultado -= resultado * 12 / 100;

        return resultado;
    }
}
