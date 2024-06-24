package org.example2;

import java.util.HashMap;
import java.util.Map;

public class CloudStorage implements Storage {

    private final Map<String, Media> storageMediaMap = new HashMap<>();

    @Override
    public void save(Media media) {
        storageMediaMap.put(media.getTitle(), media);
        System.out.println(media.getTitle() + " guardado en el almacenamiento en nube");
    }

    @Override
    public Media load(String title) {
        System.out.println("Cargando " + title + " del almacenamiento en nube");
        return storageMediaMap.get(title);
    }
}
