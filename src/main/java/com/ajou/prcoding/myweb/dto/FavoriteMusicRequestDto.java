package com.ajou.prcoding.myweb.dto;

import com.ajou.prcoding.myweb.Entity.FavoriteMusic;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
public class FavoriteMusicRequestDto {
    private String collectionId;
    private String collectionType;
    private String artistId;
    private String artistName;
    private String artistViewUrl;
    private String collectionName;
    private String collectionViewUrl;

    public FavoriteMusic toEntity() {
        FavoriteMusic music = new FavoriteMusic();
        music.setCollectionId(this.collectionId);
        music.setCollectionType(this.collectionType);
        music.setArtistId(this.artistId);
        music.setArtistName(this.artistName);
        music.setArtistViewUrl(this.artistViewUrl);
        music.setCollectionName(this.collectionName);
        music.setCollectionViewUrl(this.collectionViewUrl);
        return music;
    }
}