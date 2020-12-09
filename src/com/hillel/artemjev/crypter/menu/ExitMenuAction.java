package com.hillel.artemjev.crypter.menu;

public class ExitMenuAction implements MenuAction {
    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Всего хорошего)");
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "Выход";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
