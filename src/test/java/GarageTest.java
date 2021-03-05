import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GarageTest {

    @ParameterizedTest
    @ValueSource(ints = {10,100,1000,250})
    void constructor(int i){
        Garage garage = new Garage(i);
        assertEquals(i,garage.getAreaSize());
    }

    @Test
    void getAreaAvailableWhenGarageIsEmpty(){
        Garage garage = new Garage(100);
        assertEquals(100,garage.getAreaAvailable());
    }
    @Test
    void getAreaAvailableWhenGarageIsFull(){
        Garage garage = new Garage(100);
        garage.addVehicle(new Car(null,0,0,0,null,100,0));
        assertEquals(0,garage.getAreaAvailable());
    }
    @Test
    void getAreaUsedWhenGarageIsEmpty(){
        Garage garage = new Garage(100);
        assertEquals(0,garage.getAreaUsed());
    }
    @Test
    void getAreaUsedWhenGarageIsFull(){
        Garage garage = new Garage(100);
        garage.addVehicle(new Car(null,0,0,0,null,100,0));
        assertEquals(100,garage.getAreaUsed());
    }
    @Test
    void addehicleWhenThereIsEnoughSpace(){
        Garage garage = new Garage(100);
        assertTrue(garage.addVehicle(new Car(null,0,0,0,null,100,0)));
    }

    @Test
    void addehicleWhenThereIsNotEnoughSpace(){
        Garage garage = new Garage(100);
        garage.addVehicle(new Car(null,0,0,0,null,100,0));
        assertFalse(garage.addVehicle(new Car(null,0,0,0,null,100,0)));
    }

}
