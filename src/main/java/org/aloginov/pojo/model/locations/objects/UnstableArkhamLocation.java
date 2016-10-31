package org.aloginov.pojo.model.locations.objects;

import org.aloginov.pojo.model.locations.abstracts.ArkhamLocation;

/**
 * Created by aloginov on 31.10.16.
 */
public class UnstableArkhamLocation extends ArkhamLocation {

    private int clueCount;
    private boolean isGateOpened;


    public int getClueCount() {
        return clueCount;
    }

    public void setClueCount(int clueCount) {
        this.clueCount = clueCount;
    }

    public boolean isGateOpened() {
        return isGateOpened;
    }

    public void setGateOpened(boolean gateOpened) {
        isGateOpened = gateOpened;
    }
}
