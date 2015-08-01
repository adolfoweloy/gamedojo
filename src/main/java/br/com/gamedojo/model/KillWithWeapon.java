package br.com.gamedojo.model;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;

public interface KillWithWeapon {

    KillingEvent withWeaponAt(Weapon weapon, Date date);

}
