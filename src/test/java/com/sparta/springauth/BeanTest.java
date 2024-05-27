package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // @Qualifier가 우선순위가 더 높다
    // @Primary는 더 넓은 범위 @Qualifier는 특정한거 주입 시 사용
    // 위 2개 어노테이션이 없을 때 같은 타입이 2개 이상이라면
    // Food chicken 혹은 Food pizza 처럼 이름을 명시해준다.
    // bean은 이름으로 구분한다.
    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인")
    void test1() {
        food.eat();
    }
}
