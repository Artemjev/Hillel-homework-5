package com.hillel.artemjev.crypter;

public class XorSymbolCrypter implements SymbolCrypter {
    private int key;

    public XorSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char) (c ^ key);
    }

    @Override
    public char uncrypt(char c) {
        return (char) (c ^ key);
    }
}
