package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import org.springframework.data.annotation.Id;

public class Invoice {

  @Id
  private String nabywca;
  private String tytul;
  private int kwota;
  private int nip;

  public Invoice() {
  }

  public Invoice(String nabywca, String tytul, int kwota, int nip) {
    this.nabywca = nabywca;
    this.tytul = tytul;
    this.kwota = kwota;
    this.nip = nip;
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