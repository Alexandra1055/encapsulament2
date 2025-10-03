package org.example;

import org.example.Model.Cotxe;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class CuaCotxesQueImpl implements CuaCotxes {

    private final Queue<Cotxe> cua = new LinkedList<>();

    @Override
    public void encuar(Cotxe cotxe) {
        if (cotxe == null) {
            throw new IllegalArgumentException("El cotxe no pot ser null");
        }
        cua.add(cotxe);
    }

    @Override
    public void desencuar() {
        if (cua.isEmpty()) {
            throw new NoSuchElementException("La cua està buida");
        }
        cua.remove();
    }

    @Override
    public void cancelar() {
        if (cua.isEmpty()) {
            throw new NoSuchElementException("La cua està buida");
        }
        int n = cua.size();
        for (int i = 0; i < n - 1; i++) {
            cua.add(cua.remove());
        }
        cua.remove();
    }

    @Override
    public Cotxe get(int n) {
        if (n < 0 || n >= cua.size()) {
            throw new NoSuchElementException("Índex fora de rang");
        }
        Cotxe[] arr = cua.toArray(new Cotxe[0]);
        return arr[n];
    }

    @Override
    public int count() {
        return cua.size();
    }
}
