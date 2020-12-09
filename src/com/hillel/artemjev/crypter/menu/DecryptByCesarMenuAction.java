package com.hillel.artemjev.crypter.menu;

import com.hillel.artemjev.crypter.StringCrypter;

import java.util.Scanner;

public class DecryptByCesarMenuAction implements MenuAction {
    private StringCrypter stringCrypter;
    private Scanner scanner;

    public DecryptByCesarMenuAction(StringCrypter stringCrypter, Scanner scanner) {
        this.stringCrypter = stringCrypter;
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Расшифрование шифра Цезаря");
        System.out.print("Введите строку для расшифрования: ");
        String str = scanner.nextLine();

        System.out.println("Получили расшифрованную строку: " + stringCrypter.uncrypt(str));
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "расшифровать шифр цезаря";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
