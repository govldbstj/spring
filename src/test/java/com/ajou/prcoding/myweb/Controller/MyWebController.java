package com.ajou.prcoding.myweb.Controller;

import com.ajou.prcoding.myweb.dto.MusicList;
import com.ajou.prcoding.myweb.repository.FavoriteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;


@RestController
public class MyWebController {
    @Autowired
    FavoriteRepository albumsRepo;
    RestTemplate restTemplate = new RestTemplate();

    /*@GetMapping(value="/musicSearch")
    public String musicSearchByPath(@PathVariable String term){
        //node.js에서 fetch해서 url 가지고 와서,
        //쳐기 -v로 봤을 때 app 접속한 결과 가지고 왔으면 application ~>
        return "MusicSearch";}*/

    @GetMapping(value="/musicSearch")
    public MusicList musicSearchByParam(@RequestParam String term){

        try{

            String response = restTemplate.getForObject("https://itunes.apple.com/search?term="+term+"&entity=album", String.class);

            ObjectMapper mapper = new ObjectMapper();

            MusicList list = mapper.readValue(response, MusicList.class);


            System.out.println(list.getResultCount());

            return list;

        } catch(IOException e) {

            System.out.println(e.toString());

        }
        return null;
    }

    @GetMapping(value="/likes")
    public List<FavoriteMusic> getLikes() {
        try{
            return albumsRepo.findAll();
        } catch(Exception e){
            System.out.println(e.toString());
            return null;
        }

    }
}