package domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class BlogPost extends PanacheEntity {

    private String title;
    private String content;
    private String created;
    private boolean highlighted = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean getHighlighted() {
        return highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }
}
