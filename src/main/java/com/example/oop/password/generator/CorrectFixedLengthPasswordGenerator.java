package com.example.oop.password.generator;

public class CorrectFixedLengthPasswordGenerator implements PasswordGenerate {
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
