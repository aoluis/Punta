package com.punta.domain.repository;

import com.punta.domain.model.PuntaJob;
import com.punta.domain.model.PuntaUser;

import java.util.List;

import rx.Observable;

/**
 * Created by Q on 21-Oct-16.
 */
public interface PuntaDatabaseAPI {

    Observable<PuntaUser> getPuntaUser();

    Observable<PuntaUser> newPuntaUser(PuntaUser puntaUser);

    Observable<PuntaUser> updatePuntaUser(PuntaUser puntaUser);

    Observable<Boolean> deletePuntaUser(PuntaUser puntaUser);

    Observable<List<PuntaJob>> getPuntaJobs();

    Observable<PuntaJob> newPuntaJob(PuntaJob puntaJob);

    Observable<PuntaJob> updatePunaJob(PuntaJob puntaJob);

    Observable<Boolean> deletePuntaJob(PuntaJob puntaJob);


}
