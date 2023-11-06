import org.example.Product;
import org.example.Warehouse;
import org.example.WarehouseManager;
import org.junit.Test;

public class WarehouseMangerTests {

    @Test
    public void testAddNewWarehouse(){
        var warehouseManager = new WarehouseManager();

        var warehouse = new Warehouse(1, "Kista");

        warehouseManager.addNewWarehouse(warehouse);
        assert  warehouseManager.getAllWarehouses().size() == 1;
    }
    @Test
    public void addProductToWarehouse(){
        var warehouseManager = new WarehouseManager();
        var warehouse = new Warehouse(1, "Kista");
        var product = new Product(1,"product", 10,"Its ok");


        warehouseManager.addNewWarehouse(warehouse);
        warehouseManager.addProductToWarehouse(1,product);
warehouse = warehouseManager.getWarehouseById(1);
assert warehouse.getAllProduct().size() == 1;

    }
}
