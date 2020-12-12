package com.example.thecoffeehouse;

public class thongbao {
    private int image;
    private String texttb;
    private String tg;

    public thongbao(int image, String texttb, String tg) {
        this.image = image;
        this.texttb = texttb;
        this.tg = tg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTexttb() {
        return texttb;
    }

    public void setTexttb(String texttb) {
        this.texttb = texttb;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }
}
