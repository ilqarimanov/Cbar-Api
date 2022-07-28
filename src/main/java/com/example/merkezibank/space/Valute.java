package com.example.merkezibank.space;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Valute {


    @JsonProperty("Nominal")
    public String nominal;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public String value;
    public String Code;




}
