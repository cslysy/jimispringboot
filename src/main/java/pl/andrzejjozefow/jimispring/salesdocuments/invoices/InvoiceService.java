package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

  private List<Invoice> invoices = new ArrayList<>(Arrays.asList(
      new Invoice("biedronka", "masło extra", 123344, 1234565) ,
      new Invoice("lidl", "masło extra", 123344, 1234565),
      new Invoice("zabka", "masło extra", 123344, 1234565)
  ));

  public List<Invoice> getAllInvoices(){
    return invoices;
  }

  public Invoice getInvoice(String id){
    return invoices.stream().filter(t -> t.getNabywca().equals(id)).findFirst().get();
  }

  public void addInvoice(Invoice topic) {
    invoices.add(topic);
  }

}
