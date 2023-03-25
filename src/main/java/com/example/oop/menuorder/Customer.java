package com.example.oop.menuorder;

public class Customer {

    public Cook order(String menuName, Menu menu, Cooker cooker) {
        MenuItem menuItem = menu.choose(menuName);// 이름으로 메뉴 아이템을 선택해서 가져온다.
        return cooker.makeCook(menuItem);   // 요리사는 메뉴아이템에 맞는 요리를 만든다.(요리사에게 메뉴항목을 전달)
    }
}
