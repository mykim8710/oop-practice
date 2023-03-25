package com.example.oop.menuorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MenuTest {
    @Test
    @DisplayName("메뉴판에서 이름에 맞는 메뉴아이템을 반환한다.")
    void chooseMenuItemTest() throws Exception {
        // 메뉴(메뉴판)은 여러 메뉴아이템을 갖는다.
        Menu menu = new Menu(List.of(
                new MenuItem("라면", 3000),
                new MenuItem("돈까스", 5000),
                new MenuItem("김밥", 2000),
                new MenuItem("쫄면", 4000)));

        MenuItem menuItem = menu.choose("돈까스"); // 이름으로 메뉴 아이템을 선택해서 가져온다.
        Assertions.assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));// 메뉴아이템이 맞는 지 확인한다.
    }


    @Test
    @DisplayName("메뉴판에 없는 메뉴를 고르면 IllegalArgumentException 예외가 발생한다.")
    void chooseMenuItemExceptionTest() throws Exception {
        // 메뉴(메뉴판)은 여러 메뉴아이템을 갖는다.
        Menu menu = new Menu(List.of(
                new MenuItem("라면", 3000),
                new MenuItem("돈까스", 5000),
                new MenuItem("김밥", 2000),
                new MenuItem("쫄면", 4000)));

        Assertions.assertThatCode(() -> menu.choose("치킨"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("해당 이름의 메뉴아이템은 없습니다, 잘못된 메뉴이름입니다.");
    }
}
