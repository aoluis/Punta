package com.punta.data.storage.db;

/**
 * Created by Q on 21-Oct-16.
 */

import com.punta.domain.repository.PuntaDatabaseAPI;

/**
 * provides mapping between realm objects and Punta POJOs
 */
public class PuntaDatabaseService {

    private static PuntaDatabaseAPI puntaDatabaseAPI;

    public static PuntaDatabaseAPI initPuntaDatabase() {
        return puntaDatabaseAPI;
    }


}
