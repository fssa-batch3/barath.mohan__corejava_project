package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestRemoveDuplicateArrayList {

    @Test
    public void testRemoveDuplicateCity() {
        List<String> cityList = RemoveDuplicateArrayList.createCityList();

        List<String> newCityList = RemoveDuplicateArrayList.removeDuplicateCity(cityList);

        // Ensure that the method correctly removes duplicate cities
        List<String> expectedCityList = new ArrayList<String>();
        expectedCityList.add("Chennai");
        expectedCityList.add("Mumbai");
        expectedCityList.add("Bangalore");
        assertEquals(expectedCityList, newCityList);
    }

    @Test 
    public void testRemoveDuplicateCityWithEmptyList() {
        List<String> cityList = new ArrayList<String>();

        List<String> newCityList = RemoveDuplicateArrayList.removeDuplicateCity(cityList);

        // Ensure that the method correctly handles an empty list
        assertTrue(newCityList.isEmpty());
    }

    @Test
    public void testRemoveDuplicateCityWithNoDuplicates() {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Bangalore");

        List<String> newCityList = RemoveDuplicateArrayList.removeDuplicateCity(cityList);

        // Ensure that the method returns the same list when there are no duplicates
        assertEquals(cityList, newCityList);
    }

}
