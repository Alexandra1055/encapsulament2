package org.example;
import org.example.Model.Cotxe;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CuaCotxesArrayImpl implements CuaCotxes {
    ArrayList<Cotxe> cua = new ArrayList<Cotxe>() ;

    @Override
    public void encuar(Cotxe cotxe) {
        if(cotxe == null){
            throw new IllegalArgumentException("No s'ha passat ningun cotxe");
        }
        cua.add(cotxe);
    }

    @Override
    public void desencuar() {
        if(cua.isEmpty()){
            throw new NoSuchElementException("La llista está buida");
        }
        cua.removeFirst();
    }

    @Override
    public void cancelar() {
        if(cua.isEmpty()){
            throw new NoSuchElementException("La llista está buida");
        }
        cua.removeLast();
    }

    @Override
    public Cotxe get(int n) {
        if(n >= cua.size()){
            throw new NoSuchElementException("L'index no existeix");
        }
        return cua.get(n);
    }

    @Override
    public int count() {
        return cua.size();
    }
}