package com.company.model.empleados;

/**
 * Created by Manu on 15/03/2017.
 */
public class Temporal extends Empleado{

    protected int horasMes;
    protected int horasTotales;
    protected double sueldo;

    //Constructores

    public Temporal() {
        super();
    }

    public Temporal(String nombre,
                    String apellido,
                    String dni,
                    String numeroSegSocial,
                    String direccion,
                    String telefono,
                    String email,
                    int horasMes,
                    int horasTotales)
    {
        super(nombre, apellido, dni, numeroSegSocial, direccion, telefono, email);
        this.horasMes = horasMes;
        this.horasTotales = horasTotales;
    }

    //Accesores


    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Métodos

    @Override
    public double calcularSueldo() {

        double resultado;

        resultado = this.getHorasMes() * 25;

        if (this.getHorasMes() >= 10 && this.getHorasMes() < 25){
            resultado += resultado * 3 / 100;
        }else if (this.getHorasMes() >= 25 && this.getHorasMes() < 50){
            resultado += resultado * 5 / 100;
        }else if (this.getHorasMes() >= 50){
            resultado += resultado * 10 / 100;
        }


        if (resultado > 850){
            resultado -= resultado * 11 / 100;
        }

        return resultado;

    }
}
