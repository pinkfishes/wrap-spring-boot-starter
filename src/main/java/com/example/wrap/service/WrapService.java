package com.example.wrap.service;

/**
 * @description:
 * @author: qinhy
 * @createDate: 2022/8/18 下午11:55
 * @version: 1.0
 */

public class WrapService {
    private String prefix;
    private String suffix;

    public WrapService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrapStr(String word){
        return prefix+word+suffix;
    }
}
