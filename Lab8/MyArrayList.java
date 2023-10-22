public class MyArrayList implements MyList{
    private Object[] data;
    
    public MyArrayList(){
        data = new Object[0];
    }

    /**
	 *	Add obj to the end of the list.
	 *	This method always returns true
	 */
	public boolean add(Object obj){
        Object[] newTemp = new Object[data.length + 1];
        for(int i = 0; i < data.length; i++){
            newTemp[i] = data[i];
        }
        newTemp[data.length] = obj;
        data = newTemp;
        return true;
    }
	
	/**
	 *	Add obj to the specified index of the list.
	 *	If index is too big, then add obj to the end of the list
	 *	If index is too small, then add obj to the start of the list
	 */
	public void add(int index, Object obj){
        Object[] newTemp = new Object[data.length + 1];
        boolean passed = false;
        if(index < 0){ index = 0; }
        if(index > data.length-1){ index = data.length - 1;}
        for(int i = 0; i < data.length; i++){
            if(i == index){
                newTemp[i] = obj;
                passed = true;
            }
            if(!passed){
                newTemp[i] = data[i];
            } else{
                newTemp[i + 1] = data[i];
            }
        }
        data = newTemp;
    }
	
	/**
	 *	Return true is this list contains something that is .equals() to obj
	 */
	public boolean contains(Object obj){
        for(Object i: data){
            if(i.equals(obj)){
                return true;
            }
        }
        return false;
    }
	
	/**
	 *	Return the Object located at the specified index
	 *	If index is too big or too small, return null
	 */
	public Object get(int index){
        if(index < 0 || index > data.length - 1){
            return null;
        }
        return data[index];
    }
	
	/**
	 *	Return true if there are no elements in the list
	 */
	public boolean isEmpty(){
        return data.length == 0;
    }
	
	/**
	 *	Remove the Object at the specified index from the list
	 *	Return the Object that was removed
	 *	If index is too big or to small, do not remove anything from the list and return null
	 *  If the list is empty, return null
	 */

    public Object remove (int index){
        //Check that index is in bounds 
        if (index < 0 || index >= data.length){
            return null;
        }

        // If the size is zero, return null
        if (data.length == 0){
            return null;
        }

        Object [] newArr = new Object [data.length -1];
        Object old = null;

        for (int i = 0; i < data. length; i++){
            if (i < index)
                newArr [i] = data[i];
            else if (i > index)
                newArr [i-1] = data[i];
            else
                old = data[i];
        }
        // found the item at index to remove I don't forget to save the new array as data
        data = newArr;
        return old;
    }
	
	
	/**
	 *	Remove the first Object that is .equals() to obj
	 *	Return true if an object was removed
	 */
	public boolean remove(Object obj){
        Object[] newTemp = new Object[data.length - 1];
        boolean passed = false;
        for(int i = 0; i < newTemp.length; i++){
            if(data[i] == obj){
                passed = true;
            }
            if(!passed){
                newTemp[i] = data[i];
            } else{
                newTemp[i] = data[i + 1];
            }
        }

        if(passed || newTemp.length == 0){
            data = newTemp;
            return true;  
        }
        
        return false;
    }
	
	/**
	 *	Change the value stored at index to obj
	 *	Return the value that was replaced
	 *	If index is too big or too smalll, do not change and values and return null
	 */
	public Object set(int index, Object obj){
        if(index < 0 || index >= data.length) return null;
        Object temp = data[index];
        data[index] = obj;
        return temp;
    }
	
	/**
	 *	Return the number of elements that are in the list
	 */
	public int size(){
        return data.length;
    }
}