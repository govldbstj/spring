package com.ajou.prcoding.myweb.dto;

import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
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
    public int count;
    private Integer resultCount;
    private List<Map<String, Object>> results;
}