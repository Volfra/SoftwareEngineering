package co.edu.poli.iterator.model;

/**
 * 
 */
public class Collection implements Container {

    /**
     * 
     */
    public Object [ ] objs;

	
    /**
     * Default constructor
     */
    public Collection(Object[] o) {
    	
    	objs = o;
    }

    /**
     * @return
     */
    public Iterator getIterator() {
        return new CollectionIterate();
    }

    /**
     * 
     */
    private class CollectionIterate implements Iterator {

        /**
         * 
         */
        public int i;

        /**
         * @return
         */
        public Object next() {
        	if (this.hasNext())
        		return objs[i++];
        	return null;
        }

        /**
         * @return
         */
        public boolean hasNext() {
            if (i < objs.length)
            	return true;
            else
            	return false;
        }

    }

}