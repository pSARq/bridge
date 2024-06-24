package org.example2;

public abstract class MediaManager {

    protected Storage storage;

    public MediaManager(Storage storage) {
        this.storage = storage;
    }

    public abstract void saveMedia(Media media);
    public abstract Media loadMedia(String title);

    public void printMediaInfo(String title) {
        Media media = storage.load(title);
        if (media != null) {
            System.out.println("Información de media:");
            System.out.println("Titulo: " + media.getTitle());
            System.out.println("Tipo: " + (media instanceof Music ? "Musica" : "Video"));
        } else {
            System.out.println("Media no existe");
        }
    }

}
