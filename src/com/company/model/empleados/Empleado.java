package com.company.model.empleados;

/**
 * Created by Manu on 15/03/2017.
 */
public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String numeroSegSocial;
    protected String direccion;
    protected String telefono;
    protected String email;

    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre,
                    String apellido,
                    String dni,
                    String numeroSegSocial,
                    String direccion,
                    String telefono,
                    String email)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroSegSocial = numeroSegSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    //Accesores


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroSegSocial() {
        return numeroSegSocial;
    }

    public void setNumeroSegSocial(String numeroSegSocial) {
        this.numeroSegSocial = numeroSegSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Método

    public abstract double calcularSueldo();
}
