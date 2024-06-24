package org.example2;

public class Main {
    public static void main(String[] args) {
        Storage localStorage = new LocalStorage();
        Storage cloudStorage = new CloudStorage();
        MediaManager advancedMediaManager = new AdvancedMediaManager(localStorage);
        MediaManager simpleMediaManager = new SimpleMediaManager(cloudStorage);
        Media song = new Music("Cancion");
        Media video = new Video("Pelicula");

        /*Guardando data en el administrador avanzado*/
        advancedMediaManager.saveMedia(song);
        advancedMediaManager.saveMedia(video);

        /*Se valida para poder usar las caracteristicas avanzadas de una lista de reproducción*/
        if (advancedMediaManager instanceof PlayListFeatures) {
            PlayListFeatures playListFeatures = (PlayListFeatures) advancedMediaManager;
            playListFeatures.addToPlayList(song);
            playListFeatures.addToPlayList(video);
            playListFeatures.playPlayList();
        }

        /*Guardando la misma data pero en el administrador simple*/
        simpleMediaManager.saveMedia(song);
        simpleMediaManager.saveMedia(video);

        simpleMediaManager.printMediaInfo("Cancion");
        simpleMediaManager.printMediaInfo("Pelicula");
        simpleMediaManager.printMediaInfo("Peliculaaaaaaaaaaaaaaaaaa");

        simpleMediaManager.loadMedia("Cancion");
        simpleMediaManager.loadMedia("Pelicula");

    }
}
