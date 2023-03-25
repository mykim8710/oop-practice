package com.example.oop.menuorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuItemTest {

    @Test
    @DisplayName("메뉴항목을 생성한다.")
    void createMenuItemTest() throws Exception{
        Assertions.assertThatCode(() -> new MenuItem("라면", 3000))
                .doesNotThrowAnyException();
    }
}
