package com.hillel.artemjev.crypter;

import com.hillel.artemjev.crypter.menu.*;

import java.util.Scanner;

public class Main {

    private static final int KEY = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SymbolCrypter cesarSymbolCrypter = new CesarSymbolCrypter(KEY);
        StringCrypter cesarStringCrypter = new StringCrypter(cesarSymbolCrypter);

        SymbolCrypter xorSymbolCrypter = new XorSymbolCrypter(KEY);
        StringCrypter xorStringCrypter = new StringCrypter(xorSymbolCrypter);

        Menu menu = new Menu(new MenuAction[0], sc);
        menu.addAction(new EncryptByCesarMenuAction(cesarStringCrypter, sc));
        menu.addAction(new DecryptByCesarMenuAction(cesarStringCrypter, sc));
        menu.addAction(new EncryptByXorMenuAction(xorStringCrypter, sc));
        menu.addAction(new DecryptByXorMenuAction(xorStringCrypter, sc));
        menu.addAction(new ExitMenuAction());
        menu.run();

    }
}
