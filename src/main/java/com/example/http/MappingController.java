package com.example.http;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j // log 변수를 만들어준다.
@Controller
public class MappingController {
    // private static final Logger logger
    //  = LoggerFactory.getLogger(MappingController.class);
    // System.out.println(""); -> logger.info(); logger.warn();
    // -> @Slf4j를 쓰면 위 두 줄을 대신 남겨준다.
    // 테스트 목적으로 출력을 남기고 싶을 때 printLine 대신에 loge를 남겨준다.

    // '/path'로 오는 GET 요청에 대해서 메소드를 실행하고 싶을 때
    @RequestMapping(
            // 여기에 오는 내용은?
            value = "/path",
            // GET 요청 메소드
            method = RequestMethod.GET
    )
    public String getPath() {
        log.info("GET /path");
        return "index";
    }

    // '/path'로 오는 POST 요청에 대해서 메소드를 실행하고 싶을 때
    @RequestMapping(
            value = "/path",
            method = RequestMethod.POST
    )
    public String postPath(){
        log.info("POST /path");
        return "index";
    }

    // '/path'로 오는 PUT 또는 DELETE 요청에 대해서
    // 메소드를 실행하고 싶을 때
    // 메소드 1개 당 1개의 기능을 가져야 하는 원칙에 벗어나기 때문에 바람직하지 못함
    @RequestMapping(
            value = "/path",
            method = { RequestMethod.PUT, RequestMethod.DELETE }
    )
    public String putOrDeletePath(){
        log.info("PUT or DELETE /path");
        return "index";
    }

    // '/path'로 오는 POST 요청이면서 JSON 데이터를 포함하는 요청에 대하여
    // 메소드를 실행하고 싶을 때
    @RequestMapping(
            value = "/path",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE //소비하다
    )
    public String consumes() {
        log.info("POST /path Content-Type: application/json");
        return "index";
    }

    // '/path'로 오는 POST 요청이면서
    // 헤더에 x-likelion 값이 hello로 지정되어 있을 때
    // 메소드를 실행하고 싶을 때
    // -> 권장하는 방법이 아님

}
