package com.facedook.video;

import com.facedook.AbstractLikeService;
import com.facedook.utils.RandomString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hazem
 */
public class VideoService extends AbstractLikeService<Video> {
    private final Map<String, Video> videos = new HashMap<>();

    public Video create(String title, String url) {
        final Video video = new Video();
        video.setId(new RandomString().nextString());
        video.setTitle(title);
        video.setUrl(url);
        videos.put(video.getId(), video);
        return video;
    }

    public void removeVideo(String id) {
        // check id existence
        findById(id);
        // remove video
        videos.remove(id);
    }

    public void watch(String id) {
        final Video video = findById(id);
        System.out.println(video.toString());
    }

    @Override
    public Map<String, Video> findAll() {
        return videos;
    }
}
