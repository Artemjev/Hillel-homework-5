package com.hillel.artemjev.crypter.menu;

import com.hillel.artemjev.crypter.StringCrypter;

import java.util.Scanner;

public class EncryptByXorMenuAction implements MenuAction {
    private StringCrypter stringCrypter;
    private Scanner scanner;

    public EncryptByXorMenuAction(StringCrypter stringCrypter, Scanner scanner) {
        this.stringCrypter = stringCrypter;
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Шифрование шифром XOR");
        System.out.print("Введите строку для шифрования: ");
        String str = scanner.nextLine();
        System.out.println("Получили зашифрованную строку: " + stringCrypter.crypt(str));
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "зашифровать шифром xor";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
