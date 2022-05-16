package intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedIntListTest {

    int[] values = {5,4,3,2,1,8,9,};
    int[] sortedValues = {1,2,3,4,5,8,9,};
    SortedIntList list;

    private void addAllValues(){
        for(int value : values){
            list.add(value);
        }
    }

    @BeforeEach
    public void setup(){
        list = new SortedIntList();
    }

    @Test
    void remove_WithValuesAdded_AllSortedValuesReturned() {
        // Arrange
        addAllValues();

        // Act

        // Assert
        for(int value : sortedValues) {
            assertEquals(value, list.remove(0));
        }
    }

    @Test
    void findMin_WithoutAddedValues_ReturnsNull() {
        // Act
        Integer min = list.findMin();

        // Assert
        assertNull(min);
    }

    @Test
    void findMin_WithAddedValues_ReturnsLowest1() {
        // Arrange
        addAllValues();

        // Act
        Integer min = list.findMin();

        // Assert
        assertEquals(1, min);
    }
}