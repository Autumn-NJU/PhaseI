package com.utag.phase1.domain;

import java.util.List;
import java.util.Map;

public class Task {
    /**
     * 任务id
     */
    private int id;

    /**
     * 任务中图片路径和对应奖励？待修改
     */
    private Map<String, Double> pictureMap;

    public Task() {
    }

    public Task(int id, Map<String, Double> pictureMap) {
        this.id = id;
        this.pictureMap = pictureMap;
    }

    public int getId() {
        return id;
    }


    public Map<String, Double> getPictureMap() {
        return pictureMap;
    }

    public void setPictureMap(Map<String, Double> pictureMap) {
        this.pictureMap = pictureMap;
    }
}
