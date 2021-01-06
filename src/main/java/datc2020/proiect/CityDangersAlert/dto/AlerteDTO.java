package datc2020.proiect.CityDangersAlert.dto;

public class AlerteDTO {
    private String nume;
    private String descriere;
    private Tip tip;
    private String[] pictures;
    private float x;
    private float y;

    public AlerteDTO() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
