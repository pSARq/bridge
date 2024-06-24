package org.example2;

public interface Storage {
    void save(Media media);
    Media load(String title);
}
