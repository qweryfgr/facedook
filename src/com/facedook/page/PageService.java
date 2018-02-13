package com.facedook.page;

import com.facedook.AbstractLikeService;
import com.facedook.utils.RandomString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hazem
 */
public class PageService extends AbstractLikeService<Page> {
    private final Map<String, Page> pages = new HashMap<>();

    public Page create(String pageName) {
        final Page page = new Page();
        page.setId(new RandomString().nextString());
        page.setName(pageName);
        pages.put(page.getId(), page);
        return page;
    }

    public Page create(String name, String description) {
        final Page page = new Page();
        page.setId(new RandomString().nextString());
        page.setName(name);
        page.setDescription(description);
        pages.put(page.getId(), page);
        return page;
    }

    public void follow(String id) {
        final Page page = findById(id);
        page.follow();
    }

    public void unfollow(String id) {
        final Page page = findById(id);
        page.unfollow();
    }

    @Override
    public Map<String, Page> findAll() {
        return pages;
    }
}
