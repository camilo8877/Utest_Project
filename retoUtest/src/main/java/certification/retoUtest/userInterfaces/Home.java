package certification.retoUtest.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target REGISTER = Target.the("Register").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
