package bursh.com.musicService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bursh.com.musicService.models.entities.Artist;
import bursh.com.musicService.repositories.ArtistRepository;
import bursh.com.musicService.utils.ArtistNotFoundException;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;
    
    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists(){
        return artistRepository.findAll();
    }

    public Artist getArtistByNickName(String username){
        return artistRepository.findByNickName(username)
                .orElseThrow(() -> new ArtistNotFoundException("Artits with this username dose not exist"));
    }

    public Artist getArtistByTrack(String trackTitle){
        return artistRepository.findByTrack(trackTitle)
                .orElseThrow(() -> new ArtistNotFoundException("Artist with " + trackTitle + "dose not exist"));
    }

    public Artist getArtistById(int id){
        return artistRepository.findById(id)
                .orElseThrow(() -> new ArtistNotFoundException("Artist with id = " +id + "dose not exist"));
    }
}
