package com.example.http;

import com.example.dto.ArticleDto;
import com.example.dto.ResponseDto;
import com.example.dto.WriterDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class BodyController {
    // '/body'로 요청이 들어왔을 때,
    // ResponsDto 데이터를 표현한 JSON 응답을 반환하는 메소드
/*    @PostMapping("/body")
           // HTTP 응답의 Body임을 나타내는 어노테이션
    public @ResponseBody ResponseDto body(
            @RequestBody ArticleDto requestDto
    ) {
        log.info(requestDto.toString());
        ResponseDto response = new ResponseDto();
        response.setStatus(200);
        response.setMessage("success");
        return response; // 클라이언트가 이해할 수 있게 변환하여 응답*/

    // '/body'를 ArticleDto 포함한 JSON과 함께
    // 요청이 들어올 때,
    // ResponseDto를 표현한 JSON을 포함해 응답하는 메소드
    // 500 에러 -> 서버 에러
    @PostMapping("/body")
    @ResponseBody
    public ResponseDto body(@RequestBody ArticleDto dto) {
        log.info("POST /body " + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("Success");
        response.setStatus(200);
        return response;
    }

    @PostMapping("/body-2")
    @ResponseBody
    public ResponseDto body2(@RequestBody WriterDto dto){
        log.info("POST /body-2" + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("Success");
        response.setStatus(200);
        return response;
    }

    @PostMapping("/body-3")
    @ResponseBody
    public ResponseDto body3(@RequestBody ArticleDto dto){
        log.info("POST /body-3" + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("Success");
        response.setStatus(200);
        return response;
    }
}
