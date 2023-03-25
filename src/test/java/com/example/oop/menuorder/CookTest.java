package com.example.oop.menuorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookTest {
    @Test
    @DisplayName("요리 객체를 생성한다.")
    void createCookTest() throws Exception{
        Assertions.assertThatCode(() -> new Cook("라면",3000))
                .doesNotThrowAnyException();
    }
}
