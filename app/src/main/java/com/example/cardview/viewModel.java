package com.example.cardview;

public class viewModel {
    private String tilte;
    private int image;

    public viewModel(String tilte, int image) {
        this.tilte = tilte;
        this.image = image;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
