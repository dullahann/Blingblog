package domain;

import java.util.Date;

public class Article {
    private String aid;
    private String title;
    private Date time;
    private String type;
    private int read_time;
    private String summary;
    private String content;
    private String name;
    private int recommend;

    public String getAid() { return aid; }
    public void setAid(String aid) { this.aid = aid; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Date getTime() { return time; }
    public void setTime(Date time) { this.time = time; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getRead_time() { return read_time; }
    public void setRead_time(int read_time) { this.read_time = read_time; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRecommend() { return recommend; }
    public void setRecommend(int recommend) { this.recommend = recommend; }
}
