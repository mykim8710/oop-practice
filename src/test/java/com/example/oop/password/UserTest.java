package com.example.oop.password;

import com.example.oop.password.generator.CorrectFixedLengthPasswordGenerator;
import com.example.oop.password.generator.WrongFixedLengthPasswordGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    @DisplayName("패스워드 초기화한다.")
    void initPasswordSuccessTest() throws Exception{
        // given
        User user = new User();

        // when
        //user.initPassword(new CorrectFixedLengthPasswordGenerator());
        user.initPassword(() -> "abcdefgh");    // funtional interface를 람다식으로 바로 구현


        // then
        Assertions.assertThat(user.getPassword()).isNotNull();
    }

    @Test
    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지않는다.")
    void initPasswordFailTest() throws Exception{
        // given
        User user = new User();

        // when
        //user.initPassword(new WrongFixedLengthPasswordGenerator());
        user.initPassword(() -> "abcd");

        // when & then
        Assertions.assertThat(user.getPassword()).isNull();
    }
}