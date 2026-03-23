package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/artists")
public class ArtistController {
    private ArtistService server;

    public ArtistController(ArtistService server) {
        this.server = server;
    }
    @GetMapping()
    public List<Artist> getAll(){
        return server.getAllArtists();
    }
    @GetMapping("/{id}")
    public Artist getById(@PathVariable long id){
        return server.getArtistById(id);
    }
    @PostMapping()
    public Artist createByArtist(@RequestBody ArtistRequest a){
        return server.createArtist(a);
    }
    @PutMapping("/{id}")
    public Artist upadateAnArtist( @PathVariable long id,@RequestBody ArtistRequest a){
        return server.updateArtist(id,a);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArtistByID(@PathVariable long id){
        server.deleteArtist(id);
        return;
    }

}
