package com.example.demo.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

//RestTemplete을 사용하기위한 Bean정의

@Configuration //어노테이션을 사용하여 Bean구조 명시
public class HttpClientConfig {

    @Bean
    public RestTemplate restTemplate(){
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        HttpClient httpClient = HttpClientBuilder.create()
                .setMaxConnTotal(50) // 연결을 유지할 숫자, 커넥션 수
                .setMaxConnPerRoute(10) // 특정 경로당 최대 숫자, 포트1쌍에 수행할 연결 수
                .build();

        factory.setHttpClient(httpClient);
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(5000);
        return  new RestTemplate(factory);
    }
}
