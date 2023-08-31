package com.example.Sample.Auth0.models;

public class EmailRequest {
    private String to;
    private String subject;
    private String content;

    public String getTo(){
        return to;
    }

    public String getSubject(){
        return subject;
    }

    public String getContent(){
        return content;
    }

    public void setTo(String to){
        this.to = to;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setContent(String content){
        this.content = content;
    }
}
