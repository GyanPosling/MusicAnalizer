package bursh.com.musicService.models.entities;

import bursh.com.musicService.models.enums.TrackGenre;
import bursh.com.musicService.models.enums.TrackType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tracks")
@Data
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "artistId")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "userId")
    

    @Enumerated(EnumType.STRING)
    private TrackGenre genre;

    @Enumerated(EnumType.STRING)
    private TrackType type;                                                                                                                                                             

}
