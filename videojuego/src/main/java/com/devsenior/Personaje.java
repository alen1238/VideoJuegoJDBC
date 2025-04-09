package com.devsenior;

public class Personaje {
    private int id;
    private String nombre;
    private String clase;
    private int nivel;
    private int experiencia;
    
    public Personaje(int id, String nombre, String clase, int nivel, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public Personaje(String nombre, String clase, int nivel, int experiencia) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString(){
        return "ID: " + id + " | Nombre: " + nombre  + " | Clase: " + clase + " | Nivel: " + nivel 
        + " Experiencia: " + experiencia;

    }
}
