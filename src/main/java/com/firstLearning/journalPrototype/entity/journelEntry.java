package com.firstLearning.journalPrototype.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Remainder : Controller --> Service --> Respository

@Document
public class journelEntry {

    @Id
    private String id;

    private String title;

    private String content;

    public String getTitle() {
        return title;}

    public void setTitle(String title) {
        this.title = title;}

    public String getContent() {
        return content;}

    public void setContent(String content) {
        this.content = content;}

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;}

}
