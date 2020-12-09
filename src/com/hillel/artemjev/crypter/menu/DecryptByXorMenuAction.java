package com.hillel.artemjev.crypter.menu;

import com.hillel.artemjev.crypter.StringCrypter;

import java.util.Scanner;

public class DecryptByXorMenuAction implements MenuAction {
    private StringCrypter stringCrypter;
    private Scanner scanner;

    public DecryptByXorMenuAction(StringCrypter stringCrypter, Scanner scanner) {
        this.stringCrypter = stringCrypter;
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Расшифрование шифра XOR");
        System.out.print("Введите строку для расшифрования: ");
        String str = scanner.nextLine();

        System.out.println("Получили расшифрованную строку: " + stringCrypter.uncrypt(str));
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "расшифровать шифр xor";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
