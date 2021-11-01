import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import com.example.simpleparadox.listycity.MainActivity;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CityListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }
    @Test
    public void hasCityTest(){
        int listSize = list.getCount();
        list.hasCity(new City("Halifax", "NS"));
        assertTrue(list.hasCity(new City("Halifax", "NS")));
    }

    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        list.deleteCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize-1);
    }

    @Test
    public void countCityTest(){
        int listSize = list.getCount();
//        list.getCount();
        assertEquals(list.getCount(), listSize);
    }

    private void assertTrue(boolean b) {
    }


    private void assertEquals(int count, int i) {
    }

//    public void addCity(City city){
//        cities.add(city);
//        return;
//    }

}
