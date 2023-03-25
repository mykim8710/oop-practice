package com.example.oop.password.generator;

@FunctionalInterface
public interface PasswordGenerate {
    String generatePassword();  // 추상메서드를 하나만 가진다.
}
