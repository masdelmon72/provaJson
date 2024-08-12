package com.example.json.schema.demo.api;

import com.fasterxml.jackson.databind.JsonNode;


@RestController
public class JsonSchemaController {
    @Autowired
    private JsonSchemaValidationService service;

    @PostMapping("/validate")
    public String validateEvent( @RequestBody JsonNode jsonNode ){
       return service.validateJson(jsonNode);
    }
}
