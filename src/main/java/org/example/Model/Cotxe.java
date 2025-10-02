package org.example.Model;

import lombok.Data;

@Data
public class Cotxe {
    private String matricula;
    private String nomModel;


    @Override
    public String toString(){
        return nomModel + " "  + matricula;
    }
}
