package data_dragon.endpoints.cdn.champion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passive {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("image")
    private Image image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "passive:{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}