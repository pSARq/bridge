package org.example2;

public class SimpleMediaManager extends MediaManager {

    public SimpleMediaManager(Storage storage) {
        super(storage);
    }

    @Override
    public void saveMedia(Media media) {
        System.out.println("SimpleMediaManager: guardando media");
        storage.save(media);
    }

    @Override
    public Media loadMedia(String title) {
        System.out.println("SimpleMediaManager: cargando media");
        return storage.load(title);
    }
}
