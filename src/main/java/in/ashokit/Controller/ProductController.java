package in.ashokit.Controller;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value="/getProduct" ,produces = {"application/json"})
    public Product getfindByProductId(@RequestParam("pid") String pid){
        return productService.findByProductId(Integer.parseInt(pid));
    }
}
