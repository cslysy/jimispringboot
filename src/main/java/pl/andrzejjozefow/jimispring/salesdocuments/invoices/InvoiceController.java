package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

  @Autowired
  private InvoiceService invoiceService;

  @RequestMapping("/invoices")
  public List<Invoice> getAllTopics() {
    return invoiceService.getAllInvoices();
  }

  @RequestMapping("/invoices/{nabywca}")
  public Invoice getInvoice(@PathVariable String nabywca) {
    return invoiceService.getInvoice(nabywca);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/topics")
  public void addInvoice(@RequestBody Invoice invoice) {
    invoiceService.addInvoice(invoice);
  }



}
