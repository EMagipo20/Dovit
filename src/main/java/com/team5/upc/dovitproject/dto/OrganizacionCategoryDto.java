package com.team5.upc.dovitproject.dto;

import java.util.Set;

public class OrganizacionCategoryDto {
    private int idOrganizacion;
    private String nombreOrganizacion;
    private Set<String> categories;

    public int getIdOrganizacion() { return idOrganizacion; }
    public void setIdOrganizacion(int idOrganizacion) {this.idOrganizacion = idOrganizacion;}

    public String getNombreOrganizacion() { return nombreOrganizacion; }
    public void setNombreOrganizacion(String nombreOrganizacion) {this.nombreOrganizacion = nombreOrganizacion;}

    public Set<String> getCategories() { return categories; }
    public void setCategories(Set<String> categories) {this.categories = categories;}
}
