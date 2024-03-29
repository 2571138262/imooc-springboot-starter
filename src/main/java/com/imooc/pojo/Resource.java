package com.imooc.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
// 代表当前类是会引用资源文件的
@Configuration
// 前缀
@ConfigurationProperties(prefix = "com.imooc.opensource")
// 资源文件的地址
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;
    private String website;
    private String language;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String webSite) {
        this.website = webSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
