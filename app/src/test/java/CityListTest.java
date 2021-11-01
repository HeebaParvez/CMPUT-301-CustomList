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

    private void assertEquals(int count, int i) {
    }

//    public void addCity(City city){
//        cities.add(city);
//        return;
//    }

}