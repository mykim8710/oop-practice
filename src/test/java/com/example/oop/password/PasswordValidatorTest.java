package com.example.oop.password;

import com.example.oop.password.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;


/**
 *  **요구사항**
 *  - 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 *  - 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
 *  - 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    @DisplayName("비밀번호는 최소 8자 이상 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordSuccessTest() {
        String password = "abcdefghi";

        assertThatCode(() -> PasswordValidator.validate(password))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호는 최소 8자 이하 또는 12자 이상이면 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordExceptionTest() {
        String password = "abcd";

        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 합니다.");
    }

    /**
     * @ParameterizedTest : 테스트에 여러 다른 매개변수를 대입해가며 반복 실행한다 @Test 포함
     * @ValueSource(strings = {"1234567", "1234567654321"}) : 대입 값
     */
    @DisplayName("[경계값 확인 : 7자, 13자] 비밀번호는 최소 8자 이하 또는 12자 이상이면 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest(name = "{index} {displayName}, source = {0}")
    @ValueSource(strings = {"aabbcce", "aabbcceeffggh"})    // 7자, 13자
    //@Test
    void validatePasswordBoundaryConditionTest(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 합니다.");
    }
}
