package com.punta.presentation.features.ui.main.impl;

import com.punta.data.storage.db.PuntaRealmDbService;
import com.punta.domain.executor.PostExecutionThread;
import com.punta.domain.executor.ThreadExecutor;
import com.punta.domain.interactor.AbstractInteractor;
import com.punta.domain.model.PuntaUser;
import com.punta.domain.repository.PuntaDatabaseAPI;
import com.punta.utils.AppLogger;

import java.util.Date;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Q on 08-Nov-16.
 */

public class MainActivityInteractor extends AbstractInteractor {

    private Subscriber subscriber;

    public MainActivityInteractor(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, Subscriber subscriber) {
        super(threadExecutor, postExecutionThread, subscriber);
        this.subscriber = subscriber;
    }

    @Override
    public void run() {

    }

    @Override
    protected Observable buildUseCaseObservable() {
        AppLogger.v("MainActivityInteractor execute start buildUseCaseObservable");
        PuntaDatabaseAPI puntaDatabaseAPI = PuntaRealmDbService.getInstance();
        puntaDatabaseAPI.newPuntaUser(new PuntaUser(1000, "John Doe", "Surveyor", new Date(), "Hustler", "john@doe.com", "0787446411", null));
        Observable<PuntaUser> observable = puntaDatabaseAPI.getPuntaUser();
        AppLogger.v(observable + " returned value");
        return null;
    }
}
