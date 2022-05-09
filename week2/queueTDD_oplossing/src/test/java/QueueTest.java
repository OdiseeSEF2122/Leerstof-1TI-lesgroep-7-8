import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void store_1Element_doesntThrow() {  //a)
        Queue qu=new Queue(); //Arrange
        try {
            qu.store(5);   //Action
        } catch (Exception e) {
            assertFalse(true,"Oh noes! constructor returns "+e.getMessage());  //Assert
        }
        //assertDoesNotThrow(() -> qu.store(5));   //Alternatief: test expliciet of een store geen exception throwed
    }

    @Test
    void release_storedElement_returnsSameElement() {  //b)
        Queue qu=new Queue(); //Given
        qu.store(5);
        Integer r= qu.release(); //When
        assertEquals(5,r); //Then
    }

    @Test
    void release_givenNoStoredElement_returnsNull() {  //c)
        Queue qu=new Queue(); //Arrange
        qu.store(2);
        qu.release(); //Now the queue should be empty
        Integer r=qu.release();        //Action
        assertNull(r); //Assert
    }

    @Test
    void store_givenMultipleElements_preservesOrder() {  //d)
        Queue qu=new Queue();   //Arrange
        qu.store(2);
        qu.store(3);
        qu.release();
        Integer r=qu.release(); //Action to test
        assertEquals(3,r);  //Assert
    }

    @Test
    void queue_givenMaxCapacity3_doesntThrow() {//e)
        Queue qu; //Arrange
        try {
            qu=new Queue(3);   //Action
        } catch (Exception e) {
            assertFalse(true,"Oh noes! constructor returns "+e.getMessage());  //Assert
        }
        // assertDoesNotThrow(() -> new Queue(3));  //Alternative test
    }

    @Test
    void store_moreElementsThenMax_doesntRetainSuperfluousElements() {//e2) edge case: storing an extra element when queue is full
        Queue qu=new Queue(3);
        qu.store(1);
        qu.store(2);
        qu.store(3);
        qu.store(4);   //1 element beyond max capacity

        Integer r1=qu.release();
        Integer r2=qu.release();
        Integer r3=qu.release();

        assertEquals(1,r1);  //Assert the correct elements are returned
        assertEquals(2,r2);
        assertEquals(3,r3);
    }
    @Test
    void release_moreElementsThenMax_returnsNull() {//e3) edge case: releasing when max queue is already emptied
        Queue qu=new Queue(3);
        qu.store(1);
        qu.store(2);
        qu.store(3);
        qu.release();qu.release();qu.release();

        Integer r=qu.release();   //1 element released that was not stored

        assertNull(r);
    }

}
