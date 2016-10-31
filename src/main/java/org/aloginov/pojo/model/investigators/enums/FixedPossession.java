package org.aloginov.pojo.model.investigators.enums;

import org.aloginov.pojo.model.investigators.interfaces.Possession;

/**
 * Created by aloginov on 31.10.16.
 */
public enum FixedPossession implements Possession {

    // TODO

    FIXED_POSSESSION {
        public String getDescription(){
            return null;
        }
    };

    public abstract String getDescription();

}
