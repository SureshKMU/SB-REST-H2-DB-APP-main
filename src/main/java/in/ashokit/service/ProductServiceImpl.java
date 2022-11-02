package in.ashokit.service;

import in.ashokit.Exception.NoProductFoundException;
import in.ashokit.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product findByProductId(Integer pid) {
        {
            if (pid == 101) {
                return new Product("101", "mouse", 21.21);
            } else {
                throw new NoProductFoundException("no PRoduct Found");
            }
        }

    }
}
