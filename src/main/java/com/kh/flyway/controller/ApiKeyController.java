package com.kh.flyway.controller;

import com.kh.flyway.service.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/api/key")
public class ApiKeyController {

    @Autowired
    private ApiKeyService apiKeyService;


    @PostMapping("/save")
    public void save(@RequestBody HashMap<String, String> body) {
        String clientName = body.get("clientName");
        String secretKey = body.get("secretKey");
        apiKeyService.save(clientName, secretKey);
    }

}
