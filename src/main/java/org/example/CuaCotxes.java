package org.example;

import org.example.Model.Cotxe;

public interface CuaCotxes {
    void encuar(Cotxe cotxe);

    void desencuar();

    void cancelar();

    Cotxe get(int n);

    int count();

}
