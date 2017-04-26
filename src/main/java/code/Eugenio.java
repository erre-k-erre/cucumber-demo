package code;

/**
 * Created by Alvaro.Santuy on 26/04/2017.
 */
public class Eugenio {

    public int numberOfCookies = 0;
    public Alvaro alvaro;

    public Eugenio(Alvaro alvaro) {
        this.alvaro = alvaro;
    }

    public void askForCookie() {
        if (numberOfCookies > 0) {
            numberOfCookies--;
            alvaro.giveCookie(1);
        }
    }

    public void giveCookie(int n) {
        if (numberOfCookies >= n) {
            if (alvaro.giveCookie(n)) {
                numberOfCookies -= n;
            }
        }
    }
}
