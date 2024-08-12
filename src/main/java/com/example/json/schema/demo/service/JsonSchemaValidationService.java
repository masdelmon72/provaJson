package com.example.json.schema.demo.service;

@Slf4j
@Service
public class JsonSchemaValidationService{
  
  @Autowired
  private JsonSchema jsonSchema;
  
  public String validateJson(JsonNode jsonNode){
    
    Set<ValidationMessage> errors = jsonSchema.validate(jsonNode);
    //if errors have a single miss match, there would be a value in the errors set.
    if(errors.isEmpty()){
      //event is valid.
      log.info("event is valid");
    }else{
        //event is in_valid.
      log.info("event is invalid");
     }
      return errors.toString();
  }
}
