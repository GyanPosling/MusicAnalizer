package bursh.com.musicService.models.dto;

import java.util.List;

import bursh.com.musicService.models.entities.Album;
import bursh.com.musicService.models.entities.Artist;
import bursh.com.musicService.models.entities.Track;

public class UserDTO {
    private int id;
    private String username;
    private List<Track> topTracks;
    private List<Artist> topArtists;
    private List<Album> albums;
}