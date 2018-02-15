package com.facedook.video;

import com.facedook.AbstractLikeService;
import com.facedook.utils.RandomString;
import com.sun.deploy.util.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hazem
 */
public class VideoService extends AbstractLikeService<Video> {
    private final Map<String, Video> videos = new HashMap<>();

    public Video create(String title, String url) {
        if (StringUtils.trimWhitespace(title) == null || StringUtils.trimWhitespace(title).equals("")) {
            System.err.println("Video title should not be empty");
            return null;
        }

        // check url validity
        try {
            new URL(url);
        } catch (MalformedURLException e) {
            System.err.println("Invalid video Url");
            e.printStackTrace();
            return null;
        }

        final Video video = new Video();
        video.setId(new RandomString().nextString());
        video.setTitle(title);
        video.setUrl(url);
        videos.put(video.getId(), video);
        return video;
    }

    @Override
    public Map<String, Video> findAll() {
        return videos;
    }
}
