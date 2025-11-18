package bursh.com.musicService.repositories;

import bursh.com.musicService.models.entities.Album;
import bursh.com.musicService.models.entities.Artist;
import bursh.com.musicService.models.entities.Track;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import bursh.com.musicService.models.enums.TrackGenre;
import bursh.com.musicService.models.enums.TrackType;




public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findByArtist(Artist artist);
    Optional<Track> findByTitle(String title);
    List<Track> findByAlbum(String albumTitle);
    List<Track> findByGenre(TrackGenre genre);
    List<Track> findByType(TrackType type);
}
