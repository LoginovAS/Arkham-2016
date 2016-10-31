package org.aloginov.pojo.model.investigators.objects;

import org.aloginov.pojo.model.investigators.enums.Ability;
import org.aloginov.pojo.model.investigators.enums.FixedPossession;
import org.aloginov.pojo.model.investigators.enums.RandomPossession;

import java.util.List;
import java.util.Map;

/**
 * Created by aloginov on 29.10.16.
 */
public class Investigator {

    private int stamina;
    private int sanity;
    private int speed;
    private int sneak;
    private int fight;
    private int will;
    private int lore;
    private int luck;
    private int focus;
    private List<Ability> abilities;
    private Map<FixedPossession, Integer> fixedPossessions;
    private Map<RandomPossession, Integer> randomPossessions;


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSneak() {
        return sneak;
    }

    public void setSneak(int sneak) {
        this.sneak = sneak;
    }

    public int getFight() {
        return fight;
    }

    public void setFight(int fight) {
        this.fight = fight;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getLore() {
        return lore;
    }

    public void setLore(int lore) {
        this.lore = lore;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Map<FixedPossession, Integer> getFixedPossessions() {
        return fixedPossessions;
    }

    public void setFixedPossessions(Map<FixedPossession, Integer> fixedPossessions) {
        this.fixedPossessions = fixedPossessions;
    }

    public Map<RandomPossession, Integer> getRandomPossessions() {
        return randomPossessions;
    }

    public void setRandomPossessions(Map<RandomPossession, Integer> randomPossessions) {
        this.randomPossessions = randomPossessions;
    }
}
