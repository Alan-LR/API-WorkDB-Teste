package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrevisaoTabela {

    @Id
    private String id;
    private String temp;
    private String feels_like;
    private String temp_min;
    private String temp_max;
    private String pressure;
    private String humidity;
    private String sea_level;
    private String grnd_level;

    public PrevisaoTabela() {
    }

    public PrevisaoTabela(String id, String temp, String feels_like, String temp_min, String temp_max, String pressure,
            String humidity, String sea_level, String grnd_level) {
        this.id = id;
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getSea_level() {
        return sea_level;
    }

    public void setSea_level(String sea_level) {
        this.sea_level = sea_level;
    }

    public String getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(String grnd_level) {
        this.grnd_level = grnd_level;
    }

    @Override
    public String toString() {
        return "PrevisaoTabela [feels_like=" + feels_like + ", grnd_level=" + grnd_level + ", humidity=" + humidity
                + ", id=" + id + ", pressure=" + pressure + ", sea_level=" + sea_level + ", temp=" + temp
                + ", temp_max=" + temp_max + ", temp_min=" + temp_min + "]";
    }

}
