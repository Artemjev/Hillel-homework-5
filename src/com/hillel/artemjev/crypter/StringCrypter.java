package com.hillel.artemjev.crypter;

public class StringCrypter {
    private SymbolCrypter symbolCrypter;

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;

    }

    public String crypt(String str) {
        char[] arrayChar = str.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = symbolCrypter.crypt(arrayChar[i]);
        }
        return new String(arrayChar);
    }

    public String uncrypt(String str) {
        char[] arrayChar = str.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = symbolCrypter.uncrypt(arrayChar[i]);
        }
        return new String(arrayChar);
    }
}
