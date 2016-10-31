package org.aloginov.pojo.model.locations.abstracts;

import org.aloginov.pojo.model.investigators.objects.Investigator;
import org.aloginov.pojo.model.monsters.objects.Monster;

import java.util.List;

/**
 * Created by aloginov on 31.10.16.
 */
public abstract class Location {

    private List<Monster> monsters;
    private List<Investigator> investigators;


    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Investigator> getInvestigators() {
        return investigators;
    }

    public void setInvestigators(List<Investigator> investigators) {
        this.investigators = investigators;
    }
}
