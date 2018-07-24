package com.duyj.designpatterns.behavior.twoclass.observer.model;

/**
 * 消息
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class Message {
    private String name;
    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
