package org.example;

import org.example.Model.Cotxe;

public interface CuaCotxes {
    void encuar(Cotxe cotxe);

    void desencuar(Cotxe cotxe);

    void cancelar(Cotxe cotxe);

    Cotxe get(int n);

    int count();

}
