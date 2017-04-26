package code;
/**
 * Created by Alvaro.Santuy on 26/04/2017.
 */
public class Alvaro {

    public boolean hungry = false;

    public boolean giveCookie(int number) {
        if (hungry) {
            hungry = false;
            return true;
        } else {
            return false;
        }
    }

}
