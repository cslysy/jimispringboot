package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import javax.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Invoice {

  @Id
  private Integer id;
  private String nabywca;
  private String tytul;
  private int kwota;
  private int nip;

  public Invoice() {
  }

  public Invoice(Integer id, String nabywca, String tytul, int kwota, int nip) {
    this.id = id;
    this.nabywca = nabywca;
    this.tytul = tytul;
    this.kwota = kwota;
    this.nip = nip;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNabywca() {
    return nabywca;
  }

  public void setNabywca(String nabywca) {
    this.nabywca = nabywca;
  }

  public String getTytul() {
    return tytul;
  }

  public void setTytul(String tytul) {
    this.tytul = tytul;
  }

  public int getKwota() {
    return kwota;
  }

  public void setKwota(int kwota) {
    this.kwota = kwota;
  }

  public int getNip() {
    return nip;
  }

  public void setNip(int nip) {
    this.nip = nip;
  }
}