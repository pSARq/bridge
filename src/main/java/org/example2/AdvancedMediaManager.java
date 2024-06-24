package org.example2;

import java.util.ArrayList;
import java.util.List;

public class AdvancedMediaManager extends MediaManager implements PlayListFeatures {

    private final List<Media> playlist;

    public AdvancedMediaManager(Storage storage) {
        super(storage);
        this.playlist = new ArrayList<>();
    }

    @Override
    public void saveMedia(Media media) {
        System.out.println("AdvancedMediaManager: Guardando media");
        storage.save(media);
    }

    @Override
    public Media loadMedia(String title) {
        System.out.println("AdvancedMediaManager: Cargando media");
        return storage.load(title);
    }

    @Override
    public void addToPlayList(Media media) {
        System.out.println(media.getTitle() + " agregado a la lista de reproducción");
        playlist.add(media);
    }

    @Override
    public void playPlayList() {
        System.out.println("Reproduciendo lista de reproducción:");
        for (Media media: this.playlist) {
            media.play();
        }
    }

}
