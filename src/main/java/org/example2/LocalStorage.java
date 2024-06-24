package org.example2;

import java.util.HashMap;
import java.util.Map;

public class LocalStorage implements Storage {

    private final Map<String, Media> storageMediaMap = new HashMap<>();

    @Override
    public void save(Media media) {
        storageMediaMap.put(media.getTitle(), media);
        System.out.println(media.getTitle() + " guardado en almacenamiento local");
    }

    @Override
    public Media load(String title) {
        System.out.println("Cargando " + title + " del almacenamiento local");
        return storageMediaMap.get(title);
    }
}
