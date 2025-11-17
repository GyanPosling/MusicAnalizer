package bursh.com.musicService.models.dto;

import bursh.com.musicService.models.entities.Album;
import bursh.com.musicService.models.entities.Artist;
import bursh.com.musicService.models.enums.TrackGenre;
import lombok.Data;

@Data
public class TrackDTO {
    private int id;
    private String title;
    private Artist artist;
    private Album album;
    private TrackGenre genre;
}