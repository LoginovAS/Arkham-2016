package org.aloginov.pojo.model.monsters.objects;

import org.aloginov.pojo.model.monsters.enums.MonsterDimension;
import org.aloginov.pojo.model.monsters.enums.MonsterMovement;
import org.aloginov.pojo.model.monsters.enums.MonsterName;
import org.aloginov.pojo.model.monsters.enums.MonsterType;

/**
 * Created by aloginov on 31.10.16.
 */
public class Monster {

    private MonsterName name;
    private MonsterMovement movement;
    private int toughness;
    private MonsterDimension dimension;
    private MonsterType type;


    public MonsterName getName() {
        return name;
    }

    public void setName(MonsterName name) {
        this.name = name;
    }

    public MonsterMovement getMovement() {
        return movement;
    }

    public void setMovement(MonsterMovement movement) {
        this.movement = movement;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public MonsterDimension getDimension() {
        return dimension;
    }

    public void setDimension(MonsterDimension dimension) {
        this.dimension = dimension;
    }

    public MonsterType getType() {
        return type;
    }

    public void setType(MonsterType type) {
        this.type = type;
    }
}
