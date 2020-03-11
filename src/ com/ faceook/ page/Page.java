package com.facedook.page;

import com.facedook.Likable;

/**
 * @author hazem
 */
public class Page implements Likable {
    private String id;
    private String name;
    private String description;
    private int followers;
    private int likes;
    private int dislikes;

    @Override
    public String getId() {
        return id;
    }

    void setId(String id) {https://www.facebook.com/profile.php?id=100042967531923

        this.id = id;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void follow() {
        followers++;
    }

    void unfollow() {
        if (followers > 0)
            followers--;
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
        final StringBuilder sb = new StringBuilder("Join our page  ");
        sb.append('\'').append(name).append('\'');
        sb.append("\n");
        sb.append("Description: ").append('\'').append(description).append('\'');
        sb.append("\n");
        sb.append(" Likes: '").append(likes).append('\'');
        sb.append(", dislikes: '").append(dislikes).append('\'');
        sb.append("\n");
        sb.append(" Followers: '").append(followers).append('\'');
        return sb.toString();
    }
}
