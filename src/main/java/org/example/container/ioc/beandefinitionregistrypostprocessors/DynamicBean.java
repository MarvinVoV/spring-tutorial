package org.example.container.ioc.beandefinitionregistrypostprocessors;

public class DynamicBean {
    private String name = "default";
    public void hello() {
        System.out.println("hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
