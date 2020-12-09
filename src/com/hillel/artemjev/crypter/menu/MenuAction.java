package com.hillel.artemjev.crypter.menu;

public interface MenuAction {
    void doAction();

    String getName();

    boolean closeAfter();
}
