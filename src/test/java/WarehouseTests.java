
import org.example.Product;
import org.example.Warehouse;
import org.junit.Assert.*;
import org.junit.Test;

public class WarehouseTests {
    @Test
    public void testSerLocationConstructor(){
        var warehouse = new Warehouse(1, "kista");

        assert   warehouse.getLocation().equals("kista");

    }


    @Test
    public void testSetLocation(){
        var warehouse = new Warehouse(1, "kista");
      warehouse.setLocation("kista");

        assert   warehouse.getLocation().equals("kista");


    }

    @Test
    public void testAddProduct(){
        var warehouse = new Warehouse(1,"Kista");

        var p1 = new Product(1, "Iphone", 10, "Exclusive phone");

        warehouse.addProduct(p1);
        assert warehouse.getAllProduct().size() == 1;
        assert warehouse.getAllProduct().getFirst().getId() == 1;
    }

    @Test
    public void testRemoveProductById(){
        var wh = new Warehouse(1, "Kista");

        var p1 = new Product(1, "Iphone", 10, "Exclusive phone");
        var p2 = new Product(2, "Juice", 5, "Exclusive Juice");
        var p3 = new Product(1, "Iphone", 10, "Exclusive phone");
        wh.addProduct(p1);
        wh.addProduct(p2);
        wh.addProduct(p3);

        wh.removeProductById(1);

        assert wh.getAllProduct().size() == 2;
        assert wh.getAllProduct().getFirst().getId() == 2;
    }

}
