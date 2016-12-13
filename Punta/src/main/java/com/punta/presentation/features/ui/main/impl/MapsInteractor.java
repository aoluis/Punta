package com.punta.presentation.features.ui.main.impl;

import com.punta.domain.executor.PostExecutionThread;
import com.punta.domain.executor.ThreadExecutor;
import com.punta.domain.interactor.AbstractInteractor;
import com.punta.domain.interactor.Interactor;
import com.punta.presentation.features.sensors.LocationSensor;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Q on 20-Nov-16.
 */

public class MapsInteractor extends AbstractInteractor implements Interactor {
    private Subscriber subscriber;

    public MapsInteractor(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, Subscriber subscriber) {
        super(threadExecutor, postExecutionThread, subscriber);
        this.subscriber = subscriber;
    }

    @Override
    public void run() {

    }

    @Override
    protected Observable buildUseCaseObservable() {
        LocationSensor locationSensor = new LocationSensor();
        return null;
    }
}
