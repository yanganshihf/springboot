package com.ruitesen.demo.model;

public class PatrolEvent2WithBLOBs extends PatrolEvent2 {
    private String eventphoto;

    private String eventvedio;

    private String eventredio;

    private String eventtext;

    private String responsesuggestion;

    public String getEventphoto() {
        return eventphoto;
    }

    public void setEventphoto(String eventphoto) {
        this.eventphoto = eventphoto == null ? null : eventphoto.trim();
    }

    public String getEventvedio() {
        return eventvedio;
    }

    public void setEventvedio(String eventvedio) {
        this.eventvedio = eventvedio == null ? null : eventvedio.trim();
    }

    public String getEventredio() {
        return eventredio;
    }

    public void setEventredio(String eventredio) {
        this.eventredio = eventredio == null ? null : eventredio.trim();
    }

    public String getEventtext() {
        return eventtext;
    }

    public void setEventtext(String eventtext) {
        this.eventtext = eventtext == null ? null : eventtext.trim();
    }

    public String getResponsesuggestion() {
        return responsesuggestion;
    }

    public void setResponsesuggestion(String responsesuggestion) {
        this.responsesuggestion = responsesuggestion == null ? null : responsesuggestion.trim();
    }
}