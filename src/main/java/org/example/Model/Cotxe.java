package org.example.Model;

import lombok.Data;

public class Cotxe {
    private String matricula;
    private String nomModel;

    public Cotxe(String matricula,String nomModel){
        this.matricula = matricula;
        this.nomModel = nomModel;
    }

    @Override
    public String toString(){
        return nomModel + " "  + matricula;
    }
}
