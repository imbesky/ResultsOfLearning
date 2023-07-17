public class ObjectArray{
  private int count;
  private Object[] arr;
  public ObjectArray(){
    this(1);
  }
  public ObjectArray(int i){
    arr = new Object[i];
  }
  public void add(Object data){
    arr[count++] = data;
  }
  public Object get(int i){
    return arr[i];
  }
  public int size(){
    return count;
  }
}
