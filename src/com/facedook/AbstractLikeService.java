package com.facedook;

import com.facedook.utils.CustomFacedookException;

import java.util.Map;

/**
 * @author hazem
 */
public abstract class AbstractLikeService<T extends Likable> {
    public void like(String id) {
        findById(id).like();
    }

    public void dislike(String id) {
        findById(id).dislike();
    }

    protected T findById(String id) {
        final Map<String, T> likableMap = findAll();
        if (!likableMap.containsKey(id)) {
            throw new CustomFacedookException("Element Not found");
        }
        return likableMap.get(id);
    }

    public abstract Map<String, T> findAll();
}
