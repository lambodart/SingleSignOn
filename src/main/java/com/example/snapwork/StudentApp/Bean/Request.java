package com.example.snapwork.StudentApp.Bean; 


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Request { 
    @JsonProperty("reqdata")
    private Map<String, Object> reqData; //object //encrypation
}
