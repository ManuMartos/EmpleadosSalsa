package com.company.model.empleados;

/**
 * Created by Manu on 15/03/2017.
 */
public class EmpleadoOficina extends Empleado {

    private final int MAX_TRIENIOS = 10;
    private final double PLUS_TRIENIOS = 35.0;
    private final double PORCENTAJE_RETENCION = 0.18;

    private String planta;
    private String oficina;
    private String area;
    private String seccion;
    private int aniosTrabajados;

    //Constructor


    public EmpleadoOficina() {
        super();
    }

    public EmpleadoOficina(String nombre,
                           String apellido,
                           String dni,
                           String numeroSegSocial,
                           String direccion,
                           String telefono,
                           String email,
                           String planta,
                           String oficina,
                           String area,
                           String seccion,
                           int aniosTrabajados)
    {
        super(nombre, apellido, dni, numeroSegSocial, direccion, telefono, email);
        this.planta = planta;
        this.oficina = oficina;
        this.area = area;
        this.seccion = seccion;
        this.aniosTrabajados = aniosTrabajados;
    }

    //Accesores


    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    //Métodos

    @Override
    public double calcularSueldo() {
        double sueldoBase = 1150.0;

        double sueltoNeto, retencion;

        int trienios = aniosTrabajados/3;

        double plus = 0;

        if (trienios >= MAX_TRIENIOS)
        {
            plus = MAX_TRIENIOS * PLUS_TRIENIOS;
        }
        else
        {
            plus = trienios * PLUS_TRIENIOS;
        }

        retencion = (sueldoBase + plus) * PORCENTAJE_RETENCION;

        sueltoNeto = sueldoBase + plus - retencion;

        return sueltoNeto;
    }
}
