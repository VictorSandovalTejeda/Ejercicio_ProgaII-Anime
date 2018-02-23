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
public class Animes extends Estudio {
    
    private String nombreAnime;
    private String horario;

    public Animes(String nombreAnime, String horario, String nombre) {
        super(nombre);
        this.nombreAnime = nombreAnime;
        this.horario = horario;
    }

    public String getNombreAnime() {
        return nombreAnime;
    }

    public void setNombreAnime(String nombreAnime) {
        this.nombreAnime = nombreAnime;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
