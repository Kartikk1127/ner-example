package com.Kartikey.nerexample.model;

public enum Type {

    PERSON("Person"),
    CITY("City"),
    STATE_OR_PROVINCE("State_or_Province"),
    COUNTRY("Country"),
    EMAIL("Email"),
    TITLE("Title");

    private String type;

    Type(String type){
        this.type = type;
    }

    public String getName(){
        return type;
    }
}
