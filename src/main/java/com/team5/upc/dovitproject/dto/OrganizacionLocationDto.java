package com.team5.upc.dovitproject.dto;

public class OrganizacionLocationDto {
    private int idOrganizacion;
    private String nombreOrganizacion;
    private String departamento;
    private String distrito;

    public int getIdOrganizacion() { return idOrganizacion; }
    public void setIdOrganizacion(int idOrganizacion) {this.idOrganizacion = idOrganizacion;}

    public String getNombreOrganizacion() { return nombreOrganizacion; }
    public void setNombreOrganizacion (String nombreOrganizacion) {this.nombreOrganizacion = nombreOrganizacion;}

    public String getDepartamento() { return departamento; }
    public void setDepartamento (String departamento) {this.departamento = departamento;}

    public String getDistrito() { return distrito; }
    public void setDistrito (String distrito) {this.distrito = distrito;}
}
