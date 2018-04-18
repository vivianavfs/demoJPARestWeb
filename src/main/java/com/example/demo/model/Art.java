package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Art {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String artist;
    private String imagePath;
    private int raking;

    public Art() { }

    public Art(String name, String artist, String imagePath, int raking) {
        this.name = name;
        this.artist = artist;
        this.imagePath = imagePath;
        this.raking = raking;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRaking() {
        return raking;
    }

    public void setRaking(int raking) {
        this.raking = raking;
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", raking=" + raking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Art art = (Art) o;
        return Objects.equals(id, art.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
