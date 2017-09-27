package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

  @Autowired
  private InvoiceRepository invoiceRepository;


  public List<Invoice> getAllInvoices(){
    List<Invoice> invoices = new ArrayList<>();
    invoiceRepository.findAll()
        .forEach(invoices::add);
    return invoices;
  }

  public Invoice getInvoice(Integer id){
    return invoiceRepository.findOne(id);
  }

  public void addInvoice(Invoice invoice) {

    invoiceRepository.save(invoice);
  }

}
