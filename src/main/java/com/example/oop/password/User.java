package com.example.oop.password;

import com.example.oop.password.generator.PasswordGenerate;

public class User {
    private String password;

    public void initPassword(PasswordGenerate passwordGenerator) {
        String password = passwordGenerator.generatePassword();
        System.out.println("randomPassword = " + password);

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
