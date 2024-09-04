package com.example.demo;

import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DXPClient dxpClient;

    @GetMapping("/")
    public ResponseEntity<List<Photo>> teste(){
        return ResponseEntity.ok().body(dxpClient.getPreference());
    }
}
