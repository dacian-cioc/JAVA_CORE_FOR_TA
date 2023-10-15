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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.*;

public class AssemblyLineSimulation {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        try {
            Future<Component> tireFuture = executorService.submit(new ComponentBuilder(new Component("Tire", 2)));
            Future<Component> seatsFuture = executorService.submit(new ComponentBuilder(new Component("Seats", 3)));
            Future<Component> engineFuture = executorService.submit(new ComponentBuilder(new Component("Engine", 7)));
            Future<Component> frameFuture = executorService.submit(new ComponentBuilder(new Component("Frame", 5)));

            // Wait for all components to be built
            Component tire = tireFuture.get();
            Component seats = seatsFuture.get();
            Component engine = engineFuture.get();
            Component frame = frameFuture.get();

            System.out.println("Built components: " + tire.getName() + ", " + seats.getName() + ", " +
                    engine.getName() + ", " + frame.getName());

            // Construct a car using the built components
            Car car = constructCar(tire, seats, engine, frame);
            System.out.println("Built car: " + car);

            // Serialize and write the car object to a file
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
                oos.writeObject(car);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static Car constructCar(Component tire, Component seats, Component engine, Component frame) {
        // You can implement your car construction logic here
        Car car = new Car();
        System.out.println("Building car: " + car);
        return car;
    }
}
