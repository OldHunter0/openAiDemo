package com.example.openapidemo.api;

import lombok.Data;

@Data
public class ImageOpenAiRequest {
    private String prompt;
    private int n;
    private String size = "1024x1024";
}
