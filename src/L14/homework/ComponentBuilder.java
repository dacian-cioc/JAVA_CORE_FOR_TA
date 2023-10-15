//Your job is to implement the simulation of an assembly line that will build Cars.
//Each Car is made up of several components: tires, seats, engine and frame. Each
//of these components takes a different amount of time to build on their own.
//Here’s the breakdown on the simulated time each component takes to construct:
//• Tire – 2 seconds
//• Seats – 3 seconds
//• Engine – 7 seconds
//• Frame – 5 seconds
//With these times, you must implement the code that will simulate the
//construction of each of these components individually, then once all the
//necessary components are built you must put them together to make a car. To
//build a car, you’ll need 4 tires, 5 seats, 1 engine and 1 frame.
//Here’s the catch… the assembly line can only and should only be capable of
//building 3 Components at any given time. You’ll need to implement this in your
//code.
//When the car is ready write the object to e file: car.ser

package L14.homework;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ComponentBuilder implements Callable<Component> {
    private Component component;

    public ComponentBuilder(Component component) {
        this.component = component;
    }

    @Override
    public Component call() throws Exception {
        TimeUnit.SECONDS.sleep(component.getBuildTime());
        return component;
    }
}
