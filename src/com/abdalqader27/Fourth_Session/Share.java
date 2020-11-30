package com.abdalqader27.Fourth_Session;

public class Share {
 private   int score=0;
 private boolean tag1Inside;
 private boolean tag2Inside;
    void increment(){
        score++;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTag1Inside(boolean tag1Inside) {
        this.tag1Inside = tag1Inside;
    }

    public void setTag2Inside(boolean tag2Inside) {
        this.tag2Inside = tag2Inside;
    }

    public int getScore() {
        return score;
    }

    public boolean isTag1Inside() {
        return tag1Inside;
    }

    public boolean isTag2Inside() {
        return tag2Inside;
    }
}
