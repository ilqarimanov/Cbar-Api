package com.example.merkezibank.space;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.FileNotFoundException;


@RestController
public class Api {



    @RequestMapping(value = "api", method = RequestMethod.GET)
    public static String getEmployees() throws JsonProcessingException, FileNotFoundException {
        final String uri = "https://www.cbar.az/currencies/25.07.2022.xml";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);



        XmlMapper xmlMapper = new XmlMapper();

          ValCurs val = xmlMapper.readValue(result, ValCurs.class);

        ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(val);


    }
}
