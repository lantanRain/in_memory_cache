package com.amorefecific.inmemorycache.core.amoremall.repository.cache.common;

import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheRequestForm;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheResponseDto;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheResponseResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CacheClient {

    private static final String IN_MEMORY_CACHE_ENDPOINT = "/v1/cache/findOne";

    @Autowired
    private RestTemplate restTemplate;

    public String findOne(CacheRequestForm requestForm) {
        String url = baseUrl() + IN_MEMORY_CACHE_ENDPOINT;
        HttpEntity<CacheRequestForm> entity = new HttpEntity<>(requestForm, buildHttpHeaders());
        CacheResponseResultDto result = restTemplate.postForObject(url, entity, CacheResponseDto.class).getResult();

        return result.getMessage();
    }

    private String baseUrl() {
        return "http://localhost:8080";
    }

    private HttpHeaders buildHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
