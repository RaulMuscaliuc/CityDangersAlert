package datc2020.proiect.CityDangersAlert.dto;

import javax.persistence.*;

@Entity
@Table(name = "alerte")
public class Alerte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nume;
    private String descriere;
    private float x;
    private float y;
    private Tip tip;
    private long utilizator_id;

    public Alerte(long id, String nume, String descriere, float x, float y, Tip tip, long utilizator_id) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.x = x;
        this.y = y;
        this.tip = tip;
        this.utilizator_id = utilizator_id;
    }

    public Alerte() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public long getUtilizator_id() {
        return utilizator_id;
    }

    public void setUtilizator_id(long utilizatorId) {
        this.utilizator_id = utilizatorId;
    }

    @Override
    public String toString() {
        return "Alerte{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", tip=" + tip +
                ", utilizatorId=" + utilizator_id +
                '}';
    }
}
