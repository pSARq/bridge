package org.example2;

public class Video implements Media {

    private String title;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo video: " + this.title);
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo video: " + this.title);
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
