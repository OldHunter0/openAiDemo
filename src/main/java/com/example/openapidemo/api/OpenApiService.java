package com.example.openapidemo.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class OpenApiService {

    private final String prompt = """
                Give me a good French recipe for tonight's dinner.
                """;

    private final String openAiUrl = "";

    private final String openAiKey = "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";

    private final RestTemplate restTemplate = new RestTemplate();

    @PostConstruct
    public void init() {

    }

    public ImageResponse generateImage(){
        restTemplate.postForObject();
    }

}
