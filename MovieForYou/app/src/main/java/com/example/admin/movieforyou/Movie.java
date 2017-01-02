package com.example.admin.movieforyou;

/**
 * Created by Admin on 12/24/2016.
 */

public class Movie {
    String icon;
    String title;
    String version;

    public Movie(String title, String version) {
        this.title = title;
        this.version = version;
    }

    public Movie(String icon, String version, String title) {
        this.icon = icon;
        this.version = version;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
