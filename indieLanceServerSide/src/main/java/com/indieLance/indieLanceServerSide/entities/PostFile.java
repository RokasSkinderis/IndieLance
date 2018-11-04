package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;

@Entity
public class PostFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    Post post;

    @OneToOne
    @JoinColumn(name = "file_id")
    File file;

    public PostFile(Post post, File file) {
        this.post = post;
        this.file = file;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
