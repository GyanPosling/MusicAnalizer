package bursh.com.musicService.repositories;

import bursh.com.musicService.models.entities.Artist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import bursh.com.musicService.models.entities.Track;



public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Optional<Artist> findByNickName(String nickName);
    Optional<Artist> findByTracks(List<Track> tracks);
}
