package com.example.oop.menuorder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * - 요구사항 : 음식점에서 음식 주문하는 과정
 *
 *  - 도메인을 구성하는 객체는 어떤것들이 있는 고민
 *      손님, 메뉴판, 메뉴, 돈까스/냉면/라면..., 요리사, 요리......
 *  - 객체들 간의 관계를 고민
 *      손님  -- 메뉴판, 손님이 메뉴판을 본다
 *      손님  -- 요리사, 손님이 요리사에게 주문을 한다.
 *      요리사 -- 요리, 요리사는 요리를 한다.
 *  - 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링하기
 *      손님 -- 손님타입
 *      돈까스/냉면/라면... -- 요리 타입
 *      메뉴핀 -- 메뉴판 타입
 *      메뉴 -- 메뉴 타입
 *
 *  - 협력을 설계
 *  - 객체들을 포괄하는 타입에 적절한 책임을 할당
 *  - 구현하기
 */
public class CustomerTest {
    @Test
    @DisplayName("메뉴이름에 해당하는 요리를 주문한다.")
    void customerMenuOrderTest() throws Exception{
        Customer customer = new Customer(); // 손님객체를 생성한다.

        // 메뉴(메뉴판)은 여러 메뉴아이템을 갖는다.
        Menu menu = new Menu(List.of(
                new MenuItem("라면", 3000),
                new MenuItem("돈까스", 5000),
                new MenuItem("김밥", 2000),
                new MenuItem("쫄면", 4000),
                new MenuItem("만두", 4000)));

        // 요리사 객체 생성
        Cooker cooker = new Cooker();

        // 손님이 메뉴명과 메뉴판 요리사 정보를 전달하며 요리를 주문한다.
        Cook cook = customer.order("만두", menu, cooker);

        Assertions.assertThat(cook).isEqualTo(new Cook(new MenuItem("만두", 4000)));
    }

}
