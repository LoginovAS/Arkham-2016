package org.aloginov.pojo.model.locations.abstracts;

import org.aloginov.pojo.model.encounters.interfaces.Encounter;

/**
 * Created by aloginov on 31.10.16.
 */
public abstract class ArkhamLocation extends Location {

    private Encounter firstEncounter;
    private Encounter secondEncounter;


    public Encounter getFirstEncounter() {
        return firstEncounter;
    }

    public void setFirstEncounter(Encounter firstEncounter) {
        this.firstEncounter = firstEncounter;
    }

    public Encounter getSecondEncounter() {
        return secondEncounter;
    }

    public void setSecondEncounter(Encounter secondEncounter) {
        this.secondEncounter = secondEncounter;
    }
}
