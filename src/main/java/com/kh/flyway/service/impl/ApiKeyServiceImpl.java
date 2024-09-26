package com.kh.flyway.service.impl;

import com.kh.flyway.entity.ApiKey;
import com.kh.flyway.repository.ApiKeyRepository;
import com.kh.flyway.service.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    @Autowired
    private ApiKeyRepository apiKeyRepository;


    @Override
    public void save(String clientName, String secretKey) {
        ApiKey apiKey = ApiKey.builder()
            .clientName(clientName)
            .hashedSecretKey(secretKey)
            .build();
        apiKeyRepository.save(apiKey);
    }
}