package kr.hs.study;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
// beans 패키지 아래에 있는 클래스들 중 @가 붙어있는 애들은 전부 bean으로 만들어 컨테이너에 보관해라
public class BeanConfig {
    @Bean
    public DataBean2 java1(){
        return new DataBean2();
    }
    @Bean
    public DataBean2 java2(){
        return new DataBean2();
    }

}
