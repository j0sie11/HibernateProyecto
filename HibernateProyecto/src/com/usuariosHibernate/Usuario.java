package com.usuariosHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
    
    @Id
    @Column(name = "ID")
    private int ID;
    
    @Column(name = "Nombre")
    private String Nombre;
    
    @Column(name = "Correo_Electronico")
    private String Correo_Electronico;
    
    @Column(name = "Contraseña")
    private String Contraseña;
    
    public Usuario() {
        
    }
    
    public Usuario(String nombre, String correo, String contra) {
        super();
        Nombre = nombre;
        Correo_Electronico = correo;
        Contraseña = contra;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int iD) {
        ID = iD;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public void setCorreo(String correo) {
        Correo = correo;
    }
    
    public String getContra() {
        return Contra;
    }
    
    public void setContra(String contra) {
        Contra = contra;
    }
    
    @Override
    public String toString() {
        return "Usuario [ID=" + ID + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Contra=" + Contra + "]";
    }
}

