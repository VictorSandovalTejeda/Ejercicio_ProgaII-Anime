/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

/**
 *
 * @author Alumnos
 */
public class Televisora {
    private String nombre;
    private Animes anime;
    private String edadRestriccion;

    public Televisora(String nombre, Animes anime, String edadRestriccion) {
        this.nombre = nombre;
        this.anime = anime;
        this.edadRestriccion = edadRestriccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animes getAnime() {
        return anime;
    }

    public void setAnime(Animes anime) {
        this.anime = anime;
    }

    public String getEdadRestriccion() {
        return edadRestriccion;
    }

    public void setEdadRestriccion(String edadRestriccion) {
        this.edadRestriccion = edadRestriccion;
    }
    
    
}
