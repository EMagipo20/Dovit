package com.team5.upc.dovitproject.dto;

public class DonanteDto {
    private int idDonante;
    private String nombreCompleto;
    private String contactoTelefonico;
    private String departamento;
    private String distrito;
    private String direccion;

    public int getIdDonante() {return idDonante;}
    public void setIdDonante(int idDonante) {this.idDonante = idDonante;}

    public String getNombreCompleto() {return nombreCompleto;}
    public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}

    public String getContactoTelefonico() {return contactoTelefonico;}
    public void setContactoTelefonico(String contactoTelefonico) {this.contactoTelefonico = contactoTelefonico;}

    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}

    public String getDistrito() {return distrito;}
    public void setDistrito(String distrito) {this.distrito = distrito;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
}
