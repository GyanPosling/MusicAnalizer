package bursh.com.musicService.repositories;

import bursh.com.musicService.models.entities.Artist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Optional<Artist> findByNickName(String nickName);
    Optional<Artist> findByTrack(String trackTitle);
    Optional<Artist> findById(int id);
}
