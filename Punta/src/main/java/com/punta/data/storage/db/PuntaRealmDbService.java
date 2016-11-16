package com.punta.data.storage.db;

/**
 * Created by Q on 21-Oct-16.
 */

import com.punta.data.storage.db.model.RealmUser;
import com.punta.domain.model.PuntaJob;
import com.punta.domain.model.PuntaUser;
import com.punta.domain.repository.PuntaDatabaseAPI;
import com.punta.utils.AppLogger;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;
import rx.Observable;

/**
 * provides mapping between realm objects and Punta POJOs
 */
public class PuntaRealmDbService implements PuntaDatabaseAPI {

    private static PuntaRealmDbService puntaRealmDbService = null;
    private Realm realm;

    private PuntaRealmDbService() {
        realm = Realm.getDefaultInstance();
    }

    public static PuntaRealmDbService getInstance() {
        if (puntaRealmDbService == null) {
            puntaRealmDbService = new PuntaRealmDbService();
            AppLogger.v(puntaRealmDbService.toString());
            return puntaRealmDbService;
        } else {
            return puntaRealmDbService;
        }
    }

    @Override
    public Observable<PuntaUser> getPuntaUser() {
        RealmResults<RealmUser> realmResults = this.realm.where(RealmUser.class).findAll();
        RealmUser realmUser = realmResults.first();

        return Observable.just(new PuntaUser(realmUser.getUserID(),
                realmUser.getUserName(),
                realmUser.getUserProfession(),
                realmUser.getUserDateJoined(),
                realmUser.getUserAboutMe(),
                realmUser.getUserTelephone(),
                realmUser.getUserEmail(),
                null));
    }

    @Override
    public Observable<PuntaUser> newPuntaUser(PuntaUser puntaUser) {
        this.realm.beginTransaction();
        RealmUser realmUser = this.realm.createObject(RealmUser.class);
        realmUser.setUserID(puntaUser.getUserID());
        realmUser.setUserName(puntaUser.getUserName());
        realmUser.setUserEmail(puntaUser.getUserEmail());
        realmUser.setUserProfession(puntaUser.getUserProfession());
        realmUser.setUserAboutMe(puntaUser.getUserAboutMe());
        this.realm.commitTransaction();
        return Observable.just(puntaUser);
    }

    @Override
    public Observable<PuntaUser> updatePuntaUser(PuntaUser puntaUser) {
        return null;
    }

    @Override
    public Observable<Boolean> deletePuntaUser(PuntaUser puntaUser) {
        return null;
    }

    @Override
    public Observable<List<PuntaJob>> getPuntaJobs() {
        return null;
    }

    @Override
    public Observable<PuntaJob> newPuntaJob(PuntaJob puntaJob) {
        return null;
    }

    @Override
    public Observable<PuntaJob> updatePunaJob(PuntaJob puntaJob) {
        return null;
    }

    @Override
    public Observable<Boolean> deletePuntaJob(PuntaJob puntaJob) {
        return null;
    }
}
