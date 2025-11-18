package bursh.com.musicService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import bursh.com.musicService.models.entities.Track;
import bursh.com.musicService.models.enums.TrackGenre;
import bursh.com.musicService.models.enums.TrackType;
import bursh.com.musicService.repositories.TrackRepository;
import bursh.com.musicService.utils.TrackNotFoundException;

@Service
public class TrackService {

    private final TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    public List<Track> getAllTracks(){
        return trackRepository.findAll();
    }

    public Track getTrackByTitle(String title){
        return trackRepository.findByTitle(title)
                .orElseThrow(() -> new TrackNotFoundException("Track with '" + title +"' dose not exist"));
    } 

    public List<Track> getTracksByAlbum(String albumTitle){
        return trackRepository.findByAlbum(albumTitle);
    }

    public List<Track> getTracksByGenre(TrackGenre trackGenre){
        return trackRepository.findByGenre(trackGenre);
    }

    public List<Track> getTracksByType(TrackType trackType){
        return trackRepository.findByType(trackType);
    }
    
}
