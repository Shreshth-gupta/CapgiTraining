package com.music.streaming.platform.controller;


import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
    private TrackService server;

    public TrackController(TrackService server) {
        this.server = server;
    }

    @PostMapping
    public Track createTracks(@RequestBody TrackRequest t){
        return server.createTrack(t);
    }
    @GetMapping
    public List<Track> getAllTrack(){
        return  server.getAllTracks();
    }
    @GetMapping("/{id}")
    public Track GetById(@PathVariable long id){
        return server.getTrackById(id);
    }
    @PutMapping("/{id}")
    public Track UpdateTrack(@PathVariable long id,@RequestBody TrackRequest t){
        return server.updateTrack(id,t);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void DeleteTrack(@PathVariable long id){
        server.deleteTrack(id);
        return;
    }
}
