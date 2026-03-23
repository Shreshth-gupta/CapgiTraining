package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;
import com.music.streaming.platform.service.impl.PlayListServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {
    private PlayListService server;
    public PlayListController(PlayListService server) {
        this.server = server;
    }

    @PostMapping
    public PlayList createPlayList(PlayListRequest p){
        return server.createPlayList(p);
    }

    @GetMapping("/{id}")
    public PlayList getById(@PathVariable Long id){
        return server.getPlayListById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long id){
        server.deletePlayList(id);
        return;
    }
}
