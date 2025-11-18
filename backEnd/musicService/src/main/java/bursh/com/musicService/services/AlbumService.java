package bursh.com.musicService.services;

import java.util.List;

import org.springframework.stereotype.Service;
import bursh.com.musicService.controllers.AlbumController;
import bursh.com.musicService.models.entities.Album;
import bursh.com.musicService.repositories.AlbumRepository;
import bursh.com.musicService.utils.AlbumNotFoundException;

@Service
public class AlbumService{

    private final AlbumController albumController;

    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository, AlbumController albumController){
        this.albumRepository = albumRepository;
        this.albumController = albumController;
    }

    public List<Album> getAllAlbums(){
        return albumRepository.findAll();
    }

    public Album getAlbumByAlbumTitle(String albumTitle){
        return albumRepository.findByTitle(albumTitle)
                .orElseThrow(() -> new AlbumNotFoundException("Album with title = '" + albumTitle + "' dose not exist"));
    }

    public Album getAlbumById(int id){
        return albumRepository.findById(id)
                .orElseThrow(() -> new AlbumNotFoundException("Album with id = " + id + " dose not exist"));
    }

    public List<Album> getAlbumByUser(String username){
        return albumRepository.findByUsername(username);
    }

    public void updateAlbum(Album updateAlbum){
        Album albumToUpdate = new Album();
        albumToUpdate.setId(updateAlbum.getId());
        albumToUpdate.setTitle(updateAlbum.getTitle());
        albumToUpdate.setTracks(updateAlbum.getTracks());
        albumToUpdate.setUser(updateAlbum.getUser());
    }

    public void saveAlbum(Album album){
        albumRepository.save(album);
    }

    public void deleteAlbum(int id){
        Album album = getAlbumById(id);
        albumRepository.delete(album);
    }


}