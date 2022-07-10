package certification.retoUtest.tasks;

import certification.retoUtest.userInterfaces.*;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Cristian").into(Personal.FIRSTNAME),
                SendKeys.of("Borja").into(Personal.LASTNAME),
                SendKeys.of("henryborja1@hotmail.com").into(Personal.EMAIL),
                SendKeys.of("August").into(Personal.MONTH),
                SendKeys.of("7").into(Personal.DAY),
                SendKeys.of("1991").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONLASTFINAL),
                SendKeys.of("RetoUtest88..").into(Complete.PASSWORD),
                SendKeys.of("RetoUtest88..").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)

        );
    }
    public static RegisterUserReto makeInformation(){
        return instrumented(RegisterUserReto.class);
    }
}
