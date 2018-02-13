package com.facedook.video;

import com.facedook.Likable;

/**
 * @author hazem
 */
public class Video implements Likable {
    private String id;
    private String title;
    private String url;
    private int likes;
    private int dislikes;

    @Override
    public String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void like() {
        likes++;
    }

    @Override
    public void dislike() {
        dislikes++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Enjoy Watching ");
        sb.append('\'').append(title).append('\'');
        sb.append("\n");
        sb.append("url: ").append('\'').append(url).append('\'');
        sb.append("\n");
        sb.append(" Likes: '").append(likes).append('\'');
        sb.append(", dislikes: '").append(dislikes).append('\'');
        return sb.toString();
    }
}
