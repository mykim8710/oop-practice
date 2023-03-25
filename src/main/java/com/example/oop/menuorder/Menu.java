package com.example.oop.menuorder;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return menuItems.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 이름의 메뉴아이템은 없습니다, 잘못된 메뉴이름입니다."));
    }
}
