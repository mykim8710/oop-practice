package com.example.oop.menuorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookerTest {
    @Test
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    void makeCookTest() throws Exception{
        Cooker cooker = new Cooker();   // 요리사 객체 생성
        MenuItem menuItem = new MenuItem("돈까스", 3000);  // 메뉴아이템 객체 생성
        Cook cook = cooker.makeCook(menuItem);  // 요리사는 메뉴아이템에 맞는 요리를 만든다.(요리사에게 메뉴항목을 전달)
        Assertions.assertThat(cook).isEqualTo(new Cook("돈까스", 3000));   // 만들어진 요리가 메뉴항목이랑 같은지 확인
    }
}
