package com.example.oop.password.generator;

public class WrongFixedLengthPasswordGenerator implements PasswordGenerate {
    @Override
    public String generatePassword() {
        return "abcdefg";
    }
}
