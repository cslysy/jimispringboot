package pl.andrzejjozefow.jimispring.salesdocuments.invoices;

import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
