package org.example2;

public class Music implements Media {

    private String title;

    public Music(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo musica: " + this.title);
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo musica: " + this.title);
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
