package com.example.oop.menuorder;

public class Cooker {
    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
