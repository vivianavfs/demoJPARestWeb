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
    private String imageURL;
    private int ranking;

    public Art() { }

    public Art(String name, String artist, String imageURL, int ranking) {
        this.name = name;
        this.artist = artist;
        this.imageURL = imageURL;
        this.ranking = ranking;
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

    public String getimageURL() {
        return imageURL;
    }

    public void setimageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", ranking=" + ranking +
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
