package com.ajou.prcoding.myweb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class MusicList {
    public String artistName;
    private Integer resultCount;
    private List<Map<String, Object>> results;
}