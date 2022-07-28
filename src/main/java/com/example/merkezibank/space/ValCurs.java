package com.example.merkezibank.space;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ValCurs",namespace = "ValCurs")

 public class ValCurs implements Serializable {

    @JsonFormat(pattern = "dd.MM.yyyy")
    public Date  Date;
    public String Name;
    public String Description;





    @JsonProperty("ValType")
    public List<ValType>valTypes;










}
