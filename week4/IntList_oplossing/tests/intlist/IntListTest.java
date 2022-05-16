package intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntListTest {

    int[] values = {5,4,3,2,1,8,9,};
    IntList list;

    private void addAllValues(){
        for(int value : values){
            list.add(value);
        }
    }

    @BeforeEach
    public void setup(){
        list = new IntList();
    }

    @Test
    void remove_WithValuesAdded_AllValuesReturnedInOrder() {
        // Arrange
        addAllValues();

        // Act

        // Assert
        for(int value : values) {
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