package com.raysmond.blog.services;

import com.domingosuarez.boot.autoconfigure.jade4j.JadeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Raysmond
 */
@JadeHelper("App")
@Service
public class AppSetting {

    private SettingService settingService;

    private String siteName = "SpringBlog";
    private String siteSlogan = "An interesting place to discover";
    private Integer pageSize = 5;

    private static final String SITE_NAME = "site_name";
    private static final String SITE_SLOGAN = "site_slogan";
    private static final String PAGE_SIZE = "page_size";

    @Autowired
    public AppSetting(SettingService settingService) {
        this.settingService = settingService;
    }

    public String getSiteName() {
        return (String) settingService.get(SITE_NAME, siteName);
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
        settingService.put(SITE_NAME, siteName);
    }

    public Integer getPageSize() {
        return (Integer) settingService.get(PAGE_SIZE, pageSize);
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        settingService.put(PAGE_SIZE, pageSize);
    }

    public String getSiteSlogan() {
        return (String) settingService.get(SITE_SLOGAN, siteSlogan);
    }

    public void setSiteSlogan(String siteSlogan) {
        this.siteSlogan = siteSlogan;
        settingService.put(SITE_SLOGAN, siteSlogan);
    }
}
