/**
 * Oefening voor TDD: queue
 * Een queue implementeert een wachtrij waar achteraan elementen kunnen toegevoegd worden en het voorste element kan worden afgenomen.
 */
public class Queue {
    //private Integer element=null; //b)
    //private Integer[] elements= new Integer[1024]; //d)
    /**
     * Bewaart alle elementen in de queue
     */
    private final Integer[] elements; //e)
    /**
     * verwijst naar de plaats in elements waar het volgende element moet bewaard worden bij een store
     * store(5) => elements[nextIndexForStoring]=5
     */
    private int nextIndexForStoring=0; //d
    /**
     * verwijst naar de plaats in elements waar het element is dat de volgende release() teruggeeft
     * release() => return elements[nextIndexToRelease]
     */
    private int nextIndexToRelease=0; //d

    /**
     * Maakt een queue voor i elements
     * @param max maximum aantal elementen
     */
    public Queue(int max) {  //e)
        elements=new Integer[max];
    }

    /**
     * Maakt een queue voor 5 elementen
     */
    public Queue() { //e)
        this(5);  //indien geen waarde opgegeven is de default 5
    }

    /**
     * Bewaart een extra element achteraan in de queue
     * @param el element om te bewaren
     */
    public void store(Integer el) {  //a)
        // no statements yet. We hebben geen extra code nodig buiten een lege functie   a)
        //element=el;  //b)
        if(nextIndexForStoring==elements.length) return; //e2)   VOL! we kunnen geen extra elementen meer toevoegen
        elements[nextIndexForStoring++]=el; //d)
    }

    /**
     * Geeft het volgende element vooraan in de queue. Dit element is daarna niet meer beschikbaar.
     * @return het element vooraan in de queue
     */
    public Integer release() { //b)
        //return element; // b)
        //Integer res=element; //c)
        //element=null;   //c)
        if(nextIndexToRelease==elements.length) return null; //e3)  alles is al gereleased! We kunnen niets meer releasen
        Integer res=elements[nextIndexToRelease++]; //d)
        return res; //c)
    }


}


