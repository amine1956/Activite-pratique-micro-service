package com.example.micro1.entite;

public class Costmer {
    private Long id;
    private String name;
    private String email;

    public Costmer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Costmer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Costmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
