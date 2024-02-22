package mypackage.test7;

public interface Drawable {
    public void draw();
    default void message (){
        System.out.println("Drawable interface");
    }


}
