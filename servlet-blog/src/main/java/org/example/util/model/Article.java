package org.example.util.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 文章的实体类
 */
@ToString
@Setter
@Getter
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date createTime;
    private  Integer viewCount;
    private Integer userId;

}
