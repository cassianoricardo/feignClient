package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(name="photo-consumer", url = "http://jsonplaceholder.typicode.com/")
public interface DXPClient {

    @RequestMapping(method = RequestMethod.GET, value = "photos")
    List<Photo> getPreference();
}
