package cn.pyy.service_feign;

import org.springframework.stereotype.Component;

@Component
public class error implements feign{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry:"+name;
    }
}
